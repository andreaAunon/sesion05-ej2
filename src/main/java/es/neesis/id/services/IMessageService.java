package es.neesis.id.services;

public interface IMessageService {

    void sendMail(String to, String subject, String body);

}
