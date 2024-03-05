package es.neesis.annotations.services;

import org.springframework.stereotype.Service;

@Service
public class MailService implements IMailService{

        @Override
        public void sendMail(String to, String subject, String body) {
            System.out.println("Sending mail to: " + to);
            System.out.println("Subject: " + subject);
            System.out.println("Body: " + body);
        }
}
