package com.example.uygulamaajandam;

import java.io.Serializable;

public class Bilgiler implements Serializable {

    private String kullaniciAdi;
    private String sifre;
    private String mail;





    public Bilgiler(String kullaniciAdi, String sifre, String mail) {



            this.kullaniciAdi = kullaniciAdi;
            this.sifre = sifre;
            this.mail = mail;




    }


    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi =kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre =sifre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail =mail;
    }
}
