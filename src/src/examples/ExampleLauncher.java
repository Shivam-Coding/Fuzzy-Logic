/*
 * ExampleLauncher.java
 * Juzzy 1.10
 * Last updated in August 2013
 * Notes: Multiple outputs are now supported for type-1, interval type-2 and zSlices based general type-2 FLSs.
 * Copyright 2012 Christian Wagner All Rights Reserved.
 */
package src.examples;

/**
 *
 * @author Christian Wagner
 */
public class ExampleLauncher 
{
    public static void main(String args[])
    {
        String s = (
                "Use the following parameters to launch one of the examples:\n"
                + "(all examples are based on the classic -tipping- example, "
                + "where we have two inputs, food and service quality which "
                + "influence the level of tip we would like to give the waiter.)\n"
                + "type1  --> launches a Type-1 Fuzzy Logic System\n"
                + "type1-2outputs  --> launches a Type-1 Fuzzy Logic System with 2 outputs\n"
                + "intervalT2  --> launches a Interval Type-2 Fuzzy Logic System\n"
                + "intervalT2-2outputs  --> launches a Interval Type-2 Fuzzy Logic System with 2 output\n"
                + "zSlicesGT2  --> launches a zSlices based General Type-2 Fuzzy Logic System\n"
                + "zSlicesGT2MC  --> launches a zSlices based General Type-2 Fuzzy Logic System in MultiCore Mode\n"
                + "zSlicesGT2MC-2outputs  --> launches a zSlices based General Type-2 Fuzzy Logic System with 2 outputs in MultiCore Mode");
        if(args.length==0)
        System.out.println(s);
        else if(args[0].equals("type1"))
            new SimpleT1FLS();
        else if(args[0].equals("type1-2outputs"))
            new SimpleT1FLS_twoOutputs();        
        else if(args[0].equals("intervalT2"))
            new SimpleIT2FLS();
        else if(args[0].equals("intervalT2-2outputs"))
            new SimpleIT2FLS_twoOutputs();        
        else if(args[0].equals("zSlicesGT2"))
            new SimplezGT2FLS();
        else if(args[0].equals("zSlicesGT2MC"))
            new SimplezGT2FLS_Multicore();    
        else if(args[0].equals("zSlicesGT2MC-2outputs"))
            new SimplezGT2FLS_Multicore_twoOutputs();          
        else
            System.out.println("Sorry, the parameter provided was not recognized\n\n"+s);
            
    }
            
}
