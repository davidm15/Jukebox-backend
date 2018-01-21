package at.fh.ima.swengs.jukeboxbackend.model;



import javax.persistence.*;

@Entity
@Table(name = "song")
public class Song{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title", nullable = false, length = 30)
    private String title;

    @Column(name = "artist", nullable = false, length = 50)
    private String artist;

    @Column(name = "length", nullable = false, length = 3)
    private int length;

    @ManyToOne
    private User user;

    @Version
    long version;

    public Song() { }

    public Song(String title, String artist, int length, User user) {
        super();
        this.title = title;
        this.artist = artist;
        this.length = length;
        this.user = user;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
