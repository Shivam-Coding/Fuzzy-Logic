/*
 * Antecedent.java
 *
 * Copyright 2007 Christian Wagner All Rights Reserved.
 */

package src.intervalType2.system;

import src.generic.Input;
import src.generic.Tuple;
import src.intervalType2.sets.IntervalT2MF_Gauangle;
import src.intervalType2.sets.IntervalT2MF_Interface;
import src.intervalType2.sets.IntervalT2MF_Triangular;

/**
 * Antecedent class for Interval Type-2 FLSs
 * @author Christian Wagner
 */
public class IT2_Antecedent
{
    private String name;
    private IntervalT2MF_Interface mF;
    private Input input;
    private final boolean debug = false;

    public IT2_Antecedent(IntervalT2MF_Interface m, Input i)
    {
        mF = m;
        this.name = mF.getName();
        input = i;
    }
    public IT2_Antecedent(String name, IntervalT2MF_Interface m, Input i)
    {
        this.name = name;
        mF = m;
        input = i;
    }    
    
    public IntervalT2MF_Interface getMF()
    {
        return mF;
    }

    public Tuple getFS()
    {
        if(debug) System.out.println("Input = "+input.getInput());
        if(debug) System.out.println("MF is:  "+mF.getName());
        if(debug) System.out.println("Result is: "+mF.getFS(input.getInput()).toString());
        return mF.getFS(input.getInput());
    }

    public void setInput(Input input)
    {
        this.input = input;
    }

    public Input getInput()
    {
        return input;
    }       

    public IntervalT2MF_Interface getSet()
    {
        return mF;
    }
    
    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString()
    {
        return "IT2 Antecedent (current input is:"+this.getInput().getInput()+"), with MF: "+ mF;
    }

    public int compareTo(Object o) throws ClassCastException
    {
        if (!(((IT2_Antecedent)o).getMF() instanceof IntervalT2MF_Interface))
        throw new ClassCastException("A Membership function (inplementing T1MF_Interface) object is expected.");

        if(mF instanceof IntervalT2MF_Triangular && ((IT2_Antecedent)o).getMF() instanceof IntervalT2MF_Triangular)
        {
            return ((IntervalT2MF_Triangular)mF).compareTo(((IT2_Antecedent)o).getMF());
        }
        else if(mF instanceof IntervalT2MF_Gauangle && ((IT2_Antecedent)o).getMF() instanceof IntervalT2MF_Gauangle)
        {
            return ((IntervalT2MF_Gauangle)mF).compareTo(((IT2_Antecedent)o).getMF());
        }
        else
            throw new ClassCastException("Antecedent - compareTo has only been implemented for two T1MF_Triangular and T1MF_Gauangle sets.");
    }
}
