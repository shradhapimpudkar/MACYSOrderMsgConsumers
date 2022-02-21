package com.macys.macysordermessageconsumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.macys.macysordermessageconsumer.entity.FulfillmentOrderEntity;

public interface XmlMessageRepository extends JpaRepository<FulfillmentOrderEntity, Integer> {
}