/*
  Janet Zhang
  APCS1 pd5
  HW51 -- Dat Bubbly Tho
  2015-12-21
*/

/*======================================
  class BubbleSort -- implements bubblesort algorithm (vanilla version)
  ======================================*/

import java.util.ArrayList;

public class BubbleSort {

    //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
    //precond: lo < hi && size > 0
    //postcond: returns an ArrayList of random integers
    //          from lo to hi, inclusive
    public static ArrayList populate( int size, int lo, int hi ) 
    {
	ArrayList<Integer> retAL = new ArrayList<Integer>();
	while( size > 0 ) {
	    //     offset + rand int on interval [lo,hi]
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
	}
	return retAL;
    }


    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al ) 
    {
	int randomIndex;
	//setup for traversal fr right to left
        for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
            randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
            al.set( i, al.set( randomIndex, al.get(i) ) );
        }
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    // VOID version of bubbleSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void bubbleSortV( ArrayList<Comparable> data ) {
	int swaps=data.size();
	for(int j=0;j<swaps;j++){
	    for(int i=0;i<swaps-1;i++){
		//if before>after,
		if ((data.get(i)).compareTo(data.get(i+1))>0){
		    //retain vars
		    Comparable oldI1=data.get(i+1);
		    Comparable oldI=data.get(i);
		    //set before to old after and vice versa
		    data.set(i,oldI1);
		    data.set(i+1,oldI);
		}
	    }
	}
    }//end bubbleSortV -- O(?)


    // ArrayList-returning bubbleSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.
    public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input ){
	ArrayList<Comparable> a=new ArrayList<Comparable> (input.size());	
        for(int k=0;k<input.size();k++){
	    a.add(input.get(k));
	}
	int swaps=input.size();
	for(int j=0;j<swaps;j++){
	    for(int i=0;i<swaps-1;i++){
		//System.out.println("[j, i, get(i), get(i+1)] : ["+j+", "+i+", "+a.get(i)+", "+a.get(i+1)+"]");
		//System.out.println((input.get(i)).compareTo(input.get(i+1))>0);	
		if ((a.get(i)).compareTo(a.get(i+1))>0){
		    //retain vars
		    Comparable oldI1=a.get(i+1);
		    Comparable oldI=a.get(i);
		    //set before to old after and vice versa
		    a.set(i,oldI1);
		    a.set(i+1,oldI);
		    //System.out.println(a);
		}
	    }
	    //System.out.println("Array after "+j+" sorts: "+a);
	}
	return a;
    }//end bubbleSort -- O(?)


    public static void main(String [] args){
	/*
	ArrayList glen = new ArrayList<Integer>();
	glen.add(7);
	glen.add(1);
	glen.add(5);
	glen.add(12);
	glen.add(3);
	System.out.println( "ArrayList glen before sorting:\n" + glen );
	bubbleSortV(glen);
	System.out.println( "ArrayList glen after sorting:\n" + glen );

	ArrayList coco = populate( 10, 1, 1000 );
	System.out.println( "ArrayList coco before sorting:\n" + coco );
	bubbleSortV(coco);
	System.out.println( "ArrayList coco after sorting:\n" + coco );
	  ============================================*/
	/*
    	ArrayList a = new ArrayList<Integer>();
	a.add(7);
	a.add(1);
	a.add(5);
	a.add(12);
	a.add(3);
	System.out.println( "ArrayList a before sorting:\n" + a );
	ArrayList aSorted = bubbleSort( a );
	System.out.println( "sorted version of ArrayList a:\n" 
			    + aSorted );
	
	bubbleSortV( a );
	System.out.println( "ArrayList a after sorting:\n" + a );
	*/
      	ArrayList b = populate( 10, 1, 1000 );
	System.out.println( "ArrayList b before sorting:\n" + b );
	ArrayList bSorted = bubbleSort( b );
	System.out.println( "sorted version of ArrayList b:\n" 
			    + bSorted );
	bubbleSortV( b );
	System.out.println( "ArrayList b after sorting:\n" + b );
	//System.out.println( b );

	

	/*==========for AL-returning methods==========
	  ============================================*/

   

    }//end main

}//end class BubbleSort
