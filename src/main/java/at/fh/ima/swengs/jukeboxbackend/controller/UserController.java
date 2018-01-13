package at.fh.ima.swengs.jukeboxbackend.controller;

import at.fh.ima.swengs.jukeboxbackend.model.User;
import at.fh.ima.swengs.jukeboxbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController{

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = {"/","/listUsers"})
    public Object listUsers() {
        return userRepository.findAll();
    }

}
