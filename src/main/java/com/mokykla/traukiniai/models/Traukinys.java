package com.mokykla.traukiniai.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Traukinys {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Integer pagaminimoData;

    private String pagaminusiImone;

    private String miestas;

    public Traukinys(){

    }

    @OneToMany
    private List<Vagonas> vagonai;

    public Traukinys(long id, Integer pagaminimoData, String pagaminusiImone, String miestas) {
        this.id = id;
        this.pagaminimoData = pagaminimoData;
        this.pagaminusiImone = pagaminusiImone;
        this.miestas = miestas;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getPagaminimoData() {
        return pagaminimoData;
    }

    public void setPagaminimoData(Integer pagaminimoData) {
        this.pagaminimoData = pagaminimoData;
    }

    public String getPagaminusiImone() {
        return pagaminusiImone;
    }

    public void setPagaminusiImone(String pagaminusiImone) {
        this.pagaminusiImone = pagaminusiImone;
    }

    public String getMiestas() {
        return miestas;
    }

    public void setMiestas(String miestas) {
        this.miestas = miestas;
    }

    public List<Vagonas> getVagonai() {
        return vagonai;
    }
}
