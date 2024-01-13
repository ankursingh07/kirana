package com.assignment.kirana.controllers;

import com.assignment.kirana.dto.OrdersDTO;
import com.assignment.kirana.service.OrdersService;
import com.assignment.kirana.web.controllers.OrdersController;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static com.assignment.kirana.helper.OrdersServiceHelper.getMockedOrderDTO;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(value = OrdersController.class)
public class OrdersControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    OrdersService ordersService;

    @Test
    void addOrder() throws Exception {
        when(ordersService.addOrder(any())).thenReturn(7L);

        OrdersDTO request = getMockedOrderDTO();

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
        ObjectWriter objectWriter = objectMapper.writer().withDefaultPrettyPrinter();
        String requestJSON = objectWriter.writeValueAsString(request);

        mockMvc.perform(post("/order/insert")
                .contentType(MediaType.APPLICATION_JSON)
                .content(requestJSON))
                .andDo(print())
                .andExpect(status().isOk());
    }
}
