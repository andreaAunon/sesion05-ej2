package es.neesis.annotations.applications;

import es.neesis.annotations.services.MailService;
import org.springframework.stereotype.Component;

@Component
public class NewApplication {

    private MailService mailService;

    public void sendMail(String to, String subject, String body) {
        mailService = new MailService();
        mailService.sendMail(to, subject, body);
    }

}
