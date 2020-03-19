package br.com.spring.stream;

import org.springframework.stereotype.Component;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

@Component
public class RestProducer {

    public boolean sendMessageProduct(Product payload, RestSource restSource){
        Message<Product> message = MessageBuilder.withPayload(payload).build();
        boolean success = restSource.sendMessage().send(message);
        return success;
    }
}
