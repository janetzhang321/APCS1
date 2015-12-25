/*
  Team Eamtay - Janet Zhang, Christopher Sherling, Dorothy Ng
  APCS1 pd5
  HW22 -- Otnay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay
  2015-10-28
*/

//class Pig --- SKELETON
//a Pig Latin translator

import java.util.Scanner;

public class Pig {

    private static final String VOWELS = "AaEeIiOoUu";
    private static final String PUNCTUATION = ",.?!";


    /*=====================================
      boolean hasA(String,String) -- checks for a letter in a String
      pre:  w != null, letter.length() == 1
      post: hasA("cat", "a") â†’ true  
      hasA("cat", "p") â†’ false
      =====================================*/
    public static boolean hasA( String w, String letter ) {
	//return w.indexOf(letter) !=-1;
	for (;w != null&&letter.length() == 1&&w.length()>0;w=w.substring(1)){
	    if (letter.equals(w.substring(0,1))){return true;}
	}
	return false; //placeholder to get past compiler
	

    }//end hasA()


    /*=====================================
      boolean isAVowel(String) -- tells whether a letter is a vowel
      precondition: letter.length() == 1
      =====================================*/
    public static boolean isAVowel( String letter ) {
        return hasA(VOWELS, letter);
    }


    /*=====================================
      int countVowels(String) -- counts vowels in a String
      pre:  w != null
      post: countVowels("meatball") â†’ 3
      =====================================*/
    public static int countVowels( String w ) {
	int c=0;
	for(;w!=null&&w.length()>0;
	    w=w.substring(1)){
	    if (isAVowel(w.substring(0,1))){c++;}
	}
	if (c>0){return c;}
	return -1; //placeholder to get past compiler
	    
    }


    /*=====================================
      boolean hasAVowel(String) -- tells whether a String has a vowel
      pre:  w != null
      post: hasAVowel("cat") â†’ true
      hasAVowel("zzz") â†’ false
      =====================================*/
    public static boolean hasAVowel( String w ) {
	for (;w!=null&& w.length()>0;w=w.substring(1)){
	    if (isAVowel(w.substring(0,1))){return true;}
	}
	
	return false; //placeholder to get past compiler
    }


    /*=====================================
      String allVowels(String) -- returns vowels in a String
      pre:  w != null
      post: allVowels("meatball") --> "eaa"
      =====================================*/
    public static String allVowels( String w ) {
	String s="";
	for (;w!=null&&w.length()>0;w=w.substring(1)){
	    if (isAVowel(w.substring(0,1))){s+=w.substring(0,1);}
	}
	if (s.length()>0){return s;}
	return ""; //placeholder to get past compiler
    }


    /*=====================================
      String firstVowel(String) -- returns first vowel in a String
      pre:  w != null
      post: firstVowel("") --> ""
      firstVowel("zzz") --> ""
      firstVowel("meatball") --> "e"
      =====================================*/
    public static String firstVowel( String w ) {
	String ret="";
	String tempW="";
	int iOfY=w.indexOf("y");
	if (hasAVowel(w)){ //gets the first char in allVowels
	    ret=allVowels(w).substring(0,1);
	}
	if (ret.equals("u")||ret.equals("U")){
	    tempW=w.toLowerCase();
	    if (tempW.substring(tempW.indexOf("u")-1,tempW.indexOf("u")).equals("q")){
		return firstVowel(w.substring(tempW.indexOf("u")+1));
	    }
	}
	if (w.indexOf(ret)>iOfY||ret.equals("")){ //if "y" comes before a vowel or doesnt exist
	    if (iOfY==-1||iOfY==0){ //do not modify ret if "y" doesnt exist or is the first letter
		return ret;
	    }
	    else{ 
		if (hasA(VOWELS,w.substring(iOfY-1,iOfY))==false){//check if letter preceding y is a consonant
		    ret=w.substring(iOfY,iOfY+1); //if yes then set "y" as the first vowel
		}
	    }
	}
	return ret; //placeholder to get past compiler
    }


    /*=====================================
      boolean beginsWithVowel(String) -- tells whether String begins with a vowel
      pre:  w != null and w.length() > 0
      post: beginsWithVowel("apple")  --> true
      beginsWithVowel("strong") --> false
      =====================================*/
    public static boolean beginsWithVowel( String w ) {
	for (;w != null && w.length() > 0;w=""){
	    if(isAVowel(w.substring(0,1))){return true;}
	}
	return false; //placeholder to get past compiler
    }

    /*=====================================
      String engToPig(String) -- converts an English word to Pig Latin
      pre:  w.length() > 0
      post: engToPig("apple")  --> "appleway"
      engToPig("strong") --> "ongstray"
      engToPig("java")   --> "avajay"
      =====================================*/
    //there's a group chat in the collab tab over yonder>>>>
    public static String engToPig( String w ) {
	for (int i = w.length(); i > 0;) {
	    if ( w.substring(0,1).equals( w.substring(0,1).toUpperCase() ) ){//UPPERCASE
		if (beginsWithVowel(w)){return w+"way";}//vowels
		//if (countVowels(w)==-1&&firstVowel(w)==""){return w+"ay";}//no vowels
		if (PUNCTUATION.indexOf(w.substring(i - 1, i)) != -1){
		    w= w.substring(w.indexOf(firstVowel(w)),i - 1)+
			w.substring(0,w.indexOf(firstVowel(w)))+
			"ay"+
			w.substring(i - 1, i);
		} //Attached the punctuation to the end, which should always be the last letter
		else{//consonants
		    w=w.substring(w.indexOf(firstVowel(w)),w.length())+
	               	w.substring(0,w.indexOf(firstVowel(w)))+
	               	"ay";}
	    	
		return w.substring(0,1).toUpperCase()+
		    w.substring(1).toLowerCase();}//make first letter Upper
	    
            if ( w.substring(0,1).equals( w.substring(0,1).toLowerCase() ) ){//lowercase
		if (beginsWithVowel(w)){return w+"way";}//vowels
		//if (countVowels(w)==-1&&firstVowel(w)==""){return w+"ay";}//no vowels
		if (PUNCTUATION.indexOf(w.substring(i - 1, i)) != -1){
		    w= w.substring(w.indexOf(firstVowel(w)),i - 1)+
			w.substring(0,w.indexOf(firstVowel(w)))+
			"ay"+
			w.substring(i - 1, i);
		} //Attached the punctuation to the end, which should always be the last letter
		else{//consonants
		    w=w.substring(w.indexOf(firstVowel(w)),w.length())+
	               	w.substring(0,w.indexOf(firstVowel(w)))+
	               	"ay";}
		return w;}
	}
	return w;}

    public static void main( String[] args ) {
	Scanner sc = new Scanner(System.in);
	String s;
	while (sc.hasNext()){
	    s=sc.next();
	    System.out.println(s+" --> "+engToPig(s));
	}

	/*//Some test calls. You are encouraged to add more.
	
	//String letter = "p";

	for( String word : args ) {
	//System.out.println( w + " has " + letter + "? " 
	//		    + hasA( w, letter ) );
	//}
	//System.out.println(isAVowel("a"));
	//System.out.println(countVowels("meatball"));
	//System.out.println(hasAVowel("grkjlkdf"));
	//System.out.println(allVowels("meatball"));
	//System.out.println(firstVowel("mrtiou"));
	//System.out.println(beginsWithVowel("pplip"));
	    
	//System.out.println( allVowels(word) );
	System.out.println( firstVowel(word) );
	System.out.println( countVowels(word) );
	System.out.println( engToPig(word) );
	}*/
	

    }//end main()

}//end class Pig

