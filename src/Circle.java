/**
 *
 * @author TanzidKhan
 */
public class Circle extends GObject {
    Circle(){}
    String Area(double r){
        return X.format(Math.PI*Math.pow(r, 2));
    }
    String Peri(double r){
        return X.format(2*Math.PI*r);
    }
}
