package org.ankit.exception;

class TryCatchException{
	
  public static void main(String args[]){
  try{
   int data=50/0;
   System.out.println(data);
  }
  catch(ArithmeticException e)
{
System.out.println(" Math Error Occured");
}
 
  catch(Exception e)
{
System.out.println("Some Error Has Occured");
}
 
  finally
{
System.out.println("finally block is always executed");
}
 
  System.out.println("rest of the code...");
  }
}
