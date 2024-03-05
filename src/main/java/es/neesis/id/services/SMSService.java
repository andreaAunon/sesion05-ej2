package es.neesis.id.services;

public class SMSService implements IMessageService{

        @Override
        public void sendMail(String to, String subject, String body) {
            System.out.println("Sending SMS to " + to + " with subject " + subject + " and body " + body);
        }
}
