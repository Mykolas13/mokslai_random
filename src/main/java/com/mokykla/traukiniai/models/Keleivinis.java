package com.mokykla.traukiniai.models;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class Keleivinis extends Vagonas{

    public Keleivinis(long id, String gamintojas, Integer kiekis, BigDecimal verte, BigDecimal turis) {
        super(id, gamintojas, kiekis, verte, turis);
    }

    private Integer klase;

    public Keleivinis(Integer klase) {
        this.klase = klase;
    }

    public Integer getKlase() {
        return klase;
    }

    public void setKlase(Integer klase) {
        this.klase = klase;
    }

    public Keleivinis(){

    }

}
