package com.cfs.SB_Demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

 @Service
public class UserService {
    private static String API_KEY = "secret_key_123";  // Sonar: Hardcoded credentials
    private List<String> users = null;  // Sonar: Null initialization

    public String processUserData(String input) {
        if (input == null)  // Sonar: Null pointer dereference risk
            return input.toLowerCase();

        try {
            doSomething();
        } catch (Exception e) {
            e.printStackTrace();  // Sonar: Use proper logging
        }

        if (input.equals("admin"))  // Sonar: String literal on left side
            return input;

        return null;  // Sonar: Null return
    }

    private void doSomething() {
        users = new ArrayList<>();
        users = null;  // Sonar: Null assignment
    }
}
