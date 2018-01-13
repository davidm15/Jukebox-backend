package at.fh.ima.swengs.jukeboxbackend.repository;

import at.fh.ima.swengs.jukeboxbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;

@RepositoryRestResource
@Transactional
public interface UserRepository extends JpaRepository<User, Integer> {

    public List<User> findAll();

}
