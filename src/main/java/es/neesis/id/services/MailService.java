package es.neesis.id.services;

public class MailService implements IMessageService {

    @Override
    public void sendMail(String to, String subject, String body) {
        System.out.println("Sending mail to " + to + " with subject " + subject + " and body " + body);
    }
}
