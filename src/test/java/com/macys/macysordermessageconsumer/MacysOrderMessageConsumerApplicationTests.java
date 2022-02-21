package com.macys.macysordermessageconsumer;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.macys.macysordermessageconsumer.controller.MessageConsumerController;
import com.macys.macysordermessageconsumer.dto.FulfillmentOrder;
import com.macys.macysordermessageconsumer.dto.MessageJson;
import com.macys.macysordermessageconsumer.service.MessageConsumerService;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class MacysOrderMessageConsumerApplicationTests {

	@Autowired
	private MockMvc mvc;

	@MockBean
	MessageConsumerService service;

	@MockBean
	MessageConsumerController controller;

	@Mock
	FulfillmentOrder fulfillmentOrder;

	@Mock
	MessageJson orderMessageJson;

	@Test
	void testControllerNotNull() {
		Assertions.assertNotNull(controller);
	}

	@Test
	void testServiceConsumeXmlMessage() throws Exception {

		given(service.getXmlMessage())
				.willReturn(new ResponseEntity<>(Collections.singletonList(fulfillmentOrder), HttpStatus.OK));

		MvcResult result = mvc.perform(get("/orderConsumer/xml").contentType(MediaType.APPLICATION_XML_VALUE)
				.accept(MediaType.APPLICATION_XML_VALUE)).andDo(print()).andExpect(status().isOk()).andReturn();
		Assertions.assertNotNull(result.getResponse());
	}

	@Test
	void testServiceConsumeJsonMessage() throws Exception {

		given(service.getJsonMessage())
				.willReturn(new ResponseEntity<>(Collections.singletonList(orderMessageJson), HttpStatus.OK));

		MvcResult result = mvc
				.perform(get("/orderConsumer/json").contentType(MediaType.APPLICATION_JSON_VALUE)
						.accept(MediaType.APPLICATION_JSON_VALUE))
				.andDo(print()).andExpect(status().isOk()).andReturn();
		Assertions.assertNotNull(result.getResponse());
	}

}
