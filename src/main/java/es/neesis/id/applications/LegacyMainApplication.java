package es.neesis.id.applications;

import es.neesis.id.services.MailService;

public class LegacyMainApplication {

    private MailService mailService = new MailService();

    public void sendMail(String to, String subject, String body) {
        mailService.sendMail(to, subject, body);
    }

}
