


/**
 *
 * @author TanzidKhan
 */
public class Cone extends GObject {
Cone(){}

String Area(double r, double h){
	return X.format(Math.PI*r*(r+Math.sqrt(Math.pow(h,2)+Math.pow(r,2))));

}
String Vol(double r,double h){
	return X.format((1/3)*(Math.PI*Math.pow(r,2)*h));
}

}