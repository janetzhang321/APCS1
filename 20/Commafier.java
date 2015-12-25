public class Commafier {
    
    public static String commafyR(int n) {
	//work from right to left
	String s="";
	if (n>=1000){
	    String r=""+n%1000;
	    //add zeros if necessary
	    if (r.length()==2){s=s+"0"+r;}
	    else if (r.length()==1){s=s+"00"+r;}
	    //if zeros aren't necessary, add r to the back of s
	    else{s+=r;}
	    s=","+s;
	    s=commafyR(n/1000)+s;//add everything to the front of s
	}
	else if (n<1000){s=n+s;}//add first nums to the front
	return s;
    }//build every 3 numbers from right to left but build every group form left to right


    public static String commafyF(int n) {
	String s="";
	for(;
	    n>=1000;
	    n=n/1000){
	    String r=""+n%1000;
	    if (r.length()==2){s=s+"0"+r;}
	    else if (r.length()==1){s=s+"00"+r;}
	    else{s=r+s;}
	    s=","+s;
	}
	s=n+s;
	return s;
    }


    public static void main( String[] args ) {
	/*============TOP===========

	  System.out.println( "commafyR(1): " + commafyR(1) ); 
	  System.out.println( "commafyR(10): " + commafyR(10) ); 
	  System.out.println( "commafyR(101): " + commafyR(101) ); 
	  System.out.println( "commafyR(1000): " + commafyR(1000) ); 
	  System.out.println( "commafyR(12345): " + commafyR(12345) ); 
	  System.out.println( "commafyR(1234567890): " + commafyR(1234567890) );											  ============BOT===========*/
 
	/*============TOP===========

	  System.out.println( "commafyF(1): " + commafyF(1) );
	  System.out.println( "commafyF(10): " + commafyF(10) ); 
	  System.out.println( "commafyF(101): " + commafyF(101) ); 
	  System.out.println( "commafyF(1000): " + commafyF(1000) ); 
	  System.out.println( "commafyF(12345): " + commafyF(12345) ); 
	  System.out.println( "commafyF(1234567890): " + commafyF(1234567890) );
 
	  ============BOT===========*/

	//Foreach loop
	for ( String s : args ) {
	    int temp = Integer.parseInt(s);
	    
	    System.out.println( "commafyR(" + temp + "): " + commafyR(temp) );
	    System.out.println( "commafyF(" + temp + "): " + commafyF(temp) );
	}
    }

}//end class 
