/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erenresortmvn.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author AB175103
 */
@Table
@Entity
public class vwgelen {
       @Id
    @SequenceGenerator(name = "vwgelen",sequenceName = "sq_vwgelen_id",
            allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "vwgelen")
    
    private int id;
    private String ad;
    private double fiyat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
    
    
}
