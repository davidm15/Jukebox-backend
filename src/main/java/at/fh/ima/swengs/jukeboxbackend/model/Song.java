package at.fh.ima.swengs.jukeboxbackend.model;



import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "song")
public class Song{

    @Id
    @Column(name = "id")
    @JsonProperty
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @JsonProperty
    @Column(name = "title")
    private String title;

    @JsonIgnore
    @Column(name = "artist")
    private String artist;

    @JsonIgnore
    @Column(name = "length")
    private int length;

    public Song() { }

    public Song(String title, String artist, int length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Song song = (Song) o;

        if (id != song.id) return false;
        if (length != song.length) return false;
        if (!title.equals(song.title)) return false;
        return artist != null ? artist.equals(song.artist) : song.artist == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + title.hashCode();
        result = 31 * result + (artist != null ? artist.hashCode() : 0);
        result = 31 * result + length;
        return result;
    }
}
