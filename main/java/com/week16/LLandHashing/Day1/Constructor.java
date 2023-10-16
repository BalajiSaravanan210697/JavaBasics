package com.week16.LLandHashing.Day1;

import org.junit.Test;

public class Constructor {
	
  //constructor is Special method 
	/* 1.Constructor not have any return type
     2.it's a gateway to any variable access through the class
     3.whenever the constructor is initialized it's runs first later only the other executions will
     4.if we didn't create a constructor default constructor will created in JVM
     5.Constructor utilize the heap memory to store
     */ 

	public Constructor() {
		System.out.println("This is a constructor");
	}
	public static void main(String[] args) {
		Constructor obj = new Constructor(); 
		int type = 12;
		System.out.println(type);
	}
	
}
