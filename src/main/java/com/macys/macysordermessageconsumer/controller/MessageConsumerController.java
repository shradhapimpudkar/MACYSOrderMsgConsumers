package com.macys.macysordermessageconsumer.controller;

import com.macys.macysordermessageconsumer.dto.FulfillmentOrder;
import com.macys.macysordermessageconsumer.dto.MessageJson;
import com.macys.macysordermessageconsumer.service.MessageConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orderConsumer")
public class MessageConsumerController {

    @Autowired
    MessageConsumerService messageService;
    @GetMapping(value = "/json",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    ResponseEntity<List<MessageJson>> getJsonMessage() {
        return messageService.getJsonMessage();
    }

    @GetMapping(value = "/xml",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    ResponseEntity<List<FulfillmentOrder>> getXmlMessage() {
        return messageService.getXmlMessage();
    }  
}
