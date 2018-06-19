/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author shivamawasthi
 */
public class SaveData implements Serializable {
    
    private String name;
    private int frameNo;
    private List[] linVal ;
    private List[] rulebase ;
    DefaultListModel ru ;

    public DefaultListModel getRu() {
        return ru;
    }

    public void setRu(DefaultListModel ru) {
        this.ru = ru;
    }

    public List[] getLinVal() {
        return linVal;
    }

    public List[] getRulebase() {
        return rulebase;
    }

    public void setRulebase(List[] rulebase) {
        this.rulebase = rulebase;
    }
    private List inputVariables;

    public int getFrameNo() {
        return frameNo;
    }

    public void setFrameNo(int frameNo) {
        this.frameNo = frameNo;
    }
    private List inputRanges;
    private String outputVariable;

    public List getInputVariables() {
        return inputVariables;
    }

    public void setInputVariables(List inputVariables) {
        this.inputVariables = inputVariables;
    }

    public List getInputRanges() {
        return inputRanges;
    }

    public void setInputRanges(List inputRanges) {
        this.inputRanges = inputRanges;
    }

    public String getOutputVariable() {
        return outputVariable;
    }

    public void setOutputVariable(String outputVariable) {
        this.outputVariable = outputVariable;
    }

    public double[] getOutputRange() {
        return outputRange;
    }

    public void setOutputRange(double[] outputRange) {
        this.outputRange = outputRange;
    }
    private double[] outputRange;
    private List[] linVal1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List[] getLinVal1() {
        return linVal1;
    }

    public void setLinVal(List[] linVal) {
        this.linVal = linVal;
    }
    
    
    public void setLinVal1(List[] l)
    {
//        System.out.println("In SaveData class :"+ l[0].size());
        
        
        linVal1 = new ArrayList[3];
        linVal1[0] = new ArrayList();
         linVal1[1] = new ArrayList();
          linVal1[2] = new ArrayList();
          Iterator i = l[0].iterator();
          Iterator i1 = l[1].iterator();
          Iterator i2 = l[2].iterator();
          while(i.hasNext())
          {
              linVal1[0].add(i.next());
              linVal1[1].add(i1.next());
              linVal1[2].add(i2.next());
          }
        
        
    }
    
    public void stInput()
    {
        linVal1 = new ArrayList[3];
        linVal1[0] = new ArrayList();
         linVal1[1] = new ArrayList();
          linVal1[2] = new ArrayList();
          
        linVal1[0]=inputVariables;
        if(outputVariable!=null)
        linVal1[0].add(outputVariable);
        linVal1[1] = inputRanges;
        if(outputRange!=null)
        linVal1[1].add(outputRange);
        linVal1[2] = null;
//        inputVariables = null;
//        outputVariable = null;
//        inputRanges = null;
//        outputRange = null;
        
    }
    
    
    
}
