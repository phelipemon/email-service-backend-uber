package dev.phelipemon.email_service.application;

import dev.phelipemon.email_service.adapters.EmailSenderGateway;
import dev.phelipemon.email_service.core.cases.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService implements EmailSenderUseCase {

    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService (EmailSenderGateway emailSenderGateway){
        this.emailSenderGateway = emailSenderGateway;
    };


    @Override
    public void sendEmail(String to, String subject, String body) {
        this.emailSenderGateway.sendEmail(to, subject, body);
    }
}
