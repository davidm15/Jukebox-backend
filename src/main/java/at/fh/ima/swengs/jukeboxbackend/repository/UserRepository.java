package at.fh.ima.swengs.jukeboxbackend.repository;

import at.fh.ima.swengs.jukeboxbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.transaction.Transactional;
import java.util.List;

@RepositoryRestResource
@Transactional
public interface UserRepository extends JpaRepository<User, Long> {

    public List<User> findAll();
    public List<User> findByUsernameAndFirstnameAndLastnameAndEmail(@Param("username") String username, @Param("firstname") String firstname, @Param("lastname") String lastname, @Param("email") String email);

}
