package com.vacatime.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

import javax.validation.constraints.NotBlank;

@Value
public class PaymentReqDto {

    @NotBlank
    private String payment;

    @JsonCreator
    public PaymentReqDto(@JsonProperty("payment") String payment) {
        this.payment = payment;
    }
}
