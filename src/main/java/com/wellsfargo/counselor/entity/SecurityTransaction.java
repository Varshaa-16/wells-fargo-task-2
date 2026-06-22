package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class SecurityTransaction {

    @Id
    @GeneratedValue()
    private long transactionId;

    @Column(nullable = false)
    private long portfolioSecurityId;

    @Column(nullable = false)
    private String transactionType;

    @Column(nullable = false)
    private String transactionDate;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private double pricePerUnit;

    protected SecurityTransaction() {
    }

    public SecurityTransaction(long portfolioSecurityId,
                               String transactionType,
                               String transactionDate,
                               int quantity,
                               double pricePerUnit) {
        this.portfolioSecurityId = portfolioSecurityId;
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public long getPortfolioSecurityId() {
        return portfolioSecurityId;
    }

    public void setPortfolioSecurityId(long portfolioSecurityId) {
        this.portfolioSecurityId = portfolioSecurityId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
}