package com.assignment.kirana.dto;

import jakarta.validation.constraints.NotNull;

import java.sql.Date;

public record DateInBetweenDTO(
        @NotNull(message = "From Date can't be null") Date from,
        @NotNull(message = "To Date can't be null") Date to
) {
}
