/*
  Janet Zhang
  APCS1 pd5
  HW39 -- Array of Steel
  2015-12-01
*/
/*****************************
 * SKELETON for
 * class SuperArray --  A wrapper class for an array. 
 * Maintains functionality:
   access value at index
   overwrite value at index
   * Adds functionality to std Java array:
   resizability
   ability to print meaningfully
*****************************/

public class SuperArray {

    //~~~~~INSTANCE VARS~~~~~
    //underlying container, or "core" of this data structure:
    private int[] _data;

    //position of last meaningful value
    private int _lastPos;

    //size of this instance of SuperArray
    private int _size;

		
    //~~~~~METHODS~~~~~
    //default constructor – initializes 10-item array
    public SuperArray() { 
	_data=new int[10];
	_lastPos=_data.length-1;
	_size=_lastPos+1;
    }


    //output array in [a,b,c] format, eg
    // {1,2,3}.toString() -> "[1,2,3]"
    public String toString() {
	String r="";	
	for(int i=0;i<_lastPos+1;i++){
	    r+=_data[i]+",";}
	r=r.substring(0,r.length()-1);
	return "["+r+"]";
    }


    //double capacity of this SuperArray
    private void expand() {
	int[] a= new int[_size*2];
	for(int i=0;i<_lastPos+1;i++){
	    a[i]=_data[i];
	}
	_data=a;
	_lastPos=_size;
	_size=_size*2;
    }


    //accessor -- return value at specified index
    public int get( int index ) {
	return _data[index];
    }


    //mutator -- set value at index to newVal, 
    //           return old value at index
    public int set( int index, int newVal ) {
	while(index>_size-1){
	    expand();
	}
	int old=_data[index];
	_data[index]=newVal;
	_lastPos=index;
	return old;
    }


    //main method for testing
    public static void main( String[] args ) {
	SuperArray a=new SuperArray();
	
	System.out.println("Printing array...\n");
	System.out.println(a.toString()+"\n");
	System.out.println("setting index 0 to int 10...\nindex 0 before: "+a.get(0));
	a.set(0,10);
	System.out.println("\ngetting index 0...\nindex 0 now: "+a.get(0)+"\n");
	System.out.println(a.toString());
	System.out.println("\nRandomly populating array...");
	for(int i=0;i<a._data.length;i++)
	    a.set(i,(int)(Math.random()*100));
	System.out.println("Printing array...\n");
	System.out.println(a.toString());
	System.out.println("lastPos:\t"+a._lastPos+"\nsize:\t"+a._size);
	System.out.println("\nSetting position 20 to int 69...");
	a.set(20,69);
	System.out.println("Printing array...\n");
	System.out.println(a.toString());
	System.out.println("lastPos:\t"+a._lastPos+"\nsize:\t"+a._size);
	
    }//end main
		
}//end class
