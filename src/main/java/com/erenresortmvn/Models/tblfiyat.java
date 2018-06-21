/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erenresortmvn.Models;

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
public class tblfiyat {
    @Id
    @SequenceGenerator(name = "tblsq",sequenceName = "sq_tblfiyat_id",
            allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "tblsq")
    private long id;
    
    private long odaid;
    
    private double fiyat;
    
    @Column(length = 1000)
    private String icerik;
    
    private int adet;
    
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

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public String getIcerik() {
        return icerik;
    }

    public void setIcerik(String icerik) {
        this.icerik = icerik;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public int getSilid() {
        return silid;
    }

    public void setSilid(int silid) {
        this.silid = silid;
    }
    
    
            
}
