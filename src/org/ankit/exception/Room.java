package org.ankit.exception;

import java.io.*;
class Building1 
{  
	void color() throws IOException
	{
		  System.out.println("Blue");
	}  
}

class Room extends Building1
{
	  void color() throws IOException
	  {
		  System.out.println("Blue overrided by White");
	  }  
	  public static void main(String args[])
	  {  
		   Building1 obj = new Room();  
		   try{
		   obj.color();
		   }
		   catch(Exception e)
		   {
			   System.out.println("Error has Occured");
		   }
	  } 
}