package org.osre;

import org.osre.*;

import java.io.*;

public class Hazard {

    double [] parameter = new double[2];
    double start;
    double end;
    int area;
    int measure;
    
    public Hazard(int a, int m) {
	area = a;
	measure = m;
    }  
    
    public void setParameter() {
	parameter = this.makeParameter();
    }

    public double[][] makeHazardMedian() {

	double [] step = new double[1001];
	double [] hazmedian = new double[1001];
	double [][] haz = new double[1001][2];

	this.setParameter();

	MakeStep2 hazStep = new MakeStep2(measure);
	step = hazStep.getStep();

	for (int i=0; i<1001; i++) {
	    hazmedian[i] = this.calcHazardMedian(step[i]);
	    haz[i][0] = step[i];
	    haz[i][1] = hazmedian[i];
	}
	/*
	  OutputHazard out = new OutputHazard("step.txt");
	  out.output(step);
	  
	  out = new OutputHazard("hmedian.txt");
	  out.output(hazmedian);
	*/
	return haz;
    }

    public double[][] pdh_Median() {
	double[] step = new double[1001];
	double[][] pdh = new double[1001][2];

	this.setParameter();

	MakeStep2 hazstep = new MakeStep2(measure);
	step = hazstep.getStep();

	for (int i = 0; i < 1001; i++) {
	    pdh[i][0] = step[i];
	    pdh[i][1] = this.pdh_function(step[i]);
	}
	return pdh;
    }

    public double[] makeParameter() {
	
	double[] para = new double[2];
	String filename1 = null;
	String filename2 = null;
	double[] parametera = new double[47];
	double[] parameterb = new double[47];
	double[][] thisAreaParameter = new double[47][2];

	HazardParameter hazPara = new HazardParameter();
	thisAreaParameter = hazPara.getParameter(measure);

	para[0] = thisAreaParameter[area-1][0];
	para[1] = thisAreaParameter[area-1][1];
       
	return para;
    }
 
    public double calcHazardMedian(double x) {
	double y;
	y = parameter[0] * Math.exp(parameter[1]*x);
	return y;
    }

    public double pdh_function(double px) {
	double py;
	py = - parameter[0] * parameter[1] * Math.exp((parameter[1]-1) * px);
	return py;
    }

}

