/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erenresortmvn.Dal;

import com.erenresortmvn.Models.tblfiyat;
import com.erenresortmvn.Models.tbloda;
import com.erenresortmvn.Models.vwgelen;
import com.erenresortmvn.Util.NewHibernateUtil;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author AB175103
 */
public class tumSorguListesi {
    
    // Query qe = ss.createQuery("from tbloda");
    // qe.list();
    
    // addOrder(Order.asc("odano"));
    // eq-> eşitlik
    // ne-> not equal
    // lt-> lower than küçük ise
    // gt-> greater than büyük
    // le-> lower equal küçük eşit
    // ge-> greater equal büyük eşit
    // like-> arama
    // between-> iki değer arasındea
    // isNull-> tanımsız ise
    // isEmpty-> boş ise
    
    // and - or
    // Criteria cr = session.createCriteria(tbloda.class);
    //Criterion ad = Restrictions.gt("ad", "2%");
    //Criterion kat = Restrictions.ilike("kat","1%");
    //LogicalExpression orExp = Restrictions.or(ad, kat);
    //cr.add( orExp );

    //Sıralama
    //cr.addOrder(Order.asc(oda));
    
    //Native SQL
    //String sql = "SELECT * FROM EMPLOYEE";
    //SQLQuery query = session.createSQLQuery(sql);
    //query.addEntity(Employee.class);
    //List results = query.list();
  
    
    
    public static void main(String[] args) {
        
        Session ss = NewHibernateUtil.getSessionFactory().openSession();
        String sql ="select o.id, o.ad,f.fiyat from tbloda as o\n" +
                    "left join tblfiyat as f on f.odaid=o.id\n" +
                    "\n" +
                    "";
        SQLQuery qr = ss.createNativeQuery(sql);
        
        List<Object[]> liste = qr.list();
        ListIterator<Object[]> lt = liste.listIterator();
       
        while(lt.hasNext()){
        Object[] result = lt.next();
           // System.out.println("Tüm Liste...:"+ Arrays.toString(result));
            System.out.println("id....:"+ result[0]);
            System.out.println("id....:"+ result[1]);
            System.out.println("id....:"+ result[2]);
            
        }
        
    }
 
    
}
