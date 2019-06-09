
/**
 *
 * @author TanzidKhan
 */
public class Triangle extends GObject {
    Triangle(){}
    String Area(double b,double l){
        return X.format(0.5*b*Math.sqrt(Math.pow(l, 2)-Math.pow((b/2), 2)));
    }
    String Peri(double l, double b, double h){
        return X.format(l+b+h);
    }
}
