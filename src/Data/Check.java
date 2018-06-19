/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Frames.Init;

/**
 *
 * @author shivamawasthi
 */
public class Check {
    
   static int r;  

    public static int getR() {
        return r;
    }

    public void setR(int r) {
        Check.r = r;
       
    }
    static Init i;
      
    
     public static Init se()
     {
         System.out.println("static called....."+i);
         
         if(i==null)
         { 
         System.out.println("in if......");
          i= new Init();
         //i.setVisible(true);
         }
         
         return i;
         
     }
     
     
     
    
    
}
