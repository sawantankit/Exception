//In this example class TestException is overriding the method color(). 
//The overridden method is not throwing any exception however the overriding method is throwing an unchecked exception (NullPointerException).
//Upon compilation code ran successfully.


package org.ankit.exception;


class Building {  
	   void color()
	   {
	       System.out.println("Blue");
	   }  
	}
	class TestException extends Building{
	   //It throws an unchecked exception
	   void color() throws NullPointerException
	   {
	       System.out.println("White");
	   }  
	   public static void main(String args[]){  
	       Building obj = new TestException();  
	       obj.color(); 
	   } 
	}