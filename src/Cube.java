/**
 *
 * @author TanzidKhan
 */

public class Cube extends GObject {
Cube(){}

String Area(double l){
	return X.format(6*Math.pow(l,2));
}
String Diag(double l){
	return X.format(l*Math.sqrt(3));
}
String Peri(double l){
	return X.format(12*l);
}
String Vol(double l){
	return X.format(Math.pow(l, 3));
}
}
