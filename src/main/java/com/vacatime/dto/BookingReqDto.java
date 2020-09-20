package com.vacatime.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.NonNull;
import lombok.Value;

import javax.validation.constraints.Min;
import java.time.LocalDate;

@Value
public class BookingReqDto {

    @Min(1)
    private long packageId;

    @Min(1)
    private long customerId;

    @NonNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;


}
