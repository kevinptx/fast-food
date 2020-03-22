package com.galvanize.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.galvanize.dto.OrderRequest;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class OrderControllerTest {


    @Autowired
    MockMvc mvc;


    @Autowired
    ObjectMapper objectMapper;

    //CREATE


    @Test
    public void testPostOrder() throws Exception {
        //Setup
        String customerName = "Hungry Man Jr";
        String description = "Burger, double meat, extra pickles, doughnut buns, diet coke";
        OrderRequest orderRequest = new OrderRequest(customerName, description);
        String url = "/api/orders";
        //Exercise
        ResultActions resultActions = mvc.perform(post(url)
                .content(objectMapper.writeValueAsString(orderRequest))
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .accept(MediaType.APPLICATION_JSON_VALUE)
        )
                .andDo(print())
                .andExpect(status().isOk());
        MvcResult result = resultActions.andReturn();
        String contentAsString = result.getResponse().getContentAsString();
        //List<Order> orders = Arrays.asList(objectMapper.readValue(contentAsString, Order[].class));
        //Assert
        //assertEquals(expected, actual);
        //Teardown
    }


    //READ

    
    @Test
    public void testGetAllOrders() throws Exception {
        //Setup
        String url = "/api/orders";
        //Exercise
        ResultActions resultActions = mvc.perform(get(url))
                .andDo(print())
                .andExpect(status().isOk());
        MvcResult result = resultActions.andReturn();
        String contentAsString = result.getResponse().getContentAsString();
        //List<Order> orders = Arrays.asList(objectMapper.readValue(contentAsString, Order[].class));
        //Assert
        //assertEquals(expected, actual);
        //Teardown
    }



}