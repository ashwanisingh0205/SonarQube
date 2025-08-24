package com.cfs.SB_Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired  // Sonar: Field injection should be avoided
    private UserService userService;

    public static String CONSTANT = new String("test");  // Sonar: Inefficient String instantiation

    @GetMapping("/users/{input}")
    public ResponseEntity<?> getUser(@PathVariable String input) {
        if (input == null || input.equals(""))  // Sonar: Empty string check
            return null;  // Sonar: Return null ResponseEntity

        String result = userService.processUserData(input);
        System.out.println("Processing: " + result);  // Sonar: System.out usage

        return ResponseEntity.ok(result);
    }
}