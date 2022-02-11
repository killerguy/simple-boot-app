package spring.file.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import spring.file.exception.UserNotFoundException;
import spring.file.model.User;
import spring.file.service.UserService;

@RestController
public class UserController {

    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/user/{userId}")
    public User fetchUserDetails(@PathVariable int userId) throws UserNotFoundException {
        return userService.fetchUserDetails(userId);
    }
}
