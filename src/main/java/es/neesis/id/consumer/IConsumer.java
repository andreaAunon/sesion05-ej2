package es.neesis.id.consumer;

public interface IConsumer {

        void processMessages(String to, String subject, String body);

}
