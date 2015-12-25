/*
  Team: slackoverflow
  Janet Zhang, Aleksandar Shipetich, Shantanu Jha
  APCS1 pd5
  HW17 -- GCD Three Ways
  2015-10-19
*/

/*===========================HW13============================*/

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
	else{
	    return b;}}//return int
    //2double
    public static double max(double a, double b){
	if (a>b){
	    return a;}
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

    /*===========================HW17============================*/

    //returns int min of two ints
    public static int min(int a, int b){
	if (a <= b) {
	    return a;
	}
	return b;
    }

    //  public static int gcd( int a, int b )  --- uses brute-force approach, beginning at 1 and working up to lesser input
    public static int gcd(int a, int b) {
	int ans = 1;
	int i = 1;
	int n = min(a, b);
	while(i <= n){
	    if (a%i == 0 && b%i == 0) ans = i;//they are both divisible by i, ->return i
	    i += 1;//else, add i until it reaches the min of a,b
	}
	return ans;
    }

    /*
      The Euclidean Algorithm:
      The euclidean algorithm finds the greatest common divisor of two numbers.
      The method it goes about doing this is simplification. 
      With two numbers a and b (where a > b), they can be rewritten as A=B*Q+R, where R is the remainder and Q is the dividend. 
      When we do a mod b, we get R which is the remainder. 
      We replace A with R and repeat.

      (since we don't know if a>b or b>a, we do a mod b and b mod a ... 
      the <smaller number> mod <bigger number> will return the <smaller number> 
      in this way we have less things to check)

      The algorithm ends when the numbers reach zero.
      However, in our code, we shortened the step to be:
      After multiple iterations the numbers will be reduced to be equal, in which case we return one of the numbers. 
    */
    
    //  public static int gcdER( int a, int b ) --- employs Euclid’s algorithm recursively
    public static int gcdER(int a, int b){
	if(a == b || a == 0 || b == 0) {
	    return max(a,b);}//the output when a and b are equal
	return gcdER(a%b, b%a);//else, keep modulating until a==b(in above) and return it
    }

    /*
      We implement the same algorithm with a while loop in our gcdEW method.
    */

    //  public static int gcdEW( int a, int b ) --- employs Euclid’s algorithm iteratively with a while loop
    public static int gcdEW( int a, int b){
	int temp;
	while(a != b && a != 0 && b != 0){
	    temp = a;
	    a = a%b;
	    b = b%temp;
	}
	return max(a,b);
    }

    //Test method; Tests each method and prints results
    public static void test( int a, int b){
	System.out.println("Brute force returns: " + gcd(a,b));
	System.out.println("Recursive Euclids Algorithm returns: " + gcdER(a,b));
	System.out.println("Iterative Euclids Algorithm returns: " + gcdEW(a,b));
	System.out.println("");
    }


	
    public static void main(String[] args){
	System.out.println("GCD of 69 & 21. Expected output is 3.");
        test(69,21);
	System.out.println("GCD of 456 & 192. Expected output is 24.");
	test(456,192);
	System.out.println("GCD of 1999 & 2015. Expected output is 1.");
	test(1999,2015);
    }
    
}
