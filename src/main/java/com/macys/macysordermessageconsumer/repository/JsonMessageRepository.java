package com.macys.macysordermessageconsumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.macys.macysordermessageconsumer.entity.MessageJsonEntity;

public interface JsonMessageRepository extends JpaRepository<MessageJsonEntity, Integer> {
}