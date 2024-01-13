package com.assignment.kirana.service;

import com.assignment.kirana.external.api.FxRatesApi;
import com.assignment.kirana.persistence.repository.OrdersRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static com.assignment.kirana.helper.OrdersServiceHelper.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class OrdersServiceTest {

    @InjectMocks
    OrdersService ordersService;

    @Mock
    OrdersRepository ordersRepository;

    @Mock
    FxRatesApi fxRatesApi;

    @Test
    void addOrder() {
        when(ordersRepository.save(any())).thenReturn(getMockedOrdersEntity());
        when(fxRatesApi.conversionGet()).thenReturn(null);
        long orderId = ordersService.addOrder(getMockedOrderDTO());
        assertEquals(orderId , 7);
    }

}
