package com.erenresortmvn.Models;
// Generated 02.May.2018 11:26:57 by Hibernate Tools 4.3.1

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;




/**
 * Tblrezervasyonekkisi generated by hbm2java
 */
@Table
@Entity
public class tblrezervasyonekkisi  implements java.io.Serializable {

    @Id
    @SequenceGenerator(name = "tblrzeksq",sequenceName = "sq_tblrezek_id",
            allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "tblrzeksq")
     private int id;
     private Integer rezervasyonid;
     private String ad;
     private String soyad;
     private String tckimlik;
     private String cinsiyet;
     private String yakinlikdurumu;
     private String telefon;
     private Integer silid;

    public tblrezervasyonekkisi() {
    }

	
    public tblrezervasyonekkisi(int id) {
        this.id = id;
    }
    public tblrezervasyonekkisi(int id, Integer rezervasyonid, String ad, String soyad, String tckimlik, String cinsiyet, String yakinlikdurumu, String telefon, Integer silid) {
       this.id = id;
       this.rezervasyonid = rezervasyonid;
       this.ad = ad;
       this.soyad = soyad;
       this.tckimlik = tckimlik;
       this.cinsiyet = cinsiyet;
       this.yakinlikdurumu = yakinlikdurumu;
       this.telefon = telefon;
       this.silid = silid;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Integer getRezervasyonid() {
        return this.rezervasyonid;
    }
    
    public void setRezervasyonid(Integer rezervasyonid) {
        this.rezervasyonid = rezervasyonid;
    }
    public String getAd() {
        return this.ad;
    }
    
    public void setAd(String ad) {
        this.ad = ad;
    }
    public String getSoyad() {
        return this.soyad;
    }
    
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
    public String getTckimlik() {
        return this.tckimlik;
    }
    
    public void setTckimlik(String tckimlik) {
        this.tckimlik = tckimlik;
    }
    public String getCinsiyet() {
        return this.cinsiyet;
    }
    
    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }
    public String getYakinlikdurumu() {
        return this.yakinlikdurumu;
    }
    
    public void setYakinlikdurumu(String yakinlikdurumu) {
        this.yakinlikdurumu = yakinlikdurumu;
    }
    public String getTelefon() {
        return this.telefon;
    }
    
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    public Integer getSilid() {
        return this.silid;
    }
    
    public void setSilid(Integer silid) {
        this.silid = silid;
    }




}


