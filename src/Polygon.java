


/**
 *
 * @author TanzidKhan
 */
public class Polygon extends GObject {
    Polygon(){}
    
	String Area(double l, double n, double h ){
		return X.format((l*n*h)/2);
	}
	String Diag(double n){
		return X.format((n*(n-3))/2);
	}
	String Peri(double n, double l){
		return X.format(n*l);
	}
}
