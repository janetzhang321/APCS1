public class String2{
    //Given a string, return a string where for every char in the original, there are two chars. 
    public static String doubleChar(String str) {
	String nstr="";
	for(;
	    str.length()>0;//while length>0
	    str=str.substring(1)){//takes the first letter away from str
	    nstr+=str.substring(0,1)+str.substring(0,1);//add the letter to the end of nstr twice
	}
	return nstr;
    }

    //Return the number of times that the string "hi" appears anywhere in the given string. 
    public static int countHi(String str) {
	int i=0;//counter
	for(;str.length()>0;){//if length of str is greater than 0, proceed
	    if ( str.substring(0,1).equals("h")&&//first letter=h
		 str.length()>1 ){//if length is more than 1
		if ( str.substring(1,2).equals("i") ){i++;str=str.substring(1);}//second letter is i
		else { str=str.substring(1); }//else str is shortened by first letter
	    }
	    else { str=str.substring(1); }//else str is shortened
	}
	return i;
    }
    
    public static boolean catDog(String str){
	int c=0; int d=0;
	for(;str.length()>2;){
	    if (str.substring(0,1).equals("c")||str.substring(0,1).equals("d")){
		if ( str.substring(0,1).equals("c")&&
		     str.substring(1,2).equals("a")&&
		     str.substring(2,3).equals("t") )
		    {c++;str=str.substring(3);}
		else if ( str.substring(0,1).equals("d")&&
			  str.substring(1,2).equals("o")&&
			  str.substring(2,3).equals("g") )
		    {d++;str=str.substring(3);}
		else{str=str.substring(1);}
	    }
	    else{str=str.substring(1);}
	}
	if (str.length()>0)catDog(str.substring(1));
	if (c==d)return true; else{return false;}//return
    }
    
    public static boolean endOther(String a, String b) {
	a=a.toLowerCase(); b=b.toLowerCase();
	if ( a.length()==b.length()&&
	     a.equals(b) ){return true;}
	if ( a.length()<b.length() ) {return b.substring( b.length()-a.length() ).equals(a);}
	return a.substring( a.length()-b.length() ).equals(b);
    }
    public static boolean xyzThere(String str) {
	int i=0;
	for(i=1;i<str.length()-2;){
	    if (str.substring(i-1,i).equals("x")&&
		str.substring(i,i+1).equals("y")&&
		str.substring(i+1,i+2).equals("z"))
		{return true;}
	    else if (str.substring(i-1,i).equals(".")&&
		     str.substring(i,i+1).equals("x")&&
		     str.substring(i+1,i+2).equals("y")&&
		     str.substring(i+2,i+3).equals("z"))
		{str=str.substring(i+3); i=1;}
	    else {i++;}}
	if (str.length()<3){return false;}
	return 
	    str.substring(i-1,i).equals("x")&&
	    str.substring(i,i+1).equals("y")&&
	    str.substring(i+1,i+2).equals("z");}
    
	public static void main(String[] args){
    
	    /*
	      System.out.println(doubleChar("The")); //"TThhee"
	      System.out.println(doubleChar("AAbb")); //"AAAAbbbb"
	      System.out.println(doubleChar("Hi-There")); //"HHii--TThheerree"
	    */
	    /*
	      System.out.println(countHi("abc hi ho"));//1
	      System.out.println(countHi("ABChi hi"));//2
	      System.out.println(countHi("hihi"));//2
	    */
	    /*
	      System.out.println(catDog("catdog"));//true
	      System.out.println(catDog("catcat"));//false
	      System.out.println(catDog("1cat1cadodog"));//true
	    */
	    /*
	      System.out.println(countCode("aaacodebbb")); //1
	      System.out.println(countCode("codexxcode")); //2
	      System.out.println(countCode("cozexxcope")); //2

	    */
	    /*
	      System.out.println(endOther("Hiabc", "abc"));//true
	      System.out.println(endOther("AbC", "HiaBc"));//true
	      System.out.println(endOther("abc", "abXabc"));//true
	    */
	
	    System.out.println(xyzThere("abcxyz"));//true
	    System.out.println(xyzThere("abc.xyz"));//false
	    System.out.println(xyzThere("xyz.abc"));//true
	    System.out.println(xyzThere("xy"));//false
	    System.out.println(xyzThere("abc.xyzxyz"));//true
	
	}
    }

