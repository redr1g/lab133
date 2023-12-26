package ucu.edu.ua.Task1;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class FacebookUser {
    private String userMail;
    private String country;
    private LocalDateTime lastActiveTime;
}
