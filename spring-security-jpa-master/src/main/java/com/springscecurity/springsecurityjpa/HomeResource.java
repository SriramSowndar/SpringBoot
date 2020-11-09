package io.javabrains.springsecurityjpa;

import io.javabrains.springsecurityjpa.models.User2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeResource {

    @Autowired
    UserRepository2 userRepository2;

    @GetMapping("/admin/all")
    public List<User2> getAll() {
        return userRepository2.findAll();
    }

    @PostMapping(value = "/admin/load")
    public List<User2> persist(@RequestBody final User2 user2) {
        userRepository2.save(user2);
        return userRepository2.findAll();
    }
}

