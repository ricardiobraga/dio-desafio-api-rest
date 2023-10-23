package me.dio.desafioaoirest.model;

import java.math.BigDecimal;

public class Account {
    
    private Long id;
    private String number;
    private String agency;
    private BigDecimal balace;
    private BigDecimal limit;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getAgency() {
        return agency;
    }
    public void setAgency(String agency) {
        this.agency = agency;
    }
    public BigDecimal getBalace() {
        return balace;
    }
    public void setBalace(BigDecimal balace) {
        this.balace = balace;
    }
    public BigDecimal getLimit() {
        return limit;
    }
    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

    
}
