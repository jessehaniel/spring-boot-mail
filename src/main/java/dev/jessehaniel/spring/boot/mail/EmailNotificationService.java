package dev.jessehaniel.spring.boot.mail;

import org.springframework.stereotype.Service;

@Service
public interface EmailNotificationService extends NotificationService {
    
    void send(EmailRequest emailRequest);
}
