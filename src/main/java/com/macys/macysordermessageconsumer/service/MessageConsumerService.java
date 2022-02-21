package com.macys.macysordermessageconsumer.service;


import org.springframework.http.ResponseEntity;

import com.macys.macysordermessageconsumer.dto.FulfillmentOrder;
import com.macys.macysordermessageconsumer.dto.MessageJson;

import java.util.List;

public interface MessageConsumerService {
    ResponseEntity<List<FulfillmentOrder>> getXmlMessage();

    ResponseEntity<List<MessageJson>> getJsonMessage();
}
