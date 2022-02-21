package com.macys.macysordermessageconsumer.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.io.Serializable;

public class BillingAddress implements Serializable {

    @JacksonXmlProperty(localName = "contact")
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