package com.itransition.securitymanagerlogger.model.dto;

import com.itransition.securitymanagerlogger.model.ResponseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDto implements ResponseDto {

    private String email;
    private String firstName;
    private String lastName;
}
