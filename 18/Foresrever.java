/*
  Janet Zhang
  APCS1 pd5
  HW18 -- For the Lulz Love of Strings
  2015-10-19
*/
public class Foresrever{
    //fenceF(int posts) takes non-negative integer posts, and returns a String representation of a fence with the specified number of posts.
    public static String fenceF(int posts){
	String fence="";
	for(posts-=1;posts>0;posts--)
	    /*
	      initialize posts to be one less;
	      test if post is still greater than 0;
	      if it passes the test, subtract 1 from posts;
	    */
	    {fence+="|--";}//add |-- to the fence each time the for loop is run
	fence+="|";//built from left to right, closes at the left
	return fence;
    }
    //reverseF(String s) a non-empty String s and returns s with its letters reversed.
    public static String reverseF(String s){
	int c=0; String r="";
	for(;s.length()>c;c++){
	    r=s.substring(c,c+1)+r;//takes the first letter of s and adds it to the beginning of r
	    //System.out.println(r); did this to see the process of the outcome
	}
	return r;
    }
    //reverseR(String s) a non-empty String s and returns s with its letters reversed.
    public static String reverseR(String s){
	String r="";//intialize r
	if (s.length()==0) {return r;}//base case
	else {
	    r=s.substring(0,1)+r;//add r to the end, builds from right to left
	    s=s.substring(1);//s is replaced with s(with the first letter removed)
	    r=reverseR(s)+r;//the latest r is added to r, builds from right to left
	}
	return r;
    }
    

    public static void main(String[] args){
	//1.  
	System.out.println(fenceF(1)); //→ “|”
	System.out.println(fenceF(2)); //→ “|--|”
	System.out.println(fenceF(3)); //→ “|--|--|”
	//3.
	/*
	  System.out.println("desserts".length());//8
	  System.out.println("desserts".substring(1));//esserts
	  System.out.println("desserts".substring(-1));//error
	  System.out.println("desserts".substring(1,2));//e
	*/
	System.out.println(reverseF("stressed")); //→ "desserts"
	//4.
	System.out.println(reverseR("stressed")); //→ "desserts"

    }
}
