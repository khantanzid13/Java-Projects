


/**
 *
 * @author TanzidKhan
 */
public class Cylinder extends GObject {
Cylinder(){}

String Area(double r,double h){
	return X.format(2*Math.PI*r*(r+h));
}
String Vol(double r, double h){
	return X.format(Math.PI*Math.pow(r, 2)*h);
}
}
