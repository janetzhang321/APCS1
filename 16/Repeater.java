/*
  Janet Zhang
  APCS1 pd5
  HW16 -- Do I repeat myself? Very well, then I repeat myself  I am possibly unending, I contain potentially multitudes
  2015-10-15 
*/

public class Repeater{
    public static String fenceW(int posts){
	int a=0;
	String fence="";
	if (posts>a &&
	    posts>=0)
	    { fence="|"; a+=1;//make the first post
		while (posts>a &&
		       posts>=1)
		    { fence+="--|"; a+=1; } }//make extra posts
	else if (posts<0){ return "error: neg posts"; }
	return fence;
    }
    public static String fenceR(int posts){
	int a=0;
	String fence="";
	if (posts==1){fence="|";}//make the first post
	if (posts>1){
	    //body
	    fence+="|--";//the when posts reaches 1, the last post will be added on
	    fence+=fenceR(posts-1);//recursion, add the strings
	    //end body
	}
	else if (posts<0){return "error: neg posts";}
	return fence;
    }
    public static void main(String[] args){
	//fenceW() test cases
	System.out.println(fenceW(-3));//error
	System.out.println(fenceW(1));//|
	System.out.println(fenceW(2));//|--|
	System.out.println(fenceW(3));//|--|--|
	System.out.println(fenceW(0));//
	//fenceR() test cases
	System.out.println(fenceR(-3));//error
	System.out.println(fenceR(1));//|
	System.out.println(fenceR(2));//|--|
	System.out.println(fenceR(3));//|--|--|
	System.out.println(fenceR(0));//
    }
}
