package org.osre;

import org.osre.*;

class Ppro_h_d {

    double[][] pl_h = new double[1001][6];
    double[][] pl_d = new double[1001][6];
    double[][] pd_h_h = new double[1001][1001];
    double[][] pd_d_d = new double[1001][1001];
    double[] cd_h = new double[1001];
    double[] cd_d = new double[1001];
    double[] cd_half = new double[1001];
    double[][] check = new double[1001][5];
    double ddh,ddd,cdf;
    
    public double[][] Pcurve_h(double[][] ha,double vf) {

	ddh=ha[1][0]-ha[0][0];
	System.out.println("ha[]の不確実性分布を求めます");

	for (int p = 0; p < 1001; p++) {
	    cd_h[p] = 0;
	    for (int q = 0; q < 1001; q++) {
		pd_h_h[p][q] = Math.exp(((Math.log(ha[q][0]) - Math.log(ha[p][0])) / vf) * ((Math.log(ha[q][0]) - Math.log(ha[p][0])) / vf) * (-0.5)) / (ha[q][0] * vf * Math.sqrt(2 * Math.PI)) * ddh;
		if (p > q) {
		    cd_half[p] = cd_half[p] + pd_h_h[p][q];
		}
		if (p == q) {
		    cd_half[p] = cd_half[p] + pd_h_h[p][q] / 2.0;
		}
	    }

	    for (int m = 0; m < 5; m++) {
		pl_h[p][m] = ha[0][0];
		check[p][m] = 0;
	    }

	    for (int r = 0; r < 1001; r++) {
		cd_h[p] = cd_h[p] + pd_h_h[p][r] / cd_half[p] * 0.5;

		if (cd_h[p] <= 0.99) {
		    pl_h[p][4] = ha[r][0];
		    check[p][4] = r;

		    if (cd_h[p] <= 0.9)	{
			pl_h[p][3] = ha[r][0];
			check[p][3] = r;

			if (cd_h[p] <= 0.5) {
			    pl_h[p][2] = ha[r][0];
			    check[p][2] = r;
			    
			    if (cd_h[p] <= 0.1)	{
				pl_h[p][1] = ha[r][0];
				check[p][1] = r;

				if (cd_h[p] <= 0.01) {
				    pl_h[p][0] = ha[r][0];
				    check[p][0] = r;
				}
			    }
			}
		    }
		}
	    }

	    for (int n = 0; n < 5; n++) {
		if (p > 500) {
		    if (check[p][n] < check[p - 1][n]) {
			check[p][n] = check[p - 1][n];
			pl_h[p][n] = pl_h[p - 1][n];
		    }
		}
	    }
	    
	    pl_h[p][5] = ha[p][1];
	}

	for (int l = 500; l >= 0; l--) {
	    for (int s = 0; s < 5; s++)	{
		if (check[l][s] > check[l+1][s]) {
		    check[l][s] = check[l+1][s];
		    pl_h[l][s] = pl_h[l+1][s];
		}
	    }
	}

	System.out.println("pl_h[i][6]が完成しました"); 
	return pl_h;
    }

    public double[][] Pcurve_d(double[][] da, double vf) {
	System.out.println("vul[]の不確実性分布を求めます");
	for (int p = 0; p < 1001; p++) {
	    cd_half[p] = 0;
	    cd_d[p] = 0;
	    for (int q = 0; q < 1001; q++) {
		if (q > 0) {
		    ddd = da[q][1] - da[q - 1][1];
		}
		else {
		    ddd = da[1][1] - da[0][1];
		}
		pd_d_d[p][q] = Math.exp(((Math.log(da[q][1]) - Math.log(da[p][1])) / vf) * ((Math.log(da[q][1]) - Math.log(da[p][1])) / vf) * (-0.5)) / (da[q][1] * vf * Math.sqrt(2 * Math.PI)) * ddd;
		if (p > q) {
		    cd_half[p] = cd_half[p] + pd_d_d[p][q];
		}
		if (p == q) {
		    cd_half[p] = cd_half[p] + pd_d_d[p][q] / 2.0;
		}
		
	    }
	    for (int m = 0; m < 5; m++) {
			pl_d[p][m] = da[0][1];
			check[p][m] = 0;
	    }
	    for(int r=0;r<1001;r++) {
		cd_d[p] = cd_d[p] + pd_d_d[p][r]/cd_half[p]*0.5;
		
		if (cd_d[p] <= 0.99) {
		    pl_d[p][4] = da[r][1];
		    check[p][4] = r;
		    
		    if (cd_d[p] <= 0.9) {
			pl_d[p][3] = da[r][1];
			check[p][3] = r;
			
			if (cd_d[p] <= 0.5) {
			    pl_d[p][2] = da[r][1];
			    check[p][2] = r;
			
			    if (cd_d[p] <= 0.1) {
				pl_d[p][1] = da[r][1];
				check[p][1] = r;
				
				if (cd_d[p] <= 0.01) {
				    pl_d[p][0] = da[r][1];
				    check[p][0] = r;
				}
			    }
			}
		    }
		}
	    }
	    for (int n = 0; n < 5; n++) {
		if (p > 500) {
		    if (check[p][n] < check[p - 1][n]){
			check[p][n] = check[p - 1][n];
			pl_d[p][n] = pl_d[p - 1][n];
		    }
		}
	    }
	    pl_d[p][5] = da[p][0];
	}
	
	for (int l = 500; l >= 0; l--) {
	    for (int s = 0; s < 5; s++) {
		if (check[l][s] > check[l+1][s]) {
		    check[l][s] = check[l+1][s];
		    pl_d[l][s] = pl_d[l+1][s];
		}
	    }
	}
	System.out.println("pl_d[i][6]が完成しました");
	return pl_d;
    }
}
