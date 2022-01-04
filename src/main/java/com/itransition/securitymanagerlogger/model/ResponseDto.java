package com.itransition.securitymanagerlogger.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.itransition.securitymanagerlogger.model.dto.PublicationResponseDto;
import com.itransition.securitymanagerlogger.model.dto.UserResponseDto;


import java.io.Serializable;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME)
@JsonSubTypes({
        @JsonSubTypes.Type(name = "PUB", value = PublicationResponseDto.class),
        @JsonSubTypes.Type(name = "USER", value = UserResponseDto.class)})
public interface ResponseDto extends Serializable {
}
