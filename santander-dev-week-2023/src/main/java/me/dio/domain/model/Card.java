package me.dio.domain.model;

import java.math.BigDecimal;

public class Card {
    private Long id;
    private String numer;
    private BigDecimal limit;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNumer() {
        return numer;
    }
    public void setNumer(String numer) {
        this.numer = numer;
    }
    public BigDecimal getLimit() {
        return limit;
    }
    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

    
    
}
