package dev.jessehaniel.spring.boot.mail;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootMailApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(SpringBootMailApplication.class, args);
    }
    
    @Bean
    CommandLineRunner init(EmailNotificationService emailNotificationService) {
        return args -> {
            EmailRequest emailRequest = EmailRequest.builder()
                .receiverMail("")//fake e-mail
                .subject("Test application")
                .message("This is an e-mail sent from my study project for Spring Boot Email API")
                .build();
            emailNotificationService.send(emailRequest);
        };
    }
    
}
