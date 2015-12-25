/*
  Janet Zhang
  APCS1 pd5
  HW21 -- Otnay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay
  2015-10-27
*/

//class Pig --- SKELETON
//a Pig Latin translator

public class Pig {

    private static final String VOWELS = "aeiou";


    /*=====================================
      boolean hasA(String,String) -- checks for a letter in a String
      pre:  w != null, letter.length() == 1
      post: hasA(“cat”, “a”) → true  
      hasA(“cat”, “p”) → false
      =====================================*/
    public static boolean hasA( String w, String letter ) {
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
        for (;letter.length()==1;){
	    return VOWELS.contains(letter);	    
	}
	return false; //placeholder to get past compiler
    }


    /*=====================================
      int countVowels(String) -- counts vowels in a String
      pre:  w != null
      post: countVowels(“meatball”) → 3
      =====================================*/
    public static int countVowels( String w ) {
	int c=0;
	for(;w!=null&&w.length()>0;
	    w=w.substring(1)){
	    if (VOWELS.contains(w.substring(0,1))){c++;}
	}
	if (c>0){return c;}
	return -1; //placeholder to get past compiler
    }


    /*=====================================
      boolean hasAVowel(String) -- tells whether a String has a vowel
      pre:  w != null
      post: hasAVowel(“cat”) → true
      hasAVowel(“zzz”) → false
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
      post: allVowels(“meatball”) → “eaa”
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
        String s="";
        for (;w!=null&&w.length()>0;w=w.substring(1)){
	    if (isAVowel(w.substring(0,1))){s=w.substring(0,1);return s;}
	}
	return s;
	//return ""; //placeholder to get past compiler
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
    public static String engToPig( String w ) {
        for (;w.length() > 0;) {
	    if (beginsWithVowel(w)){return w+"way";}
	    if (countVowels(w)==-1){return w;}
	    else {//append from first vowel to last
		return w.substring(w.indexOf(firstVowel(w)),w.length())+
		    w.substring(0,w.indexOf(firstVowel(w)))+
		    "ay";
	    }
	
	}
	return ""; //placeholder to get past compiler
    }


    public static void main( String[] args ) {

	//Some test calls. You are encouraged to add more.
	
	String letter = "p";

	for( String w : args ) {
	    System.out.println( w + " has " + letter + "? " 
				+ hasA( w, letter ) );
	}
	//System.out.println(isAVowel("a"));
	//System.out.println(countVowels("meatball"));
	//System.out.println(hasAVowel("grkjlkdf"));
	//System.out.println(allVowels("meatball"));
	//System.out.println(firstVowel("mrtiou"));
	//System.out.println(beginsWithVowel("pplip"));
	
	for( String word : args ) {
	    System.out.println( allVowels(word) );
	    System.out.println( firstVowel(word) );
	    System.out.println( countVowels(word) );
	    System.out.println( engToPig(word) );
	}
	

    }//end main()

}//end class Pig

