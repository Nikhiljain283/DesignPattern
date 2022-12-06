package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {

    public static void main(String args[]) throws Exception
    {
     
        Test obj = new Test();
  
      
        Class cls = obj.getClass();
        System.out.println("The name of class is "
                           + cls.getName());
  
    
        Constructor constructor = cls.getConstructor();
        System.out.println("The name of constructor is "
                           + constructor.getName());
  
        
        
        Method[] methods = cls.getMethods();
  
        // Printing method names
        for (Method method : methods)
            System.out.println(method.getName());
  
    
  
       
        Method methodcall3
            = cls.getDeclaredMethod("method3");
  
        methodcall3.setAccessible(true);
        methodcall3.invoke(obj);
    }
	
}
