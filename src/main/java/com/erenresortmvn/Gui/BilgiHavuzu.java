/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erenresortmvn.Gui;

import com.erenresortmvn.Dal.tblfiyatDAO;
import com.erenresortmvn.Dal.tblmusteriDAO;
import com.erenresortmvn.Dal.tblodaDAO;
import com.erenresortmvn.Dal.tblozellikDAO;
import com.erenresortmvn.Dal.tblozellikatamaDAO;
import com.erenresortmvn.Dal.tblpersonelDAO;
import com.erenresortmvn.Dal.tblrezervasyonDAO;
import com.erenresortmvn.Models.tblfiyat;
import com.erenresortmvn.Models.tblmusteri;
import com.erenresortmvn.Models.tbloda;
import com.erenresortmvn.Models.tblozellik;
import com.erenresortmvn.Models.tblozellikatama;
import com.erenresortmvn.Models.tblpersonel;
import com.erenresortmvn.Models.tblrezervasyon;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author AB175103
 */
public class BilgiHavuzu {
    
    /**
     * 3 Adet Müşteri Eklenecektir.
     */
    public void musteriEkle(){
        tblmusteriDAO dbMust = new tblmusteriDAO();
        //Müşteri 1
        tblmusteri mst;
        mst = new tblmusteri();
        mst.setAd("Müşteri 1");
        mst.setSoyad("Soyad 1");
        mst.setAdres("Ankara");
        mst.setAciklama("Bilgi yok");
        mst.setCinsiyet("Erkek");
        mst.setEmail("musteri1@gmail.com");
        mst.setResimurl("musteri1.jpg");
        mst.setSifre("123");
        mst.setSilid(1);
        mst.setTckimlik("20000000001");
        dbMust.kaydet(mst);
        
        //Müşteri 2
        mst = new tblmusteri();
        mst.setAd("Müşteri 2");
        mst.setSoyad("Soyad 2");
        mst.setAdres("İstanbul");
        mst.setAciklama("Sorunlu");
        mst.setCinsiyet("Bayan");
        mst.setEmail("musteri2@gmail.com");
        mst.setResimurl("musteri2.jpg");
        mst.setSifre("123");
        mst.setSilid(1);
        mst.setTckimlik("20000000002");
        dbMust.kaydet(mst);
        
        
        //Müşteri 3
        mst = new tblmusteri();
        mst.setAd("Müşteri 3");
        mst.setSoyad("Soyad 3");
        mst.setAdres("İzmir");
        mst.setAciklama("Sorunlu");
        mst.setCinsiyet("Bayan");
        mst.setEmail("musteri3@gmail.com");
        mst.setResimurl("musteri3.jpg");
        mst.setSifre("123");
        mst.setSilid(1);
        mst.setTckimlik("20000000003");
        dbMust.kaydet(mst);
        
    }
    
    /**
     * 9 Adet Oda Eklenecektir 4 Kat vardır.
     */
    public void odaEkle(){
    
        tblodaDAO db = new tblodaDAO();
        tbloda od;
        // Oda 1
        od= new tbloda();
        od.setAd("101 Numaralı Oda");
        od.setDurumu("BOŞ");
        od.setKapasite(2);
        od.setKat("1. Kat");
        od.setSilid(1);
        db.kaydet(od);
        
        // Oda 2
        od= new tbloda();
        od.setAd("102 Numaralı Oda");
        od.setDurumu("BOŞ");
        od.setKapasite(2);
        od.setKat("1. Kat");
        od.setSilid(1);
        db.kaydet(od);
        
        // Oda 3
        od= new tbloda();
        od.setAd("103 Numaralı Aile Oda");
        od.setDurumu("BOŞ");
        od.setKapasite(4);
        od.setKat("1. Kat");
        od.setSilid(1);
        db.kaydet(od);
        
        // Oda 4
        od= new tbloda();
        od.setAd("201 Numaralı Oda");
        od.setDurumu("BOŞ");
        od.setKapasite(2);
        od.setKat("2. Kat");
        od.setSilid(1);
        db.kaydet(od);
        
        // Oda 5
        od= new tbloda();
        od.setAd("202 Numaralı Oda");
        od.setDurumu("BOŞ");
        od.setKapasite(3);
        od.setKat("2. Kat");
        od.setSilid(1);
        db.kaydet(od);
        
        // Oda 6
        od= new tbloda();
        od.setAd("301 Numaralı Oda");
        od.setDurumu("BOŞ");
        od.setKapasite(5);
        od.setKat("3. Kat");
        od.setSilid(1);
        db.kaydet(od);
        
        // Oda 7
        od= new tbloda();
        od.setAd("302 Numaralı Aile Oda");
        od.setDurumu("BOŞ");
        od.setKapasite(10);
        od.setKat("3. Kat");
        od.setSilid(1);
        db.kaydet(od);
        
        // Oda 8
        od= new tbloda();
        od.setAd("302 Numaralı Oda");
        od.setDurumu("BOŞ");
        od.setKapasite(2);
        od.setKat("3. Kat");
        od.setSilid(1);
        db.kaydet(od);
        
        // Oda 9
        od= new tbloda();
        od.setAd("401 Numaralı Kral Süit");
        od.setDurumu("BOŞ");
        od.setKapasite(99);
        od.setKat("4. Kat");
        od.setSilid(1);
        db.kaydet(od);
        
        
        
    }
    
    /**
     * 8 Adet Özellik Tanımlanmıştır.
     */
    public void ozellikEkle(){
        tblozellikDAO db = new tblozellikDAO();
        tblozellik oz;
        
        oz = new tblozellik();
        oz.setAd("Banyo");
        oz.setIcerik("Jakuzi");
        oz.setSilid(1);
        db.kaydet(oz);
        
        oz = new tblozellik();
        oz.setAd("Banyo");
        oz.setIcerik("DuşaKabin");
        oz.setSilid(1);
        db.kaydet(oz);
        
        oz = new tblozellik();
        oz.setAd("Yatak");
        oz.setIcerik("Tek Kişilik");
        oz.setSilid(1);
        db.kaydet(oz);
        
        oz = new tblozellik();
        oz.setAd("Yatak");
        oz.setIcerik("Çift Kişilik");
        oz.setSilid(1);
        db.kaydet(oz);
        
        oz = new tblozellik();
        oz.setAd("İnternet");
        oz.setIcerik("Yüksek hızlı internet hizmeti");
        oz.setSilid(1);
        db.kaydet(oz);
        
        oz = new tblozellik();
        oz.setAd("Yiyecek");
        oz.setIcerik("Mini Bar Hizmeti");
        oz.setSilid(1);
        db.kaydet(oz);
        
        oz = new tblozellik();
        oz.setAd("Deniz Manzaralı");
        oz.setIcerik("Cepheden tam açık olarak deniz görmektedir.");
        oz.setSilid(1);
        db.kaydet(oz);
        
        oz = new tblozellik();
        oz.setAd("Yan Deniz Manzaralı");
        oz.setIcerik("Çaprazdan deniz görmektedir.");
        oz.setSilid(1);
        db.kaydet(oz);
        
        
    }

    public void ozellikAtamaEkle(){
    
            tblozellikatamaDAO db = new tblozellikatamaDAO();
            tblozellikatama oa;
            
            oa=new tblozellikatama();
            oa.setOdaid(1);
            oa.setOzellikid(1);
            oa.setSilid(1);
            db.kaydet(oa);
            
            oa=new tblozellikatama();
            oa.setOdaid(1);
            oa.setOzellikid(3);
            oa.setSilid(1);
            db.kaydet(oa);
            
            oa=new tblozellikatama();
            oa.setOdaid(1);
            oa.setOzellikid(6);
            oa.setSilid(1);
            db.kaydet(oa);
            
            
            oa=new tblozellikatama();
            oa.setOdaid(2);
            oa.setOzellikid(1);
            oa.setSilid(1);
            db.kaydet(oa);
            
            oa=new tblozellikatama();
            oa.setOdaid(2);
            oa.setOzellikid(3);
            oa.setSilid(1);
            db.kaydet(oa);
            
            oa=new tblozellikatama();
            oa.setOdaid(2);
            oa.setOzellikid(5);
            oa.setSilid(1);
            db.kaydet(oa);
            
            oa=new tblozellikatama();
            oa.setOdaid(2);
            oa.setOzellikid(7);
            oa.setSilid(1);
            db.kaydet(oa);
            
            oa=new tblozellikatama();
            oa.setOdaid(3);
            oa.setOzellikid(1);
            oa.setSilid(1);
            db.kaydet(oa);
              
            oa=new tblozellikatama();
            oa.setOdaid(3);
            oa.setOzellikid(3);
            oa.setSilid(1);
            db.kaydet(oa);
              
                
            oa=new tblozellikatama();
            oa.setOdaid(3);
            oa.setOzellikid(5);
            oa.setSilid(1);
            db.kaydet(oa);
              
            
             oa=new tblozellikatama();
            oa.setOdaid(4);
            oa.setOzellikid(1);
            oa.setSilid(1);
            db.kaydet(oa);
              
            oa=new tblozellikatama();
            oa.setOdaid(4);
            oa.setOzellikid(3);
            oa.setSilid(1);
            db.kaydet(oa);
              
                
            oa=new tblozellikatama();
            oa.setOdaid(4);
            oa.setOzellikid(5);
            oa.setSilid(1);
            db.kaydet(oa);
            
            
             oa=new tblozellikatama();
            oa.setOdaid(5);
            oa.setOzellikid(1);
            oa.setSilid(1);
            db.kaydet(oa);
              
            oa=new tblozellikatama();
            oa.setOdaid(5);
            oa.setOzellikid(3);
            oa.setSilid(1);
            db.kaydet(oa);
              
                
            oa=new tblozellikatama();
            oa.setOdaid(5);
            oa.setOzellikid(5);
            oa.setSilid(1);
            db.kaydet(oa);
            
            
             oa=new tblozellikatama();
            oa.setOdaid(6);
            oa.setOzellikid(1);
            oa.setSilid(1);
            db.kaydet(oa);
              
            oa=new tblozellikatama();
            oa.setOdaid(6);
            oa.setOzellikid(3);
            oa.setSilid(1);
            db.kaydet(oa);
              
                
            oa=new tblozellikatama();
            oa.setOdaid(6);
            oa.setOzellikid(5);
            oa.setSilid(1);
            db.kaydet(oa);
            
            
             oa=new tblozellikatama();
            oa.setOdaid(7);
            oa.setOzellikid(1);
            oa.setSilid(1);
            db.kaydet(oa);
              
            oa=new tblozellikatama();
            oa.setOdaid(7);
            oa.setOzellikid(3);
            oa.setSilid(1);
            db.kaydet(oa);
              
                
            oa=new tblozellikatama();
            oa.setOdaid(7);
            oa.setOzellikid(5);
            oa.setSilid(1);
            db.kaydet(oa);
            
            
             oa=new tblozellikatama();
            oa.setOdaid(8);
            oa.setOzellikid(1);
            oa.setSilid(1);
            db.kaydet(oa);
              
            oa=new tblozellikatama();
            oa.setOdaid(8);
            oa.setOzellikid(3);
            oa.setSilid(1);
            db.kaydet(oa);
              
                
            oa=new tblozellikatama();
            oa.setOdaid(8);
            oa.setOzellikid(5);
            oa.setSilid(1);
            db.kaydet(oa);
            
            oa=new tblozellikatama();
            oa.setOdaid(8);
            oa.setOzellikid(7);
            oa.setSilid(1);
            db.kaydet(oa);
            
    }

    public void personelEkle(){
        tblpersonelDAO db = new tblpersonelDAO();
        
        tblpersonel pr;
        
        pr = new tblpersonel();
        pr.setAd("Persone 1");
        pr.setSoyad("P Soyad 1");
        pr.setAdres("Ankara");
        pr.setAciklama("Gündüz vardiyası personeli");
        pr.setEmail("pers@erenresort.com");
        pr.setResimurl("personel1.jpg");
        pr.setSifre("1");
        pr.setSilid(1);
        pr.setTckimlik("34343434343");
        pr.setTelefon("0 555 666 55 44");
        db.kaydet(pr);
        
        pr = new tblpersonel();
        pr.setAd("Persone 2");
        pr.setSoyad("P Soyad 2");
        pr.setAdres("İzmir");
        pr.setAciklama("Gece vardiyası personeli");
        pr.setEmail("pers2@erenresort.com");
        pr.setResimurl("personel2.jpg");
        pr.setSifre("1");
        pr.setSilid(1);
        pr.setTckimlik("34343434343");
        pr.setTelefon("0 555 666 55 44");
        db.kaydet(pr);
        
        
        pr = new tblpersonel();
        pr.setAd("Persone 3");
        pr.setSoyad("P Soyad 3");
        pr.setAdres("İstanbul");
        pr.setAciklama("Gündüz vardiyası personeli");
        pr.setEmail("pers3@erenresort.com");
        pr.setResimurl("personel3.jpg");
        pr.setSifre("1");
        pr.setSilid(1);
        pr.setTckimlik("34343434343");
        pr.setTelefon("0 555 666 55 44");
        db.kaydet(pr);
        
        
        
    }

    public void fiyatekle(){
        tblfiyatDAO db = new tblfiyatDAO();
        
        tblfiyat fy;
        
        fy = new tblfiyat();
        fy.setAdet(1);
        fy.setFiyat(45);
        fy.setIcerik("Bir gece için kış dönemi fiyatıdır");
        fy.setOdaid(1);
        fy.setSilid(1);
        db.kaydet(fy);
        
        fy = new tblfiyat();
        fy.setAdet(3);
        fy.setFiyat(100);
        fy.setIcerik("Bir gece için kış dönemi fiyatıdır");
        fy.setOdaid(1);
        fy.setSilid(1);
        db.kaydet(fy);
        
        fy = new tblfiyat();
        fy.setAdet(1);
        fy.setFiyat(105);
        fy.setIcerik("Bir gece için yaz dönemi fiyatıdır");
        fy.setOdaid(1);
        fy.setSilid(1);
        db.kaydet(fy);
        
        fy = new tblfiyat();
        fy.setAdet(3);
        fy.setFiyat(255);
        fy.setIcerik("Bir gece için yaz dönemi fiyatıdır");
        fy.setOdaid(1);
        fy.setSilid(1);
        db.kaydet(fy);
        
        //--------------------------------
        
        fy = new tblfiyat();
        fy.setAdet(1);
        fy.setFiyat(45);
        fy.setIcerik("Bir gece için kış dönemi fiyatıdır");
        fy.setOdaid(2);
        fy.setSilid(1);
        db.kaydet(fy);
        
        fy = new tblfiyat();
        fy.setAdet(3);
        fy.setFiyat(100);
        fy.setIcerik("Bir gece için kış dönemi fiyatıdır");
        fy.setOdaid(2);
        fy.setSilid(1);
        db.kaydet(fy);
        
        fy = new tblfiyat();
        fy.setAdet(1);
        fy.setFiyat(105);
        fy.setIcerik("Bir gece için yaz dönemi fiyatıdır");
        fy.setOdaid(2);
        fy.setSilid(1);
        db.kaydet(fy);
        
        fy = new tblfiyat();
        fy.setAdet(3);
        fy.setFiyat(255);
        fy.setIcerik("Bir gece için yaz dönemi fiyatıdır");
        fy.setOdaid(2);
        fy.setSilid(1);
        db.kaydet(fy);
   //-------------------------------------------------------------
        fy = new tblfiyat();
        fy.setAdet(1);
        fy.setFiyat(85);
        fy.setIcerik("Bir gece için kış dönemi fiyatıdır");
        fy.setOdaid(3);
        fy.setSilid(1);
        db.kaydet(fy);
        
        fy = new tblfiyat();
        fy.setAdet(4);
        fy.setFiyat(260);
        fy.setIcerik("Bir gece için kış dönemi fiyatıdır");
        fy.setOdaid(3);
        fy.setSilid(1);
        db.kaydet(fy);
        
        fy = new tblfiyat();
        fy.setAdet(1);
        fy.setFiyat(135);
        fy.setIcerik("Bir gece için yaz dönemi fiyatıdır");
        fy.setOdaid(3);
        fy.setSilid(1);
        db.kaydet(fy);
        
        fy = new tblfiyat();
        fy.setAdet(4);
        fy.setFiyat(405);
        fy.setIcerik("Bir gece için yaz dönemi fiyatıdır");
        fy.setOdaid(3);
        fy.setSilid(1);
        db.kaydet(fy);
        //---------------------------------------------------------
        fy = new tblfiyat();
        fy.setAdet(1);
        fy.setFiyat(45);
        fy.setIcerik("Bir gece için kış dönemi fiyatıdır");
        fy.setOdaid(4);
        fy.setSilid(1);
        db.kaydet(fy);
        
        fy = new tblfiyat();
        fy.setAdet(3);
        fy.setFiyat(100);
        fy.setIcerik("Bir gece için kış dönemi fiyatıdır");
        fy.setOdaid(4);
        fy.setSilid(1);
        db.kaydet(fy);
        
        fy = new tblfiyat();
        fy.setAdet(1);
        fy.setFiyat(105);
        fy.setIcerik("Bir gece için yaz dönemi fiyatıdır");
        fy.setOdaid(4);
        fy.setSilid(1);
        db.kaydet(fy);
        
        fy = new tblfiyat();
        fy.setAdet(3);
        fy.setFiyat(255);
        fy.setIcerik("Bir gece için yaz dönemi fiyatıdır");
        fy.setOdaid(4);
        fy.setSilid(1);
        db.kaydet(fy);
   //------------------------------------------------------------------
          fy = new tblfiyat();
        fy.setAdet(1);
        fy.setFiyat(45);
        fy.setIcerik("Bir gece için kış dönemi fiyatıdır");
        fy.setOdaid(5);
        fy.setSilid(1);
        db.kaydet(fy);
        
        fy = new tblfiyat();
        fy.setAdet(3);
        fy.setFiyat(100);
        fy.setIcerik("Bir gece için kış dönemi fiyatıdır");
        fy.setOdaid(5);
        fy.setSilid(1);
        db.kaydet(fy);
        
        fy = new tblfiyat();
        fy.setAdet(1);
        fy.setFiyat(105);
        fy.setIcerik("Bir gece için yaz dönemi fiyatıdır");
        fy.setOdaid(5);
        fy.setSilid(1);
        db.kaydet(fy);
        
        fy = new tblfiyat();
        fy.setAdet(3);
        fy.setFiyat(255);
        fy.setIcerik("Bir gece için yaz dönemi fiyatıdır");
        fy.setOdaid(5);
        fy.setSilid(1);
        db.kaydet(fy);
   //--------------------------------------------------------------
          fy = new tblfiyat();
        fy.setAdet(1);
        fy.setFiyat(95);
        fy.setIcerik("Bir gece için kış dönemi fiyatıdır");
        fy.setOdaid(6);
        fy.setSilid(1);
        db.kaydet(fy);
        
        fy = new tblfiyat();
        fy.setAdet(5);
        fy.setFiyat(390);
        fy.setIcerik("Bir gece için kış dönemi fiyatıdır");
        fy.setOdaid(6);
        fy.setSilid(1);
        db.kaydet(fy);
        
        fy = new tblfiyat();
        fy.setAdet(1);
        fy.setFiyat(185);
        fy.setIcerik("Bir gece için yaz dönemi fiyatıdır");
        fy.setOdaid(6);
        fy.setSilid(1);
        db.kaydet(fy);
        
        fy = new tblfiyat();
        fy.setAdet(5);
        fy.setFiyat(685);
        fy.setIcerik("Bir gece için yaz dönemi fiyatıdır");
        fy.setOdaid(6);
        fy.setSilid(1);
        db.kaydet(fy);
   //--------------------------------------------------------------
          fy = new tblfiyat();
        fy.setAdet(1);
        fy.setFiyat(45);
        fy.setIcerik("Bir gece için kış dönemi fiyatıdır");
        fy.setOdaid(7);
        fy.setSilid(1);
        db.kaydet(fy);
        
        fy = new tblfiyat();
        fy.setAdet(3);
        fy.setFiyat(100);
        fy.setIcerik("Bir gece için kış dönemi fiyatıdır");
        fy.setOdaid(7);
        fy.setSilid(1);
        db.kaydet(fy);
        
        fy = new tblfiyat();
        fy.setAdet(1);
        fy.setFiyat(105);
        fy.setIcerik("Bir gece için yaz dönemi fiyatıdır");
        fy.setOdaid(7);
        fy.setSilid(1);
        db.kaydet(fy);
        
        fy = new tblfiyat();
        fy.setAdet(3);
        fy.setFiyat(255);
        fy.setIcerik("Bir gece için yaz dönemi fiyatıdır");
        fy.setOdaid(7);
        fy.setSilid(1);
        db.kaydet(fy);
   //-----------------------------------------------------------
          fy = new tblfiyat();
        fy.setAdet(1);
        fy.setFiyat(45);
        fy.setIcerik("Bir gece için kış dönemi fiyatıdır");
        fy.setOdaid(8);
        fy.setSilid(1);
        db.kaydet(fy);
        
        fy = new tblfiyat();
        fy.setAdet(3);
        fy.setFiyat(100);
        fy.setIcerik("Bir gece için kış dönemi fiyatıdır");
        fy.setOdaid(8);
        fy.setSilid(1);
        db.kaydet(fy);
        
        fy = new tblfiyat();
        fy.setAdet(1);
        fy.setFiyat(105);
        fy.setIcerik("Bir gece için yaz dönemi fiyatıdır");
        fy.setOdaid(8);
        fy.setSilid(1);
        db.kaydet(fy);
        
        fy = new tblfiyat();
        fy.setAdet(3);
        fy.setFiyat(255);
        fy.setIcerik("Bir gece için yaz dönemi fiyatıdır");
        fy.setOdaid(8);
        fy.setSilid(1);
        db.kaydet(fy);
   //-----------------------------------------------------------
          fy = new tblfiyat();
        fy.setAdet(1);
        fy.setFiyat(450);
        fy.setIcerik("Bir gece için kış dönemi fiyatıdır");
        fy.setOdaid(9);
        fy.setSilid(1);
        db.kaydet(fy);
        
        fy = new tblfiyat();
        fy.setAdet(3);
        fy.setFiyat(1500);
        fy.setIcerik("Bir gece için kış dönemi fiyatıdır");
        fy.setOdaid(9);
        fy.setSilid(1);
        db.kaydet(fy);
        
        fy = new tblfiyat();
        fy.setAdet(1);
        fy.setFiyat(1015);
        fy.setIcerik("Bir gece için yaz dönemi fiyatıdır");
        fy.setOdaid(9);
        fy.setSilid(1);
        db.kaydet(fy);
        
        fy = new tblfiyat();
        fy.setAdet(3);
        fy.setFiyat(3600);
        fy.setIcerik("Bir gece için yaz dönemi fiyatıdır");
        fy.setOdaid(9);
        fy.setSilid(1);
        db.kaydet(fy);
   
                
    }

    public void rezervasyonEkle(){
        tblrezervasyonDAO db = new tblrezervasyonDAO();
        
        tblrezervasyon rz ;
        
        rz = new tblrezervasyon();
        rz.setMusteriid(1);
        rz.setPersonelid(2);
        rz.setAciklama("Pazartesi saat 15:30 da çıkış yapacak.");
        rz.setBirimfiyat(95d);
        rz.setCikistarihi(tarihver("18-05-2018"));
        rz.setGiristarihi(tarihver("13-05-2018"));
        rz.setGunsayisi(5);
        rz.setIndirimlifiyat(65d);
        rz.setKalankisisayisi(2);
        rz.setOdaid(3);
        rz.setRezervasyontarih(tarihver("09-05-2018"));
        rz.setToplamfiyat(130d);
        db.kaydet(rz);
        
        rz = new tblrezervasyon();
        rz.setMusteriid(3);
        rz.setPersonelid(3);
        rz.setAciklama("Pazartesi saat 17:30 da çıkış yapacak.");
        rz.setBirimfiyat(595d);
        rz.setCikistarihi(tarihver("18-04-2018"));
        rz.setGiristarihi(tarihver("13-03-2018"));
        rz.setGunsayisi(25);
        rz.setIndirimlifiyat(465d);
        rz.setKalankisisayisi(4);
        rz.setOdaid(9);
        rz.setRezervasyontarih(tarihver("01-02-2018"));
        rz.setToplamfiyat(11625d);
        db.kaydet(rz);
        
        rz = new tblrezervasyon();
        rz.setMusteriid(2);
        rz.setPersonelid(1);
        rz.setAciklama("Salı saat 15:30 da çıkış yapacak.");
        rz.setBirimfiyat(125d);
        rz.setCikistarihi(tarihver("08-01-2018"));
        rz.setGiristarihi(tarihver("13-01-2018"));
        rz.setGunsayisi(5);
        rz.setIndirimlifiyat(85d);
        rz.setKalankisisayisi(2);
        rz.setOdaid(7);
        rz.setRezervasyontarih(tarihver("09-05-2018"));
        rz.setToplamfiyat(425d);
        db.kaydet(rz);
        
        
        
        
    }
    
      public Date tarihver(String tarihsaat){
    Date date=null;
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
             try {

            date = formatter.parse(tarihsaat);
       
        } catch (ParseException e) {
            e.printStackTrace();
        }
             return date;
    }
}
