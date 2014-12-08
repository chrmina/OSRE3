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
import org.jfree.chart.title.LegendTitle;

class DamDrawPanel extends JPanel {
   
    private double [][] hazMatrix = new double[1001][2];
    private double [][] vulMatrix = new double[1001][2];
    private double [][] pdfMatrix = new double[1001][1001];
    boolean[] check;
 
    DamDrawPanel(double[][] hazMat, double[][] vulMat, double[][] pdfMat,boolean[] ck) {      
	hazMatrix = hazMat;
	vulMatrix = vulMat;
	pdfMatrix = pdfMat;
	check = ck;
    }
    
    public DefaultXYDataset setData() {
	int[] percentile = {1,10,20,30,40,50,60,70,80,90,99};
	double[][] hazSet = new double[1001][2];
	double[][] data = new double[2][1001];
	DefaultXYDataset xyData = new DefaultXYDataset();
	Ppro_2 prob1 = new Ppro_2();
	
	for (int i=0;i<11;i++) {
	    hazSet = prob1.Psearch(percentile[i],pdfMatrix,hazMatrix,vulMatrix);
	    data = this.transrator(hazSet);
	    if(check[i]==true) {
		xyData.addSeries(percentile[i]+"%",data);
	    }
	}
	return xyData;
    }
        
    public JPanel getPanel() {
	DefaultXYDataset xyDataset = setData();
	JFreeChart chart = ChartFactory.createXYLineChart("Damage",
							  "damage [%]", 
							  "Pr_exc",
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

