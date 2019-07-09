package com.example.uygulamaajandam;

import java.io.Serializable;

public class Oyunlar implements Serializable {
    private String isim;
    private double fiyat;
    private String resim;
    private double oy;


    public Oyunlar(String isim, double fiyat, String resim, double oy) {
        this.isim = isim;
        this.fiyat = fiyat;
        this.resim = resim;
        this.oy = oy;
    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public String getResim() {
        return resim;
    }

    public void setResim(String resim) {
        this.resim = resim;
    }

    public double getOy() {
        return oy;
    }

    public void setOy(double oy) {
        this.oy = oy;
    }



}
