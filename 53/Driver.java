import java.util.ArrayList;
public class Driver{
    public static void main(String[] args){
	//ArrayList<Comparable> a=new ArrayList<Comparable> ();
	/*============================================
	ArrayList glen = new ArrayList<Integer>();
	glen.add(7);
	glen.add(1);
	glen.add(5);
	glen.add(12);
	glen.add(3);
	System.out.println( "ArrayList glen before sorting:\n" + glen );
	//System.out.println(bogoSort(glen));
	//System.out.println(glen);
	MySorts.bogoSortV(glen);
	System.out.println( "ArrayList glen after sorting:\n" + glen );
	  ============================================*/
	
	/*===============for VOID methods=============
	  ArrayList coco = MySorts.populate( 10, 1, 1000 );
	  System.out.println( "ArrayList coco before sorting:\n" + coco );
	  MySorts.bogoSortV(coco);
	  System.out.println( "ArrayList coco after sorting:\n" + coco );
	  ============================================*/

	  ArrayList glen = new ArrayList<Integer>();
	  glen.add(7);
	  glen.add(1);
	  glen.add(5);
	  glen.add(12);
	  glen.add(3);
	  System.out.println( "ArrayList glen before sorting:\n" + glen );
	  ArrayList glenSorted = MySorts.bogoSort( glen );
	  System.out.println( "sorted version of ArrayList glen:\n" 
	  + glenSorted );
	  System.out.println( "ArrayList glen after sorting:\n" + glen );

	  ArrayList coco = MySorts.populate( 10, 1, 1000 );
	  System.out.println( "ArrayList coco before sorting:\n" + coco );
	  ArrayList cocoSorted = MySorts.bogoSort( coco );
	  System.out.println( "sorted version of ArrayList coco:\n" 
	  + cocoSorted );
	  System.out.println( "ArrayList coco after sorting:\n" + coco );
	  System.out.println( coco );
	/*==========for AL-returning methods==========
	  ============================================*/
    }
}
