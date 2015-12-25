/*
  Janet Zhang
  APCS1 pd5
  HW27 -- Objectify Your Array Tools
  2015-11-09
*/

public class ArrayUtils{
    public static String stringify(Object[] array){
	String r="[";
	int i=0;
	while (i<array.length){
	    r+=array[i]+",";
	    i++;
	}
	r=r.substring(0,r.length()-1);//take away extra end comma
	return r+ "]";
    }
    
    public static void popArray(Object[] array,int lower,int UPPER){
	int i=lower;
	for (;i<=UPPER;i++){
	    array[i]=(int)(Math.random()*10);
	}
	System.out.println(stringify(array));
    }

    //Loopier methods
    
    public static int linSearchRH(Object[] a, Object target, int index) {
	if (index == a.length) {return -1;}
	else if (a[index].equals(target)) {return index;}
	else {return linSearchRH(a, target, index + 1);}
    }

    public static int linSearchR(Object[] a, Object target) {
	return linSearchRH(a, target, 0);
    }

    public static int freq( Object[] a, Object target ){
        int c=0;
	for (int i=0;i<a.length;i++){
	    if (a[i].equals(target)) {c++;}//add 1 to c everytime target and a[position] matches
	}
	return c;
    }
    
    public static void main(String[] args){
	/*
	Object[] a; a = new Object[8];
	a[0]=5;a[1]=8;a[2]=8;a[3]=5;a[4]=7;a[5]=8;
	System.out.println(stringifier(a));
	popArray(a,6,7);
	System.out.println( linSearchR(a,8) );
	System.out.println( freq(a,8) );
	*/
	Object[] intArr={9,0,2,1,0,3,4,7};
	Object[] strArr={"Hi","My","Name","Is","Janet"};
	  System.out.println("\n======INT ARRAY=====");
	  for (int i=0; i<intArr.length; i++) {
	  System.out.println( "intArr[" + i + "] DATA TYPE:" 
	  + (intArr[i]).getClass().getName() );
	  }
	  System.out.println("Stringify(intArr):\t" + stringify(intArr) +
	  "\nlinSearchR(intArr,0):\t" + linSearchR(intArr,0) +
	  "\nfreq(intArr, 0):\t" + freq(intArr, 0) + "\n"
	  );
	  System.out.println("=====STR ARRAY=====");
	  for (int i=0; i<strArr.length; i++) {
	  System.out.println( "strArr[" + i + "] DATA TYPE:" + 
	  (strArr[i]).getClass().getName() );
	  }
	  System.out.println("Stringify(strArr):\t" + stringify(strArr) +
	  "\nlinSearchR(strArr, \"Hi\"):\t" + linSearchR(strArr,"Hi") +
	  "\nfreq(strArr, \"Hi\"):\t" + freq(strArr, "Hi") + "\n");
	
    }
}
