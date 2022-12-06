package singletonDesignPattern;

public class A {

	 private static A obj=new A();
	 private A(){}  
	   
	 public static A getA(){  
	  return obj;  
	 }  
	  
	 public void doSomething(){  
	 System.out.println("bridgelabz");
	 }  
	
}
