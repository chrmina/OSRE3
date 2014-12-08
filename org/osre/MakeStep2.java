package org.osre;

import org.osre.*;

public class MakeStep2 {

    private double[] range = new double[2];
    private double[] step = new double[1001];
    private int measure;

    MakeStep2(int m) {
	measure = m;
    }

    public double[] getStep(){
	range = this.setStartEnd();
	double dh = (range[1]-range[0]) / 1000.0;
	step[0] = range[0];
    
	for(int i=0; i<1000; i++) {
	    step[i+1] = step[i] + dh;
	}
	return step;
    }

    public double[] setStartEnd() {
	switch (measure) {
	case 1:
	    range[0] = 4.0;
	    range[1] = 7.0;
	    break;
	case 2:
	    range[0] = 5.0;
	    range[1] = 100.0;
	    break;
	case 3:
	    range[0] = 30.0;
	    range[1] = 400.0;
	    break;
	case 4:
	    range[0] = 6.0;
	    range[1] = 10.0;
	    break;    
	}
	return range;
    }

}
