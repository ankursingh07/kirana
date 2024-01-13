package com.assignment.kirana.external.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public record FxRatesGetResponse(
        @JsonProperty("success")
        Boolean success,
        @JsonProperty("terms")
        String terms,
        @JsonProperty("privacy")
        String privacy,
        @JsonProperty("timestamp")
        Integer timestamp,
        @JsonProperty("date")
        String date,
        @JsonProperty("base")
        String base,
        @JsonProperty("rates")
        RatesDTO rates
) {
}
