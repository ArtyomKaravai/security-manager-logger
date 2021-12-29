package com.itransition.securitymanagerlogger.rabbitmq.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@EnableRabbit
@Component
@Slf4j
public class RabbitMqListener {

    @RabbitListener(queues = "my.queue")
    public void processMyQueue(String message) {
        log.info(message);
    }
}
