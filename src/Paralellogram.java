


/**
 *
 * @author TanzidKhan
 */
public class Paralellogram extends GObject {
    Paralellogram(){}
	
    String Diag(double l, double b,double Q){
		D=Math.sqrt(Math.pow(l, 2)+Math.pow(b,2)+2*l*b*Math.cos(Q));
		return X.format(D);
}
}
