


/**
 *
 * @author TanzidKhan
 */
public class Sphere extends GObject {
Sphere(){}

String Area(double r){
	return X.format(4*Math.PI*Math.pow(r, 2));
	
}
String Vol(double r){
	return X.format((4/3)*Math.PI*Math.pow(r, 3));
}

}