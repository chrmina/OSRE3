package org.osre;

import org.osre.*;

class Ppro_2 {
    
    double[][] Ppl = new double[1001][2];
    double[][] pdf = new double[1001][1001];
    double[][] pd_h_h = new double[1001][1001];
    double[][] pd_d_d = new double[1001][1001];
    double[] cd_half = new double[1001];
    double cd_h,ddh,ddd,d_x,cdf;
    double P_2;
    
    public double[][] Pcurve(double[][] ha, double[][] da,double h_vf,double d_vf) {
	ddh=ha[1][0]-ha[0][0];
	System.out.println("haz+damの不確実性分布を求めます");
	for (int p = 0; p < 1001; p++) {
	    for (int q = 0; q < 1001; q++) {
		if (q > 0) {
		    ddd = da[q][1] - da[q - 1][1];
		}
		else {
		    ddd = da[1][1] - da[0][1];
		}
		pd_h_h[p][q] = Math.exp(((Math.log(ha[q][0]) -Math.log(ha[p][0])) / h_vf) * ((Math.log(ha[q][0]) -Math.log(ha[p][0])) / h_vf) * (-0.5)) / (ha[q][0] * h_vf * Math.sqrt(2 * Math.PI))*ddh;
		pd_d_d[p][q] = Math.exp(((Math.log(da[q][1]) -Math.log(da[p][1])) / d_vf) * ((Math.log(da[q][1]) -Math.log(da[p][1])) / d_vf) * (-0.5)) / (da[q][1] * d_vf * Math.sqrt(2 * Math.PI))*ddd;
	    }
	}
	for (int i = 0; i < 1001; i++) {
	    System.out.println("今" + i + "行目の計算中です。"); 
	    for (int j = 0; j < 1001; j++) {
		for (int k = 0; k < 1001;k++ ) {
		    pdf[i][j] += pd_h_h[i][k] * pd_d_d[k][j];
		}
		if (j < i) {
		    cd_half[i] += pdf[i][j];
		}
		else if (j == i) {
		    cd_half[i] += pdf[i][j] * 0.5;
		}
	    }
	}
	for (int q = 0; q < 1001; q++) {
	    for (int l = 0; l < 1001; l++) {
		pdf[q][l] = pdf[q][l] / cd_half[q] * 0.5;
	    }
	}
	System.out.println("pdf[i][j]が完成しました"); 
	return pdf;
    }
    
    public double[][] Psearch(int P,double[][] pdf,double[][] ha, double[][] da) {
	System.out.println(P+"％被害関数を求めます"); 
	int pre_n=0;
	for (int m = 0; m < 1001; m++) {
	    la:
	    for (int n = 0; n < 1001; n++) {
		cdf = cdf + (double)(pdf[m][n]);

		if (cdf * 100 > P) {
		    if (n < pre_n) {
			System.out.println("boooo, m=" + m + ", n=" + n + ", P=" + P);
			Ppl[m][0] = Ppl[m - 1][0];
			Ppl[m][1] = Ppl[m - 1][1];
		    }
		    else {
			pre_n = n;
			Ppl[m][0] = da[n][1];
			Ppl[m][1] = ha[m][1];
		    }
		    cdf = 0;
		    break la;
		}
		
		if (n == 1000) {
		    if (m == 0)	{
			Ppl[m][0] = da[0][1];
			Ppl[m][1] = ha[0][1];
			cdf = 0;
		    }
		    else {
			Ppl[m][0] = Ppl[m-1][0];
			Ppl[m][1] = Ppl[m-1][1];
			cdf = 0;
		    }
		}
	    }
	}
	System.out.println("Ppl[1001][2]が完成しました"); 
	return Ppl;
    }
}
