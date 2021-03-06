package com.erenresortmvn.Models;
// Generated 02.May.2018 11:26:57 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Tblodeme generated by hbm2java
 */
@Table
@Entity
public class tblodeme  implements java.io.Serializable {


     @Id
    @SequenceGenerator(name = "tblodemesq",sequenceName = "sq_tblodeme_id",
            allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "tblodemesq")
     private int id;
     private Integer musteriid;
     private Integer personelid;
     private String odemetipi;
     private Date tarih;
     private Double odenen;
     private Integer silid;

    public tblodeme() {
    }

	
    public tblodeme(int id) {
        this.id = id;
    }
    public tblodeme(int id, Integer musteriid, Integer personelid, String odemetipi, Date tarih, Double odenen, Integer silid) {
       this.id = id;
       this.musteriid = musteriid;
       this.personelid = personelid;
       this.odemetipi = odemetipi;
       this.tarih = tarih;
       this.odenen = odenen;
       this.silid = silid;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Integer getMusteriid() {
        return this.musteriid;
    }
    
    public void setMusteriid(Integer musteriid) {
        this.musteriid = musteriid;
    }
    public Integer getPersonelid() {
        return this.personelid;
    }
    
    public void setPersonelid(Integer personelid) {
        this.personelid = personelid;
    }
    public String getOdemetipi() {
        return this.odemetipi;
    }
    
    public void setOdemetipi(String odemetipi) {
        this.odemetipi = odemetipi;
    }
    public Date getTarih() {
        return this.tarih;
    }
    
    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }
    public Double getOdenen() {
        return this.odenen;
    }
    
    public void setOdenen(Double odenen) {
        this.odenen = odenen;
    }
    public Integer getSilid() {
        return this.silid;
    }
    
    public void setSilid(Integer silid) {
        this.silid = silid;
    }




}


