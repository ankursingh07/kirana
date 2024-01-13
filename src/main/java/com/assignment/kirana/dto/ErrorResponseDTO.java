package com.assignment.kirana.dto;

import lombok.Builder;

@Builder
public record ErrorResponseDTO (

    String errorCode,
    String errorMessage,
    String clientErrorMessage
    ){
}
