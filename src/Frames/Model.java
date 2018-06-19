/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import src.generic.Input;
import src.generic.Output;
import src.generic.Tuple;
import src.intervalType2.sets.IntervalT2MF_Gauangle;
import src.intervalType2.sets.IntervalT2MF_Gaussian;
import src.intervalType2.sets.IntervalT2MF_Triangular;
import src.intervalType2.system.IT2_Antecedent;
import src.intervalType2.system.IT2_Consequent;
import src.intervalType2.system.IT2_Rule;
import src.intervalType2.system.IT2_Rulebase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import src.type1.sets.T1MF_Gauangle;
import src.type1.sets.T1MF_Gaussian;
import src.type1.sets.T1MF_Triangular;

/**
 *
 * @author shivamawasthi
 */
public class Model {
    
    
    List[] linVal = null, inout = null, rule=null,ruleBase = null;
    List[] memberShip = null;
    List antecedent = null;
    IT2_Rulebase rulebase1;
    
    public Model()
    {
        inout = new ArrayList[3];
        inout[0]= new ArrayList();
        inout[1]= new ArrayList();
        inout[2]= new ArrayList(); 
        ruleBase = new ArrayList[2];
        ruleBase[0]=new ArrayList();
        ruleBase[1]=new ArrayList();
        
        antecedent = new ArrayList();
        memberShip = new ArrayList[3];
        
    }
    
    public void inOutObjects()
    {
        double[] d = new double[2];
        int s  = linVal[0].size();
        Iterator r1 = linVal[1].iterator();
        for(int i =0; i<s-1;i++)
        {
            String linguisticVariable = (String)linVal[0].get(i);
            inout[0].add(linguisticVariable);
            d = (double[]) r1.next();
            inout[1].add(new Input(linguisticVariable,new Tuple(d[0],d[1])));
            d=new double[2];
           inout[2].add(memberShipFunctionObjects(linguisticVariable,i));
            
        }
        d=new double[2];
        String linguisticVariable = (String)linVal[0].get(s-1);
         inout[0].add(linguisticVariable);
         d = (double[]) r1.next();
        inout[1].add(new Output(linguisticVariable,new Tuple(d[0],d[1])));
        inout[2].add(memberShipFunctionObjects(linguisticVariable,s-1));
        
        
        rulesObjects();
    }
    
    public List[] memberShipFunctionObjects(String name,int i)
    {
        List[] memberShip = new ArrayList[3];
        memberShip[0]=new ArrayList();
        memberShip[1]=new ArrayList();
        memberShip[2]=new ArrayList();
        
            List l[] = (List[]) linVal[2].get(i);
            Iterator r = l[0].iterator();
            Iterator r1 = l[1].iterator();
            Iterator r2 = l[2].iterator();
            while(r.hasNext())
            {
                String linguisticValue = (String) r.next();
                String memberShipFunction = (String) r1.next();
                double[] d = new double[6];
                d = (double[]) r2.next();
                
                if(memberShipFunction.equals("Triangular"))
                {
                    System.out.println(memberShipFunction);
                    T1MF_Triangular umf = new T1MF_Triangular("Upper MF for "+linguisticValue+" "+name,d[0],d[1],d[2]);
                    T1MF_Triangular lmf = new T1MF_Triangular("Lower MF for "+linguisticValue+" "+name,d[3],d[4],d[5]);
                    IntervalT2MF_Triangular IT2MF = new IntervalT2MF_Triangular("IT2MF for "+linguisticValue+" "+name,umf,lmf);
                    memberShip[0].add(linguisticValue);
                    memberShip[1].add(IT2MF);
                    memberShip[2].add(memberShipFunction);
                }
                if(memberShipFunction.equals("Gaussian"))
                {
                    System.out.println(memberShipFunction);
                    T1MF_Gaussian umf = new T1MF_Gaussian("Upper MF for "+linguisticValue+" "+name,d[0],d[1]);
                    T1MF_Gaussian lmf = new T1MF_Gaussian("Lower MF for "+linguisticValue+" "+name,d[3],d[4]);
                    IntervalT2MF_Gaussian IT2MF = new IntervalT2MF_Gaussian("IT2MF for "+linguisticValue+" "+name,umf,lmf);
                    memberShip[0].add(linguisticValue);
                    memberShip[1].add(IT2MF);
                    memberShip[2].add(memberShipFunction);
                }
                if(memberShipFunction.equals("Gauangle"))
                {
                    System.out.println(memberShipFunction);
                    T1MF_Gauangle umf = new T1MF_Gauangle("Upper MF for "+linguisticValue+" "+name,d[0],d[1],d[2]);
                    T1MF_Gauangle lmf = new T1MF_Gauangle("Lower MF for "+linguisticValue+" "+name,d[3],d[4],d[5]);
                    IntervalT2MF_Gauangle IT2MF = new IntervalT2MF_Gauangle("IT2MF for "+linguisticValue+" "+name,umf,lmf);
                    memberShip[0].add(linguisticValue);
                    memberShip[1].add(IT2MF);
                    memberShip[2].add(memberShipFunction);
                }
                    
            }
            System.out.println(memberShip[2]+" "+memberShip[0]);
            return memberShip;
        }
    
    
    public void rulesObjects()
    {
        int s = rule[0].size();
        System.out.println("rule size : "+s);
        int q = inout[0].size();
        for(int i=0;i<s;i++)
        {
            String member = (String) rule[0].get(i);
            String output = (String) inout[0].get(q-1);
            Output out = (Output) inout[1].get(q-1);
            List[] l = (List[]) inout[2].get(q-1);
            int n = l[0].indexOf(member);
            String mem = (String) l[2].get(n);
            if(mem.equals("Triangular"))
            {
                IntervalT2MF_Triangular it = (IntervalT2MF_Triangular) l[1].get(n);
                ruleBase[0].add(new IT2_Consequent(""+member+" "+output,it,out));
            }
            if(mem.equals("Gaussian"))
            {
                IntervalT2MF_Gaussian it =(IntervalT2MF_Gaussian) l[1].get(n);
                ruleBase[0].add(new IT2_Consequent(""+member+" "+output,it,out));
            }
            if(mem.equals("Gauangle"))
            {
                IntervalT2MF_Gauangle it = (IntervalT2MF_Gauangle) l[1].get(n);
                ruleBase[0].add(new IT2_Consequent(""+member+" "+output,it,out));
            }
            
            int v = 1;
            List[] ant = (List[]) rule[1].get(i);
            Iterator r = ant[0].iterator();
            Iterator r1 = ant[1].iterator();
            List antecedent = new ArrayList();
            while(r.hasNext())
            {
                String input = (String) r.next();
                String value = (String) r1.next();
                
                System.out.println("input varial: "+input+" value:  "+value+"  "+ant[0]+"  "+ant[1]+" ant[0] size :"+ant[0].size()+" loop count: "+v);
                
                int w = inout[0].indexOf(input);
                Input inp = (Input) inout[1].get(w);
                List[] y = (List[]) inout[2].get(w);
                
                System.out.println("w: "+w+"\n"+inout[0]+"\n"+y[0]);
                
                int p = y[0].indexOf(value);
                String me = (String) y[2].get(p);
                if(me.equals("Triangular"))
            {
                IntervalT2MF_Triangular it = (IntervalT2MF_Triangular) y[1].get(p);
                antecedent.add(new IT2_Antecedent(""+value+" "+input,it,inp));
            }
            if(me.equals("Gaussian"))
            {
                IntervalT2MF_Gaussian it =(IntervalT2MF_Gaussian) y[1].get(p);
                antecedent.add(new IT2_Antecedent(""+value+" "+input,it,inp));
            }
            if(me.equals("Gauangle"))
            {
                IntervalT2MF_Gauangle it = (IntervalT2MF_Gauangle) y[1].get(p);
                antecedent.add(new IT2_Antecedent(""+value+" "+input,it,inp));
            }
                
            v++;
            }
            System.out.println("Antecedent added : ");
            ruleBase[1].add(antecedent);
            
        }
        
        ruleBaseInit();
                
    }
    
    
    public void ruleBaseInit()
    {
        rulebase1 = new IT2_Rulebase();
        Iterator r = ruleBase[0].iterator();
        Iterator r1 = ruleBase[1].iterator();
        while(r.hasNext())
        {
            List m = (List) r1.next();
            IT2_Antecedent[] a = (IT2_Antecedent[]) m.toArray((new IT2_Antecedent[0]));
            rulebase1.addRule(new IT2_Rule(a, (IT2_Consequent) r.next()));
        }
        
        System.out.println("\n"+rulebase1);
        int number = inout[0].size();
        FLSystem f = new FLSystem();
        f.sh(number-1,inout[0],linVal,rule,rulebase1,inout[1]);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        
        
        
    }
    
    
    
    private void getTip(double foodQuality, double serviceLevel)
    {
        //first, set the inputs
        ((Input)inout[1].get(0)).setInput(foodQuality);
        ((Input)inout[1].get(1)).setInput(serviceLevel);
        
        //now execute the FLS and print output
        System.out.println("The food was: "+((Input)inout[1].get(0)).getInput());
        System.out.println("The service was: "+((Input)inout[1].get(1)).getInput());
        System.out.println("Using center of sets type reduction, the IT2 FLS recommends a "
                + "tip of: "+rulebase1.evaluate(0).get(((Output)inout[1].get(2))));  
        System.out.println("Using centroid type reduction, the IT2 FLS recommends a "
                + "tip of: "+rulebase1.evaluate(1).get(((Output)inout[1].get(2))));
        
        
        //show the output of the raw centroids
        System.out.println("Centroid of the output for TIP (based on centroid type reduction):");
        TreeMap<Output, Object[]> centroid = rulebase1.evaluateGetCentroid(1);
        Object[] centroidTip = centroid.get(((Output)inout[1].get(2)));
        Tuple centroidTipXValues = (Tuple)centroidTip[0];
        double centroidTipYValues = ((Double)centroidTip[1]);
            System.out.println(centroidTipXValues+" at y= "+centroidTipYValues);        
    }
    
    
}
