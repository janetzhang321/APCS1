
/*
  Janet Zhang
  APCS1 pd5
  HW23 -- Augmenting Your Array of Tools
  2015-11-02
*/

public class ArrayUtils{
    public static String stringArray(int[] array){
	String r="[";
	int i=0;
	while (i<array.length){
	    r+=array[i]+",";
	    i++;
	}
	r=r.substring(0,r.length()-1);//take away extra end comma
	return r+ "]";
    }
    
    public static void popArray(int[] array,int lower,int UPPER){
	int i=lower;
	for (;i<=UPPER;i++){
	    array[i]=(int)(Math.random()*10);
	}
	System.out.println(stringArray(array));
    }

    public static void main(String[] args){
	int[] a; a = new int[8];
	a[0]=5;a[1]=7;a[2]=8;a[3]=5;a[4]=7;a[5]=8;
	System.out.println(stringArray(a));
	popArray(a,6,7);
	/*
	  int[] a; a = new int[3];
	  a[0]=5;
	  a[1]=7;
	  a[2]=8;
	  System.out.println(a.length);
	  System.out.println(a[0]);
	  System.out.println(a[1]);
	  System.out.println(a[2]);
	*/
	//System.out.println(a);
	//System.out.println(Math.random()*10);

    }

}
