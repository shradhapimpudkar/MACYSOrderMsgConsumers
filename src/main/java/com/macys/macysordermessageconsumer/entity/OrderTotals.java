package com.macys.macysordermessageconsumer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrderTotals implements Serializable {

    @Column(name = "totalPurchaseAmount")
    public double totalPurchaseAmount;

    @Column(name = "seperatorOrderTotals0")
    public int separatorOrderTotals0;

    public OrderTotals() {
    }

    public double getTotalPurchaseAmount() {
        return totalPurchaseAmount;
    }

    public void setTotalPurchaseAmount(double totalPurchaseAmount) {
        this.totalPurchaseAmount = totalPurchaseAmount;
    }

    public int getSeparatorOrderTotals0() {
        return separatorOrderTotals0;
    }

    public void setSeparatorOrderTotals0(int separatorOrderTotals0) {
        this.separatorOrderTotals0 = separatorOrderTotals0;
    }

    @Override
    public String toString() {
        return "OrderTotals{" +
                "totalPurchaseAmount=" + totalPurchaseAmount +
                ", separatorOrderTotals0=" + separatorOrderTotals0 +
                '}';
    }
}