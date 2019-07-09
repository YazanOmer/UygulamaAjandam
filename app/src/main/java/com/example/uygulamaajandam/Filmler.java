package com.example.uygulamaajandam;

import java.io.Serializable;

public class Filmler implements Serializable {
    private String isim;
    private String resim;
    private double fiyat;


    public Filmler(String isim, double fiyat,String resim) {
        this.isim = isim;
        this.fiyat = fiyat;
        this.resim = resim;
    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getResim() {
        return resim;
    }

    public void setResim(String resim) {
        this.resim = resim;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
}
