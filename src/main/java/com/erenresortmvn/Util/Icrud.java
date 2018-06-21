/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erenresortmvn.Util;

import java.util.List;

/**
 *
 * @author vektorel
 */
public interface Icrud<T> {
    
    public boolean kaydet(T t);
    public boolean duzenle(T t);
    public boolean sil(T t);
    public List<T> listele(T t);
    public T bul(int id, T t);
    public List<T> ara(String kolon,String deger,T t);
    public List<T> ara(T t);
}
