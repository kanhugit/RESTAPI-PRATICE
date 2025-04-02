package in.ashokit.controller;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import in.ashokit.binding.User;

// REST Controller to handle API requests
@RestController
public class UserRestController {

    @GetMapping("/user")
    public ResponseEntity<User> getUser() {
        // Creating a User object
        User user = new User(101, "John", "john@gmail.com");

        // Returning response entity with the User object
        return new ResponseEntity<>(user,HttpStatus.OK);
    }
}
