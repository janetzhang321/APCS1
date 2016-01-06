/*
  Janet Zhang
  APCS1 pd5
  HW53 -- Poker Face
  2016-01-04
*/

/*
  Q1: Is more work done toward beginning or end of insertion sort? Why? 
  A1:end, there are more elements to CompareTo.
  Q2: For n items, how many passes are necessary to sort?
  A2:n-1
  Q3: What is known after pass p, and how do you know it?
  A3:p+1 elements are sorted
  Q4: What is the runtime classification of this sort?
  A4:x^2
*/

/*======================================
  class InsertiontionSort -- implements InsertionSort algorithm
  ======================================*/

import java.util.ArrayList;

public class InsertionSort {

    //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
    //precond: lo < hi && size > 0
    //postcond: returns an ArrayList of random integers
    //          from lo to hi, inclusive
    public static ArrayList populate( int size, int lo, int hi ) {
	ArrayList<Integer> retAL = new ArrayList<Integer>();
	while( size > 0 ) {
	    //     offset + rand int on interval [lo,hi]
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
	}
	return retAL;
    }

    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al ) {
	int randomIndex;
        for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
            randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
            al.set( i, al.set( randomIndex, al.get(i) ) );
        }
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public static int findMin(ArrayList<Comparable> a, int start){
	int min=start;
	for(int i=min;i<a.size();i++){
	    if ( ( a.get(i) ).compareTo( a.get(min) )<=0 ) min=i;
	}
	return min;
    }

    public static int shifter(int x,ArrayList<Comparable> data){
	Comparable temp=(data.get(x));//old val
	for (int y=x-1;y>=0;y--){
	    if (data.get(y).compareTo(temp)>0){
		Comparable temp1=data.get(y);
		data.set(y+1,temp1);
	    }
	    else{return y+1;}
	}
	return 0;
    }//O(x)

    // VOID version of InsertionSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void insertionSortV( ArrayList<Comparable> data ) {
	/* your implementation UP IN HERE, UP IN HERE */
	Comparable temp=0;
        for(int i=1;i<data.size();i++){
	    temp=data.get(i);
	    data.set(shifter(i,data), temp);
	}
    }//end insertionSort -- O(x^2)

    // ArrayList-returning insertionSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.

    public static ArrayList<Comparable> insertionSort( ArrayList<Comparable> input ) {
    	/* your implementation UP IN HERE, UP IN HERE */
    	ArrayList<Comparable> a=new ArrayList<Comparable> ();
    	for (int i=0;i<input.size();i++) {a.add(input.get(i));}
    	insertionSortV(a);
	return a;
    }//end insertionSort -- O(x^2)


    //main method for testing
    public static void main( String [] args ) {

	/*============================================
	  ArrayList glen = new ArrayList<Integer>();
	  glen.add(7);
	  glen.add(1);
	  glen.add(5);
	  glen.add(12);
	  glen.add(3);
	  System.out.println( "ArrayList glen before sorting:\n" + glen );
	  //System.out.println(insertionSort(glen));
	  //System.out.println(glen);
	  insertionSortV(glen);
	  System.out.println( "ArrayList glen after sorting:\n" + glen );
	  ============================================*/
	
	  ArrayList coco = populate( 10, 1, 1000 );
	  System.out.println( "ArrayList coco before sorting:\n" + coco );
	  insertionSortV(coco);
	  System.out.println( "ArrayList coco after sorting:\n" + coco );
	/*===============for VOID methods=============
	  ============================================*/

	/*==========for AL-returning methods==========
	  ArrayList glen = new ArrayList<Integer>();
	  glen.add(7);
	  glen.add(1);
	  glen.add(5);
	  glen.add(12);
	  glen.add(3);
	  System.out.println( "ArrayList glen before sorting:\n" + glen );
	  ArrayList glenSorted = insertionSort( glen );
	  System.out.println( "sorted version of ArrayList glen:\n" 
	  + glenSorted );
	  System.out.println( "ArrayList glen after sorting:\n" + glen );

	  ArrayList coco = populate( 10, 1, 1000 );
	  System.out.println( "ArrayList coco before sorting:\n" + coco );
	  ArrayList cocoSorted = insertionSort( coco );
	  System.out.println( "sorted version of ArrayList coco:\n" 
	  + cocoSorted );
	  System.out.println( "ArrayList coco after sorting:\n" + coco );
	  System.out.println( coco );
	  ============================================*/

    }//end main

}//end class InsertionSort
