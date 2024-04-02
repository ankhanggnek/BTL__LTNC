package com.example.Service;
import com.google.firebase.database.DatabaseReference;
import com.example.config.FirebaseConfig;
import com.google.firebase.database.FirebaseDatabase;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class UserService {
    private final DatabaseReference database;

    @Autowired
    private FirebaseConfig firebaseConfig;

    public UserService() {

        database = FirebaseDatabase.getInstance().getReference("users");
    }

    @PostConstruct
    public void init() {
        firebaseConfig.initialize();
    }
    public void addUser(String username, String password) {
        User user = new User();
        user.setName(username);
        user.setPassword(password);
        database.child(username).setValueAsync(user);
    }
}

class User {
    private String password;
    private String name;

    // getters and setters
    public String getPass() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
