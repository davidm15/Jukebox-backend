package at.fh.ima.swengs.jukeboxbackend.repository;

import at.fh.ima.swengs.jukeboxbackend.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.transaction.Transactional;

@RepositoryRestResource
@Transactional
public interface SongRepository extends JpaRepository<Song, Integer> {


}
