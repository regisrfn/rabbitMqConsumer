package com.rufino.server.api;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqController {

    @RabbitListener(queues = "${sample.rabbitmq.queue}")
    public void recievedMessage(String incomingMessage) {
        System.out.println("Recieved Message From RabbitMQ: " + incomingMessage);

    }
}