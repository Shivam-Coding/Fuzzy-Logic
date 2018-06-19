/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package src.examples;

import src.generic.Input;
import src.generic.Tuple;
//import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import src.tools.JMathPlotter;
import src.type1.sets.T1MF_Interface;
import src.type1.sets.T1MF_Triangular;

/**
 *
 * @author shivamawasthi
 */
public class Trail {
    
    
    Container g =null; 
    
    private void plotMFs(String name, T1MF_Interface[] sets, Tuple xAxisRange, int discretizationLevel)
    {
        JMathPlotter plotter = new JMathPlotter(17,17,15);
        for (int i=0;i<sets.length;i++)
        {
            plotter.plotMF(sets[i].getName(), sets[i], discretizationLevel, xAxisRange, new Tuple(0.0,1.0), false);
        }
        //plotter.show(name);
        
        g = plotter.graph();
        g.setPreferredSize(new Dimension(418, 323));
    }
    
    
    public static void main(String[] agrs)
    {
         T1MF_Triangular badFoodMF = new T1MF_Triangular("MF for bad food",0.0, 0.0, 10.0);
        T1MF_Triangular greatFoodMF = new T1MF_Triangular("MF for great food",0.0, 10.0, 10.0);
        
       Input food = new Input("Food Quality", new Tuple(0,10));
        
       Trail t = new Trail();
                t.plotMFs("Food Quality Membership Functions", new T1MF_Interface[]{badFoodMF}, food.getDomain(), 100); 
   
        int r = 4;        
       int a[] = new int[r];
                System.out.println(a.length);
    Tryy u = new Tryy();
    u.dis(t.g);
    
    }
    
    
}
