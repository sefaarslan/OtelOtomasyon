/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erenresortmvn.Dal;

import com.erenresortmvn.Models.tblmusteri;
import com.erenresortmvn.Util.NewHibernateUtil;
import com.erenresortmvn.Util.vtIsletimcisi;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author AB175103
 */
public class tblmusteriDAO extends vtIsletimcisi<tblmusteri>{
 
    
    public List<tblmusteri> musteriAra(String tckimlik){
        List<tblmusteri> result=null;
        
        Session ss = NewHibernateUtil.getSessionFactory().openSession();
        Criteria cr = ss.createCriteria(tblmusteri.class);
        cr.add(Restrictions.like("tckimlik", "%"+tckimlik+"%"));
        result = cr.list();      
        return result;
    }
}
