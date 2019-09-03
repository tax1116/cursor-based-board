package kr.flab.ht.project.controller;

import kr.flab.ht.project.model.User;
import kr.flab.ht.project.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable("id") Long id) {
        return userService.getUser(id);
    }

    @PostMapping("/users")
    public ResponseEntity signUp(@RequestBody User user) {
        if (user == null || user.getName() == null || user.getAddr() == null) {
            LOGGER.error("잘못된 요청입니다 : {}", user);
            throw new IllegalArgumentException("잘못된 요청입니다.");
        }

        userService.signUp(user);

        return new ResponseEntity(HttpStatus.CREATED);
    }
}
