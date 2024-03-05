package es.neesis.id.injectors;

import es.neesis.id.consumer.Consumer;
import es.neesis.id.consumer.IConsumer;
import es.neesis.id.services.MailService;

public class MailServiceInjector implements IServiceInjector{

    @Override
    public IConsumer getConsumer() {
        return new Consumer(new MailService());
    }
}
