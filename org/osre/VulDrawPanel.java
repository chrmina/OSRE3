package org.osre;

import org.osre.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;

class VulDrawPanel extends JPanel {
  
    private int assetNum,measureNum;
    private double [][] hazSet = new double[1001][2];
    private double [] haba = new double[2];
    private double [] parameter = new double[2];

    private double[][] data = new double[2][1001];
    private String[] measure = {"JMA","PGV [kine]","PGA [gal]","MMI"};
    private String[] variate = {"1%","10%","50%","90%","99%"};
    
    private double var;
    private double[][] temp0 = new double[1001][6];
    private double[][] temp = new double[1001][2];
    private DefaultXYDataset xyDataset;

    VulDrawPanel(int m, double[][] vulMatrix, double vv) {
       	measureNum = m;
	hazSet = vulMatrix;
	var = vv;
    }

    public DefaultXYDataset setXYData() {
	double [] haba = new double[2];
	MakeStep2 hazStep = new MakeStep2(measureNum);
	haba = hazStep.setStartEnd();

	DefaultXYDataset xyData = new DefaultXYDataset();

	Ppro_h_d hazardVariate = new Ppro_h_d();
	temp0 = hazardVariate.Pcurve_d(hazSet,var);
	
	for (int j=0;j<5;j++) {
	    
	    for (int i=0;i<1001;i++) {
		temp[i][0] = temp0[i][5];
		temp[i][1] = temp0[i][j];
	   	    
		if(i>0 && temp[i][1] == temp[i-1][1]) {
		    temp[i][0] = temp[i-1][0];
		}
	    }
	    	    
	    data = this.transrator(temp);
	    
	    xyData.addSeries(variate[j],data);
	}
	return xyData;
    }


    public JPanel getPanel() {

	xyDataset = this.setXYData();

	JFreeChart chart = 
	    ChartFactory.createXYLineChart("Vulnerability",
					   measure[measureNum-1], 
					   "damage [%]", 
					   xyDataset, 
					   PlotOrientation.VERTICAL, 
					   true,
					   true, 
					   false);
	ChartPanel panel = new ChartPanel(chart);
	return panel;
    }

    public double[][] transrator(double[][] mat) {
	double[][] matrix = new double[2][1001]; 
	for(int j=0;j<2;j++) {
	    for(int i=0;i<1001;i++) {
		matrix[j][i] = mat[i][j];
	    }
	}
	return matrix;
    }

 }
