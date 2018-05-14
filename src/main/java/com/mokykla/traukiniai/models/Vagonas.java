package com.mokykla.traukiniai.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Vagonas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String gamintojas;

    private Integer kiekis;

    private BigDecimal verte;

    private BigDecimal turis;

    public Vagonas(){

    }

    public Vagonas(long id, String gamintojas, Integer kiekis, BigDecimal verte, BigDecimal turis) {
        this.id = id;
        this.gamintojas = gamintojas;
        this.kiekis = kiekis;
        this.verte = verte;
        this.turis = turis;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGamintojas() {
        return gamintojas;
    }

    public void setGamintojas(String gamintojas) {
        this.gamintojas = gamintojas;
    }

    public Integer getKiekis() {
        return kiekis;
    }

    public void setKiekis(Integer kiekis) {
        this.kiekis = kiekis;
    }

    public BigDecimal getVerte() {
        return verte;
    }

    public void setVerte(BigDecimal verte) {
        this.verte = verte;
    }

    public BigDecimal getTuris() {
        return turis;
    }

    public void setTuris(BigDecimal turis) {
        this.turis = turis;
    }
}
