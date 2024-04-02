package com.example.config;
import com.google.firebase.database.DatabaseReference;
import com.example.Service.UserService;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;
import java.io.FileInputStream;
import java.io.IOException;
import com.google.firebase.database.FirebaseDatabase;

@Configuration
public class FirebaseConfig {

    @PostConstruct
    public void initialize() {
        try {
            FileInputStream serviceAccount = new FileInputStream("./fir-class-84bf5-firebase-adminsdk-1kjo3-3848445e6f.json");
            FirebaseOptions options = FirebaseOptions.builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl("https://console.firebase.google.com/u/0/project/fir-class-84bf5/authentication/users")
                    .build();

            FirebaseApp.initializeApp(options);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void saveUser(User user) {
        DatabaseReference ref = FirebaseDatabase.getInstance()
                .getReference("users");
        ref.child(user.getId()).setValueAsync(user);
    }
}

class User {
    private String id;
    private String name;

    // getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}