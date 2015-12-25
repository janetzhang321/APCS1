/*
  Janet Zhang
  APCS1 pd5
  HW12 -- stAtistically sPeaking
  2015-10-06
*/

public class Stats{
    public static int mean(int a, int b){
	return (a + b)/2;
    }
    public static double mean(double a, double b){
	return (a + b)/2;
    }
    public static int max(int a, int b){
	if (a>b){
	    return a;}
	if (b>a){
	    return b;}
	else{
	    return b;}}
    public static double max(double a, double b){
	if (a>b){
	    return a;}
	if (b>a){
	    return b;}
	else{
	    return b;}}
    public static int geoMean(int a, int b){
	return (int)Math.sqrt(a*b);
    }
    public static double geoMean(double a, double b){
	return Math.sqrt(a*b);
    }
    public static void main(String[] args){
	System.out.println(mean(2,5)); //int
	System.out.println(mean(2.0,5)); //double
	System.out.println(mean(2.5,2.3)); //double
	System.out.println((int)5030.74003); //typecasting?
	System.out.println(max(4,5)); //int
	System.out.println(max(4.0,4)); //double
	System.out.println(max(4.0000001,4.000001)); //double
	System.out.println(geoMean(3,4)); //int
        System.out.println(geoMean(3,6)); //int
	System.out.println(geoMean(3.,6.)); //double
	System.out.println(geoMean(5*Math.sqrt(2),5*Math.sqrt(2)));//double
    }
}
