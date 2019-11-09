package com.module2;

class base
{  
base() 
{  System.out.println("In the base class..");
  test(); 
} 

void test() 
{  System.out.println("in the test function...");
  base b1 = new base();
 }
}  
public class test1 
{ 
public static void main (String args[]) 
{    
base b1 = new base();     
}   
}