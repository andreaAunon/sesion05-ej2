package es.neesis.id.applications;

import es.neesis.id.consumer.IConsumer;
import es.neesis.id.injectors.SMSServiceInjector;
import es.neesis.id.injectors.IServiceInjector;
import es.neesis.id.injectors.MailServiceInjector;

public class InjectorMainApplication {

    public void sendMail(String to, String subject, String body) {
        IServiceInjector injector = null;
        IConsumer app = null;

        // Send email
        injector = new MailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(to, subject, body);

        // Send SMS
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessages(to, subject, body);
    }

}
