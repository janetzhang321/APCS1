/*
  Janet Zhang
  APCS1 pd5
  HW13 -- May ah Hahv S’maur, Please?
  2015-10-06
*/

public class Stats{
    //mean
    //int
    public static int mean(int a, int b){
	return (a + b)/2;//returns int
    }
    //double
    public static double mean(double a, double b){
	return (a + b)/2;//returns double
    }
    //2int
    public static int max(int a, int b){
	if (a>b){
	    return a;}
	if (b>a){
	    return b;}
	else{
	    return b;}}//return int
    //2double
    public static double max(double a, double b){
	if (a>b){
	    return a;}
	if (b>a){
	    return b;}
	else{
	    return b;}}//return double
    //3double
    public static double max(double a, double b, double c){
	if (a>b){
	    if (a>c){
		return a;}
	    else{
		return c;}}
	if (b>a){
	    if (b>c){
		return b;}
	    else{
		return c;}}
        else{
	    return c;}//return double
    }
    public static int geoMean(int a, int b){
	return (int)Math.sqrt(a*b);//return int (loss of precision)
    }
    public static double geoMean(double a, double b){
	return Math.sqrt(a*b);//return double
    }
    public static int geoMean(int a, int b, int c){
	return (int)Math.sqrt(a*b*c);//return int
    }
    public static double geoMean(double a, double b, double c){
	return Math.sqrt(a*b*c);//return double
    }
}
