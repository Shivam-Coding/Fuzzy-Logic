/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Data.Check;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shivamawasthi
 */
public class Try extends Check {
    
    
    public static void main(String[] args)
    {
      // Init u = Check.se();
      // u.setVisible(true);
        
        //Try T = new Try();
        //T.setR(8);
        double d[] = new double[2];
        List l = new ArrayList();
        for(int i = 0;i < 2; i++)
        {
        double s[] = new double[2];
        s[0] = 5;
        s[1] = 6;
        l.add(s);
        }
        
        Iterator r = l.iterator();
        while(r.hasNext())
        {
            d =(double[]) r.next();
            System.out.println(d[0]+"  '  "+d[1]);
        }
    }
    
    
}
