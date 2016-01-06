import java.util.ArrayList;

public class MySorts {

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

    public static boolean isSorted(ArrayList<Comparable> data){
	for (int i=0; i<data.size()-1;i++){
	    if (( data.get(i) ).compareTo( data.get(i+1) )>0){return false;}
	}
	return true;
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
    }//end bubbleSortV -- O(n^2)


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
    }//end bubbleSort -- O(n^2)

    public static int findMin(ArrayList<Comparable> a, int start){
	int min=start;
	for(int i=min;i<a.size();i++){
	    if ( ( a.get(i) ).compareTo( a.get(min) )<=0 ) min=i;
	}
	return min;
    }

    // VOID version of SelectionSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void selectionSortV( ArrayList<Comparable> data ) {
	/* your implementation UP IN HERE, UP IN HERE */
	int swaps=0;
	while ( swaps<data.size() ){
	    //System.out.println ("Data: " + data);	    
	    //System.out.println ("Swaps: " + swaps);
	    int min=findMin(data, swaps);
	    Comparable newMin=data.get(min);
	    Comparable firstI=data.get(swaps);
	    data.set(swaps, newMin);
	    data.set(min, firstI);
	    swaps++;
	}
	
    }//end selectionSort -- O(n^2)

    // ArrayList-returning selectionSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.

    public static ArrayList<Comparable> selectionSort( ArrayList<Comparable> input ) {
    	/* your implementation UP IN HERE, UP IN HERE */
    	ArrayList<Comparable> a=new ArrayList<Comparable> ();
    	for (int i=0;i<input.size();i++) {a.add(input.get(i));}
    	selectionSortV(a);
	return a;
    }//end selectionSort -- O(n^2)
    
    //Bogo Sort shuffles until arraylist isSorted
    public static void bogoSortV(ArrayList<Comparable> data){
	while ( !(isSorted(data)) ){
	    shuffle(data);
	}
    }

    public static ArrayList<Comparable> bogoSort(ArrayList<Comparable> input){
	ArrayList<Comparable> a=new ArrayList<Comparable>();
	for (int i=0;i<input.size();i++){a.add(i,input.get(i));}
	bogoSortV(a);
	return a;
    }
}