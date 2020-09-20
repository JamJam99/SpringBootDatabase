package com.vacatime.dto;

import lombok.Value;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Value
public class CustomerReqDto {

    @NotBlank
    @Size(min = 3)
    private String username;

    @Email
    @NotBlank
    @Size(min = 3)
    private String email;

    @NotBlank
    @Size(min = 6)
    private String password;
}
