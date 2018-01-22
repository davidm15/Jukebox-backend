package at.fh.ima.swengs.jukeboxbackend.model;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "all" , types = Song.class)
public interface SongProjection {
    Long getId();
    String getTitle();
    String getArtist();
    int getLength();
    User getUser();
}