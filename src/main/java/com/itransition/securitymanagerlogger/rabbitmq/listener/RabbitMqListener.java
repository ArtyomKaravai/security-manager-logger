package com.itransition.securitymanagerlogger.rabbitmq.listener;

import com.itransition.securitymanagerlogger.model.dto.RabbitMqLogMessageDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@EnableRabbit
@Component
@Slf4j
public class RabbitMqListener {

    @RabbitListener(queues = "${spring.rabbitmq.queueName}")
    public void processMyQueue(RabbitMqLogMessageDto dto) {
        log.info(dto.toString());
    }
}
