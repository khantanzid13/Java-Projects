
import java.text.DecimalFormat;


/**
 *
 * @author TanzidKhan
 */
public class GObject {
private double l;
private double b;
private double h;
private double r;
private double n;
private String S;
private double Q;
public void setQ(double Q){
    this.Q=Q;
}
public double getQ(){
    return Q;
}
public void setS(String S){
    this.S=S;
}
public String getS(){
    return S;
}
public double getN() {
	return n;
}
public void setN(double n) {
	this.n = n;
}
public double getR() {
	return r;
}
public void setR(double r) {
	this.r = r;
}
public double getL() {
	return l;
}
public void setL(double l) {
	this.l = l;
}
public double getB() {
	return b;
}
public void setB(double b) {
	this.b = b;
}
public double getH() {
	return h;
}
public void setH(double h) {
	this.h = h;
}
double A,D,P,V;
GObject(){}
GObject(double l,double b,double h){
	this.l=l;
	this.b=b;
	this.h=h;
}
DecimalFormat X=new DecimalFormat("0.00");
String Area(double l,double b){
	A=l*b;
	return X.format(A);
}
String Diag(double l, double b){
	D=Math.sqrt(Math.pow(l, 2)+Math.pow(b,2));
	return X.format(D);
}
String Peri(double l, double b){
	P=2*(l+b);
	return X.format(P);
}
String Vol(double l,double b,double h){
	V=l*b*h;
	return X.format(V);
}


}

