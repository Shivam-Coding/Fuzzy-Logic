package Frames;
//import examples.Trail;
import src.examples.Tryy;
import src.generic.Input;
import src.generic.Output;
import src.generic.Tuple;
import src.intervalType2.sets.IntervalT2MF_Gauangle;
import src.intervalType2.sets.IntervalT2MF_Gaussian;
import src.intervalType2.sets.IntervalT2MF_Interface;
import src.intervalType2.sets.IntervalT2MF_Triangular;
import src.intervalType2.system.IT2_Rulebase;
import java.awt.Container;
import java.util.List;
import src.tools.JMathPlotter;
import src.type1.sets.T1MF_Gauangle;
import src.type1.sets.T1MF_Gaussian;
import src.type1.sets.T1MF_Interface;
import src.type1.sets.T1MF_Triangular;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shivamawasthi
 */
public class Preview {
    
    Container g =null, cs = null; 
    
    private void plotMFs(String name, IntervalT2MF_Interface[] sets, int discretizationLevel,boolean o)
    {
        JMathPlotter plotter = new JMathPlotter(12,12,10);
        plotter.previewPlotMF(sets[0].getName(), sets[0], discretizationLevel, null, false,o);
       
        for (int i=1;i<sets.length;i++)
        {
            plotter.previewPlotMF(sets[i].getName(), sets[i], discretizationLevel, null, false,o);
        }
        //plotter.show(name);
        
        
           
        
        g = plotter.graph();
    
       
    }
    
    
    public static void main(String[] agrs)
    {
        T1MF_Triangular badFoodUMF = new T1MF_Triangular("Upper MF for bad food",0.0, 0.0, 10.0);
        T1MF_Triangular badFoodLMF = new T1MF_Triangular("Lower MF for bad food",0.0, 0.0, 8.0);
        IntervalT2MF_Triangular badFoodMF = new IntervalT2MF_Triangular("IT2MF for bad food",badFoodUMF,badFoodLMF);
        
         T1MF_Triangular greatFoodUMF = new T1MF_Triangular("Upper MF for great food",0.0, 10.0, 10.0);
        T1MF_Triangular greatFoodLMF = new T1MF_Triangular("Lower MF for great food",2.0, 10.0, 10.0);
        IntervalT2MF_Triangular greatFoodMF = new IntervalT2MF_Triangular("IT2MF for great food",greatFoodUMF,greatFoodLMF);
        
        
       Input food = new Input("Food Quality", new Tuple(0,10));
        
      Preview t = new Preview();
                t.plotMFs("Food Quality Membership Functions", new IntervalT2MF_Interface[]{badFoodMF}, 100,true); 
   
        int r = 4;        
       int a[] = new int[r];
                System.out.println(a.length);
    Tryy u = new Tryy();
    
    
    }
    
    
    public Container graph(String input, double a, double b, String membership_Function, String n,double[] mfv,boolean o)
    {
        
        
        Input in = new Input(input, new Tuple(a,b));
        
        if(membership_Function.equals("Triangular"))
        {
             T1MF_Triangular umf,lmf;
            umf = new T1MF_Triangular("Upper MF for "+n+" "+input, mfv[0], mfv[1], mfv[2]);
            lmf = new T1MF_Triangular("Lower MF for "+n+" "+input, mfv[3], mfv[4], mfv[5]);
            IntervalT2MF_Triangular IT2MF = new IntervalT2MF_Triangular("IT2MF for "+n+" "+input,umf,lmf);
            plotMFs("", new IntervalT2MF_Interface[]{IT2MF}, 100, o);
           
        }else
            if(membership_Function.equals("Gauangle"))
            {
                T1MF_Gauangle umf, lmf;
                umf = new T1MF_Gauangle("Upper MF for "+n+" "+input, mfv[0], mfv[1], mfv[2]);
                lmf = new T1MF_Gauangle("Lower MF for "+n+" "+input, mfv[3], mfv[4], mfv[5]);
               IntervalT2MF_Gauangle IT2MF = new IntervalT2MF_Gauangle("IT2MF for "+n+" "+input,umf,lmf);
               plotMFs("", new IntervalT2MF_Interface[]{IT2MF}, 100, o);
            }else
                if(membership_Function.equals("Gaussian"))
                {
                    T1MF_Gaussian umf,lmf;
                    umf = new T1MF_Gaussian("Upper MF for "+n+" "+input, mfv[0], mfv[1]);
                    lmf = new T1MF_Gaussian("Lower MF for "+n+" "+input, mfv[3], mfv[4]);
                    IntervalT2MF_Gaussian IT2MF = new IntervalT2MF_Gaussian("IT2MF for "+n+" "+input,umf,lmf);
                    plotMFs("", new IntervalT2MF_Interface[]{IT2MF}, 100, o);
                }
        
         
        return g;
        
    }
    
        public Container plotCtrlSurface(boolean useCentroidDefuzzification, int input1Discs, int input2Discs, List val, double[] outRange, String outVar, IT2_Rulebase rulebase1)
    {
        int size = val.size();
        double output;
        double[] x = new double[input1Discs];
        double[] y = new double[input2Discs];
        double[][] z = new double[y.length][x.length];
        double incrX, incrY;
        incrX = ((Input)val.get(0)).getDomain().getSize()/(input1Discs-1.0);
        incrY = ((Input)val.get(1)).getDomain().getSize()/(input2Discs-1.0);

        //first, get the values
        for(int currentX=0; currentX<input1Discs; currentX++)
        {
            x[currentX] = currentX * incrX;        
        }
        for(int currentY=0; currentY<input2Discs; currentY++)
        {
            y[currentY] = currentY * incrY;
        }
        
        for(int currentX=0; currentX<input1Discs; currentX++)
        {
            ((Input)val.get(0)).setInput(x[currentX]);
            for(int currentY=0; currentY<input2Discs; currentY++)
            {//System.out.println("Current x = "+currentX+"  current y = "+currentY);
                ((Input)val.get(1)).setInput(y[currentY]);
                if(useCentroidDefuzzification)
                    output = rulebase1.evaluate(1).get((Output)val.get(size-1));
                else
                    output = rulebase1.evaluate(0).get((Output)val.get(size-1));
                z[currentY][currentX] = output;
            }    
        }
        
        //now do the plotting
        JMathPlotter plotter = new JMathPlotter();
        plotter.plotControlSurface("Control Surface",
                new String[]{((Input)val.get(0)).getName(), ((Input)val.get(1)).getName(), outVar}, x, y, z, new Tuple(outRange[0], outRange[1]), true); 
        //plotter.show("Interval Type-2 Fuzzy Logic System Control Surface for Tipping Example");
        return plotter.graph();
    }
    
        
    
    
    
}

    
    

