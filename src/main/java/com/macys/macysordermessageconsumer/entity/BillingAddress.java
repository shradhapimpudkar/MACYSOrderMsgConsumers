package com.macys.macysordermessageconsumer.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.io.Serializable;

@Embeddable
public class BillingAddress implements Serializable {

    @Embedded
    public Contact contact;

    public BillingAddress() {

    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "BillingAddress{" +
                "contact=" + contact +
                '}';
    }
}