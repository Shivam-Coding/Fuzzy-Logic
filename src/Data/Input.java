/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Frames.Try;
import java.util.*;

/**
 *
 * @author shivamawasthi
 */
public class Input extends Try {
    
    
    
    
    
    public static void main(String args[])
    {
        
        List ls = new ArrayList();
         
        ls.add("a");
        ls.add("s");
        ls.add("r");
        ls.add("p");
        ls.add("n");
        System.out.println((String)ls.get(2)+" element at 2");
       Iterator ir = ls.iterator();
        while(ir.hasNext())
        {
            System.out.println(ir.next());
        }
        ls.remove(2);
        System.out.println((String)ls.get(2)+" element at 2");
        
 /*  
      if(Check.se()==null)
      {
          System.out.println("Doesn't exist  ");
      }
      else
      {
          System.out.println("Already exist  ");
      }
        
        */
        
       // Check u = new Check();
        
       // System.out.println(getR());
        
        
    }
    
}
