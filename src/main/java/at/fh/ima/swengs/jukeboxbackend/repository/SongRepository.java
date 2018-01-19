package at.fh.ima.swengs.jukeboxbackend.repository;

import at.fh.ima.swengs.jukeboxbackend.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RepositoryRestResource
public interface SongRepository extends JpaRepository<Song, Long> {

    @Transactional
    //public List<Song> findById (int id);
    //@GetMapping(value="/findByTitleAndArtist/{title}{artist}")
    public List<Song> findByTitleAndArtist(@Param("title") String title,@Param("artist") String artist);
    public List<Song> findByTitleOrArtist(@Param("title") String title,@Param("artist") String artist);
    public List<Song> findByArtist(String artist);
    public List<Song> findByLength(int length);
    public List<Song> findByUploader_Username(@Param("username") String username);
    public List<Song> findAll();

    public Song findById(int id);
    //public Song findByTitleAndArtist(@Param("title") String title,@Param("artist") String artist);
}
