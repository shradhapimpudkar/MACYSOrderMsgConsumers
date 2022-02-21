package com.macys.macysordermessageconsumer.utils;

import com.macys.macysordermessageconsumer.dto.FulfillmentOrder;
import com.macys.macysordermessageconsumer.dto.MessageJson;
import com.macys.macysordermessageconsumer.entity.FulfillmentOrderEntity;
import com.macys.macysordermessageconsumer.entity.MessageJsonEntity;

import org.modelmapper.ModelMapper;

public class EntityPojoConverterUtil {

	public static MessageJson jsonEntityToPojo(ModelMapper modelMapper,
			MessageJsonEntity orderMessageJsonEntity) {
		return modelMapper.map(orderMessageJsonEntity, MessageJson.class);
	}

	public static MessageJsonEntity jsonPojoToEntity(ModelMapper modelMapper, MessageJson orderMessageJson) {
		return modelMapper.map(orderMessageJson, MessageJsonEntity.class);
	}

	public static FulfillmentOrderEntity xmlPojoToEntity(ModelMapper modelMapper, FulfillmentOrder fulfillmentOrder) {
		return modelMapper.map(fulfillmentOrder, FulfillmentOrderEntity.class);
	}

	public static FulfillmentOrder xmlEntityToPojo(ModelMapper modelMapper,
			FulfillmentOrderEntity fulfillmentOrderEntity) {
		return modelMapper.map(fulfillmentOrderEntity, FulfillmentOrder.class);
	}
}
