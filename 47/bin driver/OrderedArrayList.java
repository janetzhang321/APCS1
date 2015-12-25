/*
  Janet Zhang
  APCS1 pd5
  HW47 -- 
  2015-12-11
*/

/*============================================
  class OrderedArrayList
  Wrapper class for ArrayList.
  Imposes the restriction that stored items 
  must remain sorted in ascending order
  ============================================*/

//ArrayList's implementation is in the java.util package
import java.util.ArrayList;


public class OrderedArrayList {

    // instance of class ArrayList, holding objects of type Comparable 
    // (ie, instances of a class that implements interface Comparable)
    private ArrayList<Comparable> _data;


    // default constructor initializes instance variable _data
    public OrderedArrayList() {_data = new ArrayList<Comparable>();}
    public String toString() {return _data.toString(); }
    public Comparable remove( int index ) {return _data.remove(index);}
    public int size() {return _data.size();}
    public Comparable get( int index ) {return _data.get(index);}
    

    // addLinear takes as input any comparable object 
    // (i.e., any object of a class implementing interface Comparable)
    // inserts newVal at the appropriate index
    // maintains ascending order of elements
    // uses a linear search to find appropriate index
    public void addLinear( Comparable newVal ) 
    { 
	for( int p = 0; p < _data.size(); p++ ) {
	    if ( newVal.compareTo( _data.get(p) ) < 0 ) { //newVal < oal[p]
		_data.add( p, newVal );
		return; //Q:why not break?
	    }//end if 
	}//end for
	_data.add( newVal ); //newVal > every item in oal, so add to end
    }


    // addBinary takes as input any comparable object 
    // (i.e., any object of a class implementing interface Comparable)
    // inserts newVal at the appropriate index
    // maintains ascending order of elements
    // uses a binary search to find appropriate index
    
    public void addBinary( Comparable newVal ) {
	//initialize upperbound, lowerbound and median
	int lo = 0;
	int med = 0;
	int hi = _data.size()-1;
	//exceptions for comparing lo and hi
	if (hi<0) { _data.add(newVal); return; }
	if (newVal.compareTo(_data.get(hi))>0) { _data.add(newVal); return; }
	if (newVal.compareTo(_data.get(lo))<0) { _data.add(lo,newVal); return; }
	//if newVal is between anything
	for (med=(int)((lo+hi)/2.0+.5);hi-lo>1;med=(int)((lo+hi)/2.0+.5)){//while diff>1, change med
	    if (newVal.compareTo(_data.get(med))>0){lo=med;}//change lo
	    else if (newVal.compareTo(_data.get(med))<0){hi=med;}//change hi
	}
	_data.add( med,newVal );return;//do this when position is figured out
    }


    // main method solely for testing purposes
    public static void main(String[] args){
	OrderedArrayList Franz = new OrderedArrayList();
	OrderedArrayList Euroz = new OrderedArrayList();
	for( int i = 0; i < 15; i++ ) {
	    int valToAdd = (int)( 50 * Math.random() );
	    System.out.println( valToAdd );
	    Franz.addLinear( valToAdd );
	}

	//Euroz=Franz;

	System.out.println("\nFranz after population via addLinear() calls:");
	System.out.println( Franz );
	System.out.println();
	
	for( int i = 0; i < 10; i++ ) {
	    int valToAdd = (int)( 50 * Math.random() );
	    System.out.println( valToAdd );
	    Euroz.addBinary( valToAdd );
	}

	System.out.println("\nEuroz after population via addBinary() calls:");
	System.out.println( Euroz );
	System.out.println();
	
    }

}//end class OrderedArrayList
 
