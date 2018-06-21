/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erenresortmvn.Models;

import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author vektorel
 */
@Entity
@Table
public class tblkampanya {
    @Id
    @SequenceGenerator(name = "tblkamsq",sequenceName = "sq_tblkampanya_id",
            allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "tblkamsq")
  
    private long id;
    
    private long odaid;
    private int gunsayisi;
    private Date baslangictarihi;
    private Date bitistarihi;
    @Column(length = 255)
    private String baslik;
    @Column(length = 1255)
    private String icerik;
    @Column(length = 255)
    private String resimurl;
    private double fiyat;
    private Date yayintarihi;
    private Date iptaltarihi;
    private int silid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getOdaid() {
        return odaid;
    }

    public void setOdaid(long odaid) {
        this.odaid = odaid;
    }

    public int getGunsayisi() {
        return gunsayisi;
    }

    public void setGunsayisi(int gunsayisi) {
        this.gunsayisi = gunsayisi;
    }

    public Date getBaslangictarihi() {
        return baslangictarihi;
    }

    public void setBaslangictarihi(Date baslangictarihi) {
        this.baslangictarihi = baslangictarihi;
    }

    public Date getBitistarihi() {
        return bitistarihi;
    }

    public void setBitistarihi(Date bitistarihi) {
        this.bitistarihi = bitistarihi;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getIcerik() {
        return icerik;
    }

    public void setIcerik(String icerik) {
        this.icerik = icerik;
    }

    public String getResimurl() {
        return resimurl;
    }

    public void setResimurl(String resimurl) {
        this.resimurl = resimurl;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public Date getYayintarihi() {
        return yayintarihi;
    }

    public void setYayintarihi(Date yayintarihi) {
        this.yayintarihi = yayintarihi;
    }

    public Date getIptaltarihi() {
        return iptaltarihi;
    }

    public void setIptaltarihi(Date iptaltarihi) {
        this.iptaltarihi = iptaltarihi;
    }

    public int getSilid() {
        return silid;
    }

    public void setSilid(int silid) {
        this.silid = silid;
    }
    
            
            
            
            
}
