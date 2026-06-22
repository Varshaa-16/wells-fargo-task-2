package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class PortfolioSecurity {

    @Id
    @GeneratedValue()
    private long portfolioSecurityId;

    @Column(nullable = false)
    private long portfolioId;

    @Column(nullable = false)
    private long securityId;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private double purchasePrice;

    @Column(nullable = false)
    private String purchaseDate;

    protected PortfolioSecurity() {
    }

    public PortfolioSecurity(long portfolioId, long securityId,
                             int quantity, double purchasePrice,
                             String purchaseDate) {
        this.portfolioId = portfolioId;
        this.securityId = securityId;
        this.quantity = quantity;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
    }

    public Long getPortfolioSecurityId() {
        return portfolioSecurityId;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public long getSecurityId() {
        return securityId;
    }

    public void setSecurityId(long securityId) {
        this.securityId = securityId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}