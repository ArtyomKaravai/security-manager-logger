package com.itransition.securitymanagerlogger.model.dto;

import com.itransition.securitymanagerlogger.model.Action;
import com.itransition.securitymanagerlogger.model.ResponseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RabbitMqLogMessageDto implements Serializable {

    private String usersEmail;
    private ResponseDto object;
    private Action action;
}
