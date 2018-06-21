/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erenresortmvn.Util;

import com.erenresortmvn.Models.tbllog;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import javax.swing.JOptionPane;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author vektorel
 */
public class vtIsletimcisi<T> implements Icrud<T>{
   
     Session ss;
     Transaction tt;
     logtakip logt = new logtakip();
     
     
     public void sessionAC(){
      ss = NewHibernateUtil.getSessionFactory().openSession();
      tt = ss.beginTransaction();
     }
     
     public void sessionKapat(){
     tt.commit();
     ss.close();
     }
    
     /**
      * 
      * @param t İlgili Pojo ile Çağırılan sınıflarda işlem yapar
      * @return işlem hatasız yapılır ise true döner işlemde hata olur ise loglama yaparak false değerini döndürür
      *         
      */
    @Override
    public boolean kaydet(T t) {
      try{
        sessionAC();
        ss.save(t);
        sessionKapat();
       // JOptionPane.showMessageDialog(null, "Kayıt Başarı İle Gerçekleşmiştir.");
         
        return true;
      }catch(Exception ex){
         tbllog log = new tbllog();
          log.setSinif(t.getClass().toString());
          log.setMethod("Kaydet");
          Date dt = new Date();
          log.setTarih(dt);
          log.setHataicerigi(ex.toString());
          logt.kayit(log); 
         JOptionPane.showMessageDialog(null, "Bir Hata oluşmuştur.Lütfen sistem yöneticinize Başvurunuz");
     
      return false;
      }
    }

    @Override
    public boolean duzenle(T t) {
      try{
        sessionAC();
        ss.update(t);
        sessionKapat();
        return true;
      }catch(Exception ex){
          tbllog log = new tbllog();
          log.setSinif(t.getClass().toString());
          log.setMethod("Düzenle");
          Date dt = new Date();
          log.setTarih(dt);
          log.setHataicerigi(ex.toString());
          logt.kayit(log);          
      return false;
      }
    }

    /**
     * 
     * @param t NOTTUR.. Sil id sini 0 a çekerek düzenlenecek.
     * @return 
     */
    @Override
    public boolean sil(T t) {
        try{
        sessionAC();
        ss.update(t);
        sessionKapat();
        return true;
        }catch(Exception ex){
          tbllog log = new tbllog();
          log.setSinif(t.getClass().toString());
          log.setMethod("Sil");
          Date dt = new Date();
          log.setTarih(dt);
          log.setHataicerigi(ex.toString());
          logt.kayit(log);    
        return false;
        }
    }
 
       
    @Override
    public List<T> listele(T t) {
        List<T> listem;
        try{
        sessionAC();
        Criteria cr = ss.createCriteria(t.getClass());
        listem = cr.list();
        sessionKapat();
        return listem;
        }catch(Exception ex){
              tbllog log = new tbllog();
          log.setSinif(t.getClass().toString());
          log.setMethod("Listele");
          Date dt = new Date();
          log.setTarih(dt);
          log.setHataicerigi(ex.toString());
          logt.kayit(log);    
        return null;
        }
        
    }

    @Override
    public T bul(int id, T t) {
         List<T> listem;
        try{
        sessionAC();
        Criteria cr = ss.createCriteria(t.getClass());
        cr.add(Restrictions.eq("id", id));
        listem = cr.list();
        sessionKapat();
        return (T)listem.get(0);
        }catch(Exception ex){
          tbllog log = new tbllog();
          log.setSinif(t.getClass().toString());
          log.setMethod("Bul");
          Date dt = new Date();
          log.setTarih(dt);
          log.setHataicerigi(ex.toString());
          logt.kayit(log);    
        return null;
        }
    }

    @Override
    public List<T> ara(String kolon, String deger, T t) {
         List<T> listem;
        try{
        sessionAC();
        Criteria cr = ss.createCriteria(t.getClass());
        cr.add(Restrictions.like(kolon, "%"+deger+"%"));
        listem = cr.list();
        sessionKapat();
        return listem;
        }catch(Exception ex){
              tbllog log = new tbllog();
          log.setSinif(t.getClass().toString());
          log.setMethod("Listele");
          Date dt = new Date();
          log.setTarih(dt);
          log.setHataicerigi(ex.toString());
          logt.kayit(log);    
        return null;
        }
    }

    @Override
    public List<T> ara(T t) {
         List<T> listem;
         Class tm = t.getClass();
         Field[] sl = tm.getDeclaredFields();
        try{
        sessionAC();
        Criteria cr = ss.createCriteria(t.getClass());
            for (int i = 0; i < sl.length; i++) {
                if(sl[i]!=null) 
                cr.add(Restrictions.like(sl[i].getName(), "%"+sl[i]+"%"));
            }
      
        listem = cr.list();
        sessionKapat();
        return listem;
        }catch(Exception ex){
              tbllog log = new tbllog();
          log.setSinif(t.getClass().toString());
          log.setMethod("Listele");
          Date dt = new Date();
          log.setTarih(dt);
          log.setHataicerigi(ex.toString());
          logt.kayit(log);    
        return null;
        }
    }
    
    
    
    
}
