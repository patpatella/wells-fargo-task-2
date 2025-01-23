package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
//import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Portfolio {

        @Id
        @GeneratedValue()
        private long portfolioId;

        @Column(nullable = false)
        @ManyToOne
        @JoinColumn(name = "clientId", nullable = false)
        private Client clientId;

        @Column(nullable = false)
        private String creationDate;


        protected Portfolio() {

        }

        public Portfolio(String creationDate, Client clientId) {
            this.creationDate = creationDate;
            this.clientId = clientId;
        }

        public long getPortfolioId() {return portfolioId;}

        public Client getClientId() {
            return clientId;
        }

        public String getCreationDate() {
            return creationDate;
        }

        public void setCreationDate(String address) {
        this.creationDate = creationDate;
    }

    }
