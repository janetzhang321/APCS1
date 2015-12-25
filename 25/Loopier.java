/*
  Janet Zhang
  APCS1 pd5
  HW25 -- Recurse, Recurse, on Elements Not the First! 
  2015-11-05
*/

public class Loopier{

    
    
    public static void main(String[] args){
	int[] a= {1,2,3,1,1,6};
	int target=7;
	System.out.println(linSearch(a, target));
	System.out.println(linSearchR(a, target));
	System.out.println(freq(a, target));
	System.out.println(freqRec(a, target));
    }
}
