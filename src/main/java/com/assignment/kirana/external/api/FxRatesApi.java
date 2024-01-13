package com.assignment.kirana.external.api;

import com.assignment.kirana.external.dto.FxRatesGetResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@FeignClient(name = "fx-rates-service", url = "https://api.fxratesapi.com/latest")
public interface FxRatesApi {

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    FxRatesGetResponse conversionGet();
}
