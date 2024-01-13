package com.assignment.kirana.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record OrdersDTO(
        @NotNull(message = "Buyer name can't be null") String buyer,
        @NotNull(message = "Item name can't be null") String item,
        @NotNull(message = "numberOfItems can't be null") long numberOfItems,
        @NotNull(message = "costOfSingleItem can't be null") double costOfSingleItem,
        @NotNull(message = "Currency can't be null") String currency
) {
}
