package peoplecert.service;

import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

@Service
public class HomeService {
    
    public String getWelcomeMessage(){
        String message = "Welcome to our Pizza Application.";
        return message;
    }
    
    public String getApplicationName(){
        return "Application Name: Pizza Project";
    }
}
