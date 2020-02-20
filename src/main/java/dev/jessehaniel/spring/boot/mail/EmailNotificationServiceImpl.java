package dev.jessehaniel.spring.boot.mail;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class EmailNotificationServiceImpl implements EmailNotificationService {
    
    private final JavaMailSender mailSender;
    
    @Override
    public void send(EmailRequest emailRequest) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(emailRequest.getReceiverMail());
        simpleMailMessage.setSubject(emailRequest.getSubject());
        simpleMailMessage.setText(emailRequest.getMessage());
        
        mailSender.send(simpleMailMessage);
    }
    
    @Override
    public void send(Request request) {
        if (request instanceof EmailRequest) {
            send((EmailRequest) request);
        } else {
            throw new UnsupportedOperationException();
        }
    }
}
