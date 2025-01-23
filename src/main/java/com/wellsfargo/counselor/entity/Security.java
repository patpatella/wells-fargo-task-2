package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    @ManyToOne
    @JoinColumn(name = "portfolioId", nullable = false)
    private Portfolio portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String purchasePrice;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private String quantity;

    protected Security() {

    }

    public Security(String firstName, String lastName, String address, String phone, String email, Portfolio portfolioId) {
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
        this.portfolioId = portfolioId;
    }

    public long getSecurityId() {
        return securityId;
    }

    public Portfolio getPortfolioId() {
        return portfolioId;
    }

    public String geName() {
        return name;
    }

    public void setName(String category) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(String address) {
        this.purchasePrice = purchasePrice;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String phone) {
        this.purchaseDate = purchaseDate;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String email) {
        this.quantity = quantity;
    }
}
