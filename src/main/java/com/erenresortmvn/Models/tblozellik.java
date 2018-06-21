package com.erenresortmvn.Models;
// Generated 02.May.2018 11:26:57 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;




/**
 * Tblozellik generated by hbm2java
 */
@Table
@Entity
public class tblozellik  implements java.io.Serializable {


     @Id
    @SequenceGenerator(name = "tblozelliksq",sequenceName = "sq_tbloozellik_id",
            allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "tblozelliksq")
     private int id;
     private String ad;
     @Column(length = 500)
     private String icerik;
     private Integer silid;

    public tblozellik() {
    }

	
    public tblozellik(int id) {
        this.id = id;
    }
    public tblozellik(int id, String ad, String icerik, Integer silid) {
       this.id = id;
       this.ad = ad;
       this.icerik = icerik;
       this.silid = silid;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getAd() {
        return this.ad;
    }
    
    public void setAd(String ad) {
        this.ad = ad;
    }
    public String getIcerik() {
        return this.icerik;
    }
    
    public void setIcerik(String icerik) {
        this.icerik = icerik;
    }
    public Integer getSilid() {
        return this.silid;
    }
    
    public void setSilid(Integer silid) {
        this.silid = silid;
    }




}


