package com.example.demo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {

    private String src;
    private String dest;
    private BigDecimal amount;
    private String entityId;

    public Transaction(String src, String dest, BigDecimal amount, String entityId) {
        this.src = src;
        this.dest = dest;
        this.amount = amount;
        this.entityId = entityId;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }
}
