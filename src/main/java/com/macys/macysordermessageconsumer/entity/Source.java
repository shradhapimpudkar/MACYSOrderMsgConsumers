package com.macys.macysordermessageconsumer.entity;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Source implements Serializable {

    @Column(name = "clientID")
    public String clientID;

    @Column(name = "subClientID")
    public String subClientID;

    @Column(name = "sellingChannelCode")
    public String sellingChannelCode;

    @Column(name = "seperatorSource0")
    public int separatorSource0;

    @Column(name = "separatorSource1")
    public int separatorSource1;

    public Source() {
    }

    public Source(String clientID, String subClientID, String sellingChannelCode, int seperatorSource0, int seperatorSource1) {
        this.clientID = clientID;
        this.subClientID = subClientID;
        this.sellingChannelCode = sellingChannelCode;
        this.separatorSource0 = seperatorSource0;
        this.separatorSource1 = seperatorSource1;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getSubClientID() {
        return subClientID;
    }

    public void setSubClientID(String subClientID) {
        this.subClientID = subClientID;
    }

    public String getSellingChannelCode() {
        return sellingChannelCode;
    }

    public void setSellingChannelCode(String sellingChannelCode) {
        this.sellingChannelCode = sellingChannelCode;
    }

    public int getSeparatorSource0() {
        return separatorSource0;
    }

    public void setSeparatorSource0(int separatorSource0) {
        this.separatorSource0 = separatorSource0;
    }

    public int getSeparatorSource1() {
        return separatorSource1;
    }

    public void setSeparatorSource1(int separatorSource1) {
        this.separatorSource1 = separatorSource1;
    }

    @Override
    public String toString() {
        return "Source{" +
                "clientID='" + clientID + '\'' +
                ", subClientID='" + subClientID + '\'' +
                ", sellingChannelCode='" + sellingChannelCode + '\'' +
                ", separatorSource0=" + separatorSource0 +
                ", separatorSource1=" + separatorSource1 +
                '}';
    }
}