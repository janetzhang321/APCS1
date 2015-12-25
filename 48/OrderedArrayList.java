/*
  Janet Zhang
  APCS1 pd5
  HW48 -- Halfling Time Trials
  2015-12-<dd>
*/

import cs1.Keyboard;
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
    public String toString() { return _data.toString();}
    public Comparable remove( int index ) {  return _data.remove(index);}
    public int size() { return _data.size();}
    public Comparable get( int index ) { return _data.get(index);}


    // addLinear takes as input any comparable object 
    // (i.e., any object of a class implementing interface Comparable)
    // inserts newVal at the appropriate index
    // maintains ascending order of elements
    // uses a linear search to find appropriate index
    public void addLinear( Comparable newVal ) { 
        int index = 0;
        int check = _data.size();
        for ( ; index < check ; index++) if(_data.get(index).compareTo(newVal) >= 0) break;
        _data.add(index, newVal);
    }
    
    public void addBilinear( Comparable newVal ) {
        int low, med;
        low = med = 0;
        int high = _data.size()-1;
        if (high == -1 || _data.get(high).compareTo(newVal) < 0) _data.add(newVal);
        else {
            while (low != high) {
                med = (int)((low+high)/2);
                if(_data.get(med).compareTo(newVal) < 0) low = med+1;
                else high = med; }
            _data.add(low, newVal); }
    }
    
    public int linSearch( Comparable newVal ) {
        int index = 0;
        int check = _data.size();
        for ( ; index < check ; index++) if(_data.get(index).equals(newVal)) return index;
        return -1;
    }
    
    public int bilinSearch( Comparable newVal ) {
        int low, med;
        low = med = 0;
        int high = _data.size()-1;
        if (high == -1 || _data.get(high).compareTo(newVal) < 0) return -1;
        else if (_data.get(high).compareTo(newVal) == 0) return high;
        else {
            while (low != high) {
                med = (int)((low+high)/2);
                if (newVal.compareTo(_data.get(med)) > 0) low = med + 1;
                else if(newVal.compareTo(_data.get(med)) < 0) high = med;
                else return med; }
            return -1;}
    }
    

    // main method solely for testing purposes
    public static void main( String[] args ) {

	OrderedArrayList Franz = new OrderedArrayList();
	long start,end;
	int input;
	for (long x = 0; x < 10000000 ; x++) Franz.addBilinear(x);
	System.out.println("\nType 0 for linSearch and 1 for bilinSearch");
	input = Integer.parseInt(Keyboard.readString());
	if (input == 0) {
	    for (long t = 0; t < 10000000 ; t+=111111) {
	        start = System.currentTimeMillis();
	        System.out.println(Franz.findLin(t));
	        end = System.currentTimeMillis();
	        System.out.println(end - start +"\n"); 
	    }
	}
	else {
	    for (long t = 0; t < 10000000 ; t+=111111) {
	        start = System.currentTimeMillis();
	        System.out.println(Franz.findBin(t));
	        end = System.currentTimeMillis();
	        System.out.println(end - start +"\n"); 
	    }
        }
    }
}//end class OrderedArrayList
 
