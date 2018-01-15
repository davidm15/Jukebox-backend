package at.fh.ima.swengs.jukeboxbackend.controller;

import at.fh.ima.swengs.jukeboxbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController{

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/listUsers")
    public Object listUsers() {
        return userRepository.findAll();
    }

}
