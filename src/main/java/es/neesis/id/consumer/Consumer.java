package es.neesis.id.consumer;

import es.neesis.id.services.IMessageService;

public class Consumer implements IConsumer{

            private IMessageService service;

            public Consumer(IMessageService svc){
                this.service=svc;
            }

            @Override
            public void processMessages(String to, String subject, String body) {
                this.service.sendMail(to, subject, body);
            }
}
