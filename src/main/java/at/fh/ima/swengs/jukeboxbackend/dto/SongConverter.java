package at.fh.ima.swengs.jukeboxbackend.dto;

import at.fh.ima.swengs.jukeboxbackend.model.Song;

public class SongConverter {

    public static Song convertToModel(SongDTO songDTO) {

        Song songModel = new Song();
        songModel.setId(songDTO.getId());
        songModel.setTitle(songDTO.getTitle());
        songModel.setArtist(songDTO.getArtist());
        songModel.setLength(songDTO.getLength());

        return songModel;
    }

    public static SongDTO convertToDTO(Song songModel) {

        SongDTO songDTO = new SongDTO();

        songDTO.setLength(songModel.getLength());
        songDTO.setArtist(songModel.getArtist());
        songDTO.setTitle(songModel.getTitle());
        songDTO.setId(songModel.getId());

        return songDTO;
    }
}
