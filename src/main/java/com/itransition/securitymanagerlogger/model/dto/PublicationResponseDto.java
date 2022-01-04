package com.itransition.securitymanagerlogger.model.dto;

import com.itransition.securitymanagerlogger.model.ResponseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublicationResponseDto implements ResponseDto {

    private String text;
    private UserResponseDto author;
}
