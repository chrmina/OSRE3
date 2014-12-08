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

class HazDrawPanel extends JPanel {

    private int areaNum,measureNum;
    private double [][] hazSet = new double[1001][2];
    private double [] haba = new double[2];
    private double [] parameter = new double[2];

    private double[][] data = new double[2][1001];
    private double[][] temp0 = new double[1001][6];
    private double[][] temp = new double[1001][2];

    private String[] measure = {"JMA","PGV [kine]","PGA [gal]","MMI"};
    private String[] variate = {"1%","10%","50%","90%","99%"};
    private double var;

    private DefaultXYDataset xyDataset;
    
    HazDrawPanel(int m, double[][] haz, double hv){
	measureNum = m;
	hazSet = haz;
	var = hv;
    }

    public DefaultXYDataset setXYData() {
	double [] haba = new double[2];
	MakeStep2 hazStep = new MakeStep2(measureNum);
	haba = hazStep.setStartEnd();
	data = this.transrator(hazSet);
	DefaultXYDataset xyData = new DefaultXYDataset();
	Ppro_h_d hazardVariate = new Ppro_h_d();
	temp0 = hazardVariate.Pcurve_h(hazSet,var);

	for (int j=0;j<5;j++) {
    
	    for (int i=0;i<1001;i++) {
		temp[i][0] = temp0[i][j];
		temp[i][1] = temp0[i][5];
		if(i>1 && temp[i][0] == temp[i-1][0]) {
		    temp[i][1] = temp[i-1][1];
		}
	    }
		data = this.transrator(temp);
		xyData.addSeries(variate[j],data);
	}
	return xyData;
    }

    public JPanel getPanel() {

	xyDataset = this.setXYData();

	JFreeChart chart = ChartFactory.createXYLineChart("Hazard",
							  measure[measureNum-1], 
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
