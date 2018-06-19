/*
 * GenT2zMF_Interface.java
 *
 * Created on 29 April 2007, 19:20
 *
 * Author: Christian Wagner
 * Copyright 2006 Christian Wagner All Rights Reserved.
 */

package src.generalType2zSlices.sets;


import src.generic.Tuple;
import src.intervalType2.sets.IntervalT2MF_Interface;
import java.io.Serializable;
import src.type1.sets.T1MF_Discretized;

/**
 *
 * @author Christian Wagner
 */
public interface GenT2zMF_Interface extends Serializable
{
    public String getName();
    public void setName(String name);
    public int getNumberOfSlices();
    public T1MF_Discretized getFS(double x);
    public IntervalT2MF_Interface getZSlice(int slice_number);
    public void setZSlice(IntervalT2MF_Interface zSlice, int zLevel);
    public double getZValue(int slice_number);
    public Tuple getSupport();
    public void setSupport(Tuple support);
    public double getFSWeightedAverage(double x);
    public boolean isLeftShoulder();
    public boolean isRightShoulder();
    public double[] getZValues();
    public T1MF_Discretized getCentroid(int primaryDiscretizationLevel);
}
