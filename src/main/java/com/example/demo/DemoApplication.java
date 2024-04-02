
import org.springframework.beans.factory.annotation.Autowired;
import com.example.Service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import com.example.config.FirebaseConfig;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import javax.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class DemoApplication {

    private final UserService userService;

    public DemoApplication() {
        userService = new UserService();
    }

    @PostConstruct
    public void init() {
        userService.addUser("ANvippro", "abcxyz04");
    }
    public static void main(String[] args) {
        DemoApplication app = new DemoApplication();
        app.init();
    }
}


