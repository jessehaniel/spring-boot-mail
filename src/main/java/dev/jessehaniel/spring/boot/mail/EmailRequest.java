package dev.jessehaniel.spring.boot.mail;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class EmailRequest extends Request {
    
    private String subject;
    private String message;
    private String receiverMail;
    
}
