/*
  Janet Zhang
  APCS1 pd5
  HW45 -- ascending
  2015-12-10
*/

/*============================================
  class OrderedArrayList
  Wrapper class for ArrayList.
  Imposes the restriction that stored items 
  must remain sorted in ascending order
  ============================================*/

//ArrayList's implementation is in the java.util package
import java.util.ArrayList;


//public class OrderedArrayList implements Comparable {
public class OrderedArrayList {

    // instance of class ArrayList, holding objects of type Comparable 
    // (ie, instances of a class that implements interface Comparable)
    private ArrayList<Comparable> _data;


    // default constructor initializes instance variable _data
    public OrderedArrayList() {_data=new ArrayList<Comparable>();}


    public String toString() { 
	String s="[";
	for(int i=0;i<_data.size();i++) s+=_data.get(i)+",";
	return s.substring(0,s.length()-1)+"]";
    }

    public Comparable remove( int index ) { return _data.remove(index);}//return the object that you removed
    public int size() { return this.size();}
    public Comparable get( int index ) { return _data.get(index);}


    // addLinear takes as input any comparable object 
    // (i.e., any object of a class implementing interface Comparable)
    // inserts newVal at the appropriate index
    // maintains ascending order of elements
    // uses a linear search to find appropriate index

    //Find approp index
    public int linSearch(Comparable a) {
	for(int i=0; i<_data.size(); i++){//for each object in the array
	    if ((_data.get(i)).compareTo(a)==0)//find the first instance of equality
		return i;}
	return -1;//no instance of equality
    }

    public void addLinear( Comparable newVal ) {
	if (this.linSearch(newVal)==-1){
	    //if newVal doesn't match
	    for(int i=0;i<_data.size();i++){
		//if newVal is between 2 nums in the array the array
		if((_data.get(i)).compareTo(newVal)>0){_data.add(i, newVal); break;}
	    }
	    //if everything in array is less than newVal 
	    _data.add(newVal);
	    
	}//end if
	else{//if newVal does match something in array
	    //then add newVal before the val of equal magnitude
		_data.add(linSearch(newVal),newVal);
	}//end else
    }//end addLin

    // main method solely for testing purposes
    public static void main( String[] args ) {

	OrderedArrayList Franz = new OrderedArrayList();

	System.out.println("\nValues to add via addLinear() calls:");

	// testing linear search
	for( int i = 0; i < 15; i++ ) {
	    //for( int i = 0; i < 1; i++ ) {
	    int valToAdd = (int)( 50 * Math.random() );
	    System.out.println( valToAdd );
	    Franz.addLinear( valToAdd );
	}

	System.out.println("\nafter population via addLinear() calls:");
	System.out.println( Franz );
	System.out.println();
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }

}//end class OrderedArrayList
 
