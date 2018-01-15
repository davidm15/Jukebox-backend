package at.fh.ima.swengs.jukeboxbackend.controller;

import at.fh.ima.swengs.jukeboxbackend.dto.SongConverter;
import at.fh.ima.swengs.jukeboxbackend.dto.SongDTO;
import at.fh.ima.swengs.jukeboxbackend.model.Song;
import at.fh.ima.swengs.jukeboxbackend.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class SongController{

    @Autowired
    SongRepository songRepository;

    @RequestMapping(value = "/listSongs")
    public Object listSongs() {
        return songRepository.findAll();
    }

    @RequestMapping(value = "/song/", method = RequestMethod.GET)
    public ResponseEntity<List<Song>> listAllSongs(){
        List<Song> songs = songRepository.findAll();
        if (songs.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Song>>(songs, HttpStatus.OK);
    }

    @RequestMapping(value = "/song/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getSong(@PathVariable("id") int id) {
        //logger.info("Fetching User with id {}", id);
        Song song = songRepository.findOne(id);
        if (song == null) {
            //logger.error("User with id {} not found.", id);
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Song>(song, HttpStatus.OK);
    }

    @RequestMapping(value = "/createSong", method = RequestMethod.POST)
    public ResponseEntity<SongDTO> createSong(@RequestBody SongDTO songDTO, UriComponentsBuilder ucBuilder) {

        Song songModel = SongConverter.convertToModel(songDTO);

        songRepository.save(songModel);

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/song/{id}").buildAndExpand(songModel.getId()).toUri());
        return new ResponseEntity<SongDTO>(headers, HttpStatus.CREATED);
    }


}
