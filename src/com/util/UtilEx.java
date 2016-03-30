package com.util;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class UtilEx {
	
	//read properties from file
     static void readProp() 
     {
    	 
    	 FileInputStream in=null;
	  try {
		 in=new FileInputStream("C:\\Users\\ctsuser1\\Desktop\\MyProperties.properties");
		 Properties prop=new Properties();
		 try {
			prop.load(in);
			String s=prop.getProperty("username");
			System.out.println("Get the Username:"+s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
			
     }

     public static void main(String[] args)
     {
    	 UtilEx.readProp();
     }
     }

