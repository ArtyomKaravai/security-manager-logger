package com.itransition.securitymanagerlogger.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RabbitMqLogMessageDto implements Serializable {

    private String usersEmail;
    private String object;
    private String methodName;
}
