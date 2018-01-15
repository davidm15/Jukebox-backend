package at.fh.ima.swengs.jukeboxbackend.controller;

import at.fh.ima.swengs.jukeboxbackend.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class SongController{

    @Autowired
    SongRepository songRepository;

    @RequestMapping(value = {"/","/listSongs"})
    public Object listSongs() {
        return songRepository.findAll();
    }

}
