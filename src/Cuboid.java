


/**
 *
 * @author TanzidKhan
 */
public class Cuboid extends GObject {


String Area(double l, double b, double h){
	return X.format(2*((l*b)+(b*h)+(h*l)));
}
String Diag(double l, double b,double h){
	return X.format(Math.sqrt(Math.pow(l, 2)+Math.pow(b,2)+Math.pow(h, 2)));
}
String Peri(double l, double b,double h){
	return X.format(4*(l+b+h));
}
}