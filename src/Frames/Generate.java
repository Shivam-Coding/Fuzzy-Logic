/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import src.generic.Tuple;
import src.generic.Input;
import src.generic.Output;
import src.intervalType2.sets.IntervalT2MF_Gauangle;
import src.intervalType2.sets.IntervalT2MF_Gaussian;
import src.intervalType2.sets.IntervalT2MF_Triangular;
import src.intervalType2.system.IT2_Antecedent;
import src.intervalType2.system.IT2_Consequent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import src.type1.sets.T1MF_Gauangle;
import src.type1.sets.T1MF_Gaussian;
import src.type1.sets.T1MF_Triangular;

/**
 *
 * @author shivamawasthi
 */
public class Generate {
    
    private List[] values;
    private List[] rules;
    List[] rulebase = null,ente=null;
    List[] input =null;
    List membership = null,antecedent = null;

    public void setValues(List[] values) {
        this.values = values;
    }

    public void setRules(List[] rules) {
        this.rules = rules;
    }
    
    public Generate()
    {
        input = new ArrayList[2];
        input[0] = new ArrayList();
        input[1] = new ArrayList();
        membership = new ArrayList();
        
        rulebase = new ArrayList[2];
        rulebase[0] = new ArrayList();
        rulebase[1] = new ArrayList();
        antecedent = new ArrayList();
        ente = new ArrayList[2];
        ente[0]= new ArrayList();
        ente[1]= new ArrayList();
    }
    
    public void seinp()
    {
        double[] d = new double[2];
        int size = values[0].size();
        for(int i =0;i<size-1;i++)
        {
            d = (double[]) values[1].get(i);
            input[0].add(new Input((String)values[0].get(i),new Tuple(d[0],d[1])));
            d = new double[2];
        }
        d = new double[2];
        d = (double[]) values[1].get(size-1);
        input[0].add(new Output((String)values[0].get(size-1),new Tuple(d[0],d[1])));
        
    }
    
    public void semem()
    {
        //double[] d  = new double[3];
        //Iterator r = values[2].iterator();
        int s1 = values[2].size();
        
        for(int j =0;j<s1;j++)
        {
            List[] l = (List[]) values[2].get(j);
            int s = l[0].size();
            for(int i=0;i<s;i++)
            {
                if(((String)l[1].get(i)).equals("Triangular"))
                {
                    double[] range = new double[6];
                    range = (double[]) l[2].get(i);
                    T1MF_Triangular umf,lmf;
                    umf = new T1MF_Triangular("Upper MF for "+(String)l[0].get(i)+" "+(String)values[0].get(j), range[0], range[1], range[2]);
                    lmf = new T1MF_Triangular("Lower MF for "+(String)l[0].get(i)+" "+(String)values[0].get(j), range[3], range[4], range[5]);
                    IntervalT2MF_Triangular IT2MF = new IntervalT2MF_Triangular("IT2MF for "+(String)l[0].get(i)+" "+(String)values[0].get(j),umf,lmf);
                    membership.add(IT2MF);
                    
               }
                if(((String)l[1].get(i)).equals("Gaussian"))
                {
                    double[] range = new double[6];
                    range = (double[]) l[2].get(i);
                    T1MF_Gaussian umf,lmf;
                    umf = new T1MF_Gaussian("Upper MF for "+(String)l[0].get(i)+" "+(String)values[0].get(j), range[0], range[1]);
                    lmf = new T1MF_Gaussian("Lower MF for "+(String)l[0].get(i)+" "+(String)values[0].get(j), range[3], range[4]);
                    IntervalT2MF_Gaussian IT2MF = new IntervalT2MF_Gaussian("IT2MF for "+(String)l[0].get(i)+" "+(String)values[0].get(j),umf,lmf);
                    membership.add(IT2MF);
                }
                if(((String)l[1].get(i)).equals("Gauangle"))
                {
                    double[] range = new double[6];
                    range = (double[]) l[2].get(i);
                    T1MF_Gauangle umf, lmf;
                umf = new T1MF_Gauangle("Upper MF for "+(String)l[0].get(i)+" "+(String)values[0].get(j), range[0], range[1], range[2]);
                lmf = new T1MF_Gauangle("Lower MF for "+(String)l[0].get(i)+" "+(String)values[0].get(j), range[3], range[4], range[5]);
               IntervalT2MF_Gauangle IT2MF = new IntervalT2MF_Gauangle("IT2MF for "+(String)l[0].get(i)+" "+(String)values[0].get(j),umf,lmf);
               membership.add(IT2MF);
                    
                }
            }
            
            input[1].add(membership);
            membership = new ArrayList();
            
        }
    }
    
    
    public void serule()
    {
        int s = rules[1].size();
        for(int i =0;i<s;i++)
        {
            List[] l = (List[]) rules[1].get(i);
            int s1 = l[0].size();
            for(int j = 0;j<s1;j++)
            {
                String name = (String) l[0].get(j);
                int q = values[0].indexOf(name);
                Input p = (Input) input[0].get(q);
                List[] m = (List[]) values[2].get(q);
                String nmf = (String) l[1].get(j);
                int w = m[0].indexOf(nmf);
                String member = (String) m[1].get(w);
                List v = (List) input[1].get(q);
                if(member.equals("Triangular"))
                {
                    IntervalT2MF_Triangular IT2MF = (IntervalT2MF_Triangular) v.get(w);
                }
                if(member.equals("Gaussian"))
                {
                    IntervalT2MF_Gaussian IT2MF = (IntervalT2MF_Gaussian) v.get(w);
                }
                if(member.equals("Gauangle"))
                {
                    IntervalT2MF_Gauangle IT2MF = (IntervalT2MF_Gauangle) v.get(w);
                }
                
                
             
            }
        }
    }
    
    
    public void entecon()
    {
        int s = input[0].size();
        for(int i=0;i<s-1;i++)
        {
            ente[0].add(values[0].get(i));
            List e = (List) input[1].get(i);
            List[] m = (List[]) values[2].get(i);
            for(int j = 0;j<m[0].size();j++)
            {
                String member = (String) m[1].get(j);
                
                if(member.equals("Triangular"))
                {
                    IntervalT2MF_Triangular IT2MF = (IntervalT2MF_Triangular) e.get(j);
                    IT2_Antecedent ant = new IT2_Antecedent(IT2MF, (Input) input[0].get(i));
                    antecedent.add(ant);
                }
                if(member.equals("Gaussian"))
                {
                    IntervalT2MF_Gaussian IT2MF = (IntervalT2MF_Gaussian) e.get(j);
                    IT2_Antecedent ant = new IT2_Antecedent(IT2MF, (Input) input[0].get(i));
                    antecedent.add(ant);
                }
                if(member.equals("Gauangle"))
                {
                    IntervalT2MF_Gauangle IT2MF = (IntervalT2MF_Gauangle) e.get(j);
                    IT2_Antecedent ant = new IT2_Antecedent(IT2MF, (Input) input[0].get(i));
                    antecedent.add(ant);
                }
                  
            }
            ente[0].add(antecedent);
            
        }
        
        ente[0].add(values[0].get(s-1));
            List e = (List) input[1].get(s-1);
            List[] m = (List[]) values[2].get(s-1);
            for(int j = 0;j<m[0].size();j++)
            {
                String member = (String) m[1].get(j);
                
                if(member.equals("Triangular"))
                {
                    IntervalT2MF_Triangular IT2MF = (IntervalT2MF_Triangular) e.get(j);
                    IT2_Consequent ant = new IT2_Consequent(IT2MF, (Output) input[0].get(s-1));
                    antecedent.add(ant);
                }
                if(member.equals("Gaussian"))
                {
                    IntervalT2MF_Gaussian IT2MF = (IntervalT2MF_Gaussian) e.get(j);
                    IT2_Consequent ant = new IT2_Consequent(IT2MF, (Output) input[0].get(s-1));
                    antecedent.add(ant);
                }
                if(member.equals("Gauangle"))
                {
                    IntervalT2MF_Gauangle IT2MF = (IntervalT2MF_Gauangle) e.get(j);
                    IT2_Consequent ant = new IT2_Consequent(IT2MF, (Output) input[0].get(s-1));
                    antecedent.add(ant);
                }
                  
            }
            ente[0].add(antecedent);
        
    }
    
}
