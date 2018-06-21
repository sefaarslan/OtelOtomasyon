/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erenresortmvn.Dal;

import com.erenresortmvn.Models.tblpersonel;
import com.erenresortmvn.Util.vtIsletimcisi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author AB175103
 */
public class tblpersonelDAO extends vtIsletimcisi<tblpersonel>{
     public static boolean validate(String username,String password){
		boolean status=false;
		try{
			
		}catch(Exception e){System.out.println(e);}
		return status;
	}
}
