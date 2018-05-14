package com.mokykla.traukiniai.models;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class Krovininis extends Vagonas{

    public Krovininis(long id, String gamintojas, Integer kiekis, BigDecimal verte, BigDecimal turis) {
        super(id, gamintojas, kiekis, verte, turis);
    }

private Integer kelemojiGalia;

    public Krovininis(Integer kelemojiGalia) {
        this.kelemojiGalia = kelemojiGalia;
    }

    public Integer getKelemojiGalia() {
        return kelemojiGalia;
    }

    public void setKelemojiGalia(Integer kelemojiGalia) {
        this.kelemojiGalia = kelemojiGalia;
    }

    public Krovininis(){

    }

}
