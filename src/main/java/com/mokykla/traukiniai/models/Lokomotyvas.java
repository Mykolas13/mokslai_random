package com.mokykla.traukiniai.models;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class Lokomotyvas extends Vagonas{

    public Lokomotyvas(long id, String gamintojas, Integer kiekis, BigDecimal verte, BigDecimal turis) {
        super(id, gamintojas, kiekis, verte, turis);
    }

    private String lokomotyvoTipas;

    public Lokomotyvas(String lokomotyvoTipas) {
        this.lokomotyvoTipas = lokomotyvoTipas;
    }

    public String getLokomotyvoTipas() {
        return lokomotyvoTipas;
    }

    public void setLokomotyvoTipas(String lokomotyvoTipas) {
        this.lokomotyvoTipas = lokomotyvoTipas;
    }

}
