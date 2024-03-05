package es.neesis.annotations.services;

public interface IMailService {

    void sendMail(String to, String subject, String body);

}
