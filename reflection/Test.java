package reflection;

public class Test {

	   // creating a private field
    private String s;
  
    // Constructor of this class
  
    // Constructor 1
    // Public constructor
    public Test() { s = "constructor 1"; }
  

    public void method1()
    {
        System.out.println("The string is " + s);
    }
  
  
    public void method2(int n)
    {
        System.out.println("The number is " + n);
    }
  
    
    private void method3()
    {
        System.out.println("Private method invoked");
    }
	
}
