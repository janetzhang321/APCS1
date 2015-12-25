/*
  Janet Zhang
  APCS1 pd5
  HW34 -- Arrays of Arrays
  2015-11-19
*/
// skeleton file for 
// class TwoDimArray
// ...practice working with 2D arrays


public class TwoDimArray {

    //postcond: prints each row of 2D integer array a on its own line
    //          uses a FOR loop
    public static void print1( int[][] a ) { 
	// *** YOUR IMPLEMENTATION HERE ***
	for(int i=0;i<a.length;i++){
	    for(int k=0;k<a[i].length;k++){System.out.print(a[i][k]+"\t");}
	    System.out.print("\n");
	}
    }

    //postcond: prints each row of 2D integer array a on its own line
    //          uses a FOREACH loop
    public static void print2( int[][] a ) {
	// *** YOUR IMPLEMENTATION HERE ***
	for(int i[]:a){
	    for(int k:i){
		System.out.print(k+"\t");}
	    System.out.print("\n");
	}
    }

    //postcond: returns sum of all items in 2D int array a
    public static int sum1( int[][] a ) { 
	// *** YOUR IMPLEMENTATION HERE ***
	int sum=0;
	for(int i[]:a){
	    for(int k:i){sum+=k;}
	}
	return sum;
    }

    //postcond: returns sum of all items in 2D int array a
    //          * uses helper fxn sumRow
    public static int sum2( int [][] m ) { 
	// *** YOUR IMPLEMENTATION HERE ***
        int sum=0;
	for(int r=0;r<m.length;r++){
	    sum+=sumRow2(r,m);
	}
	return sum;
    }


    //postcond: returns sum of all items on row r of 2D integer array a
    //          uses a FOR loop
    public static int sumRow( int r, int[][] a ) { 
	// *** YOUR IMPLEMENTATION HERE ***
	int sum=0;
	for(;r<a.length;r++){
	    for(int c=0;c<a[r].length;c++){
		sum+=a[r][c];
	    }
	}
	return sum;
    }

    //postcond: returns sum of all items on row r of 2D integer array a
    //          uses a FOREACH loop
    public static int sumRow2(int r, int[][] m){ 
	// *** YOUR IMPLEMENTATION HERE ***
        int sum=0;
	for(int num:m[r]){
	    sum+=num;
	}
	return sum;
    }


    public static void main(String [] args) {
	  int [][] m1 = new int[4][2];
	  int [][] m2 = { {2,4,6}, {3,5,7} };
	  int [][] m3 = { {2}, {4,6}, {1,3,5} };
	  print1(m1);
	  print1(m2);
	  print1(m3);
	  print2(m1);
	  print2(m2);
	  print2(m3);
	  System.out.print("testing sum1...\n");
	  System.out.println("sum m1 : " + sum1(m1));
	  System.out.println("sum m2 : " + sum1(m2));
	  System.out.println("sum m3 : " + sum1(m3));
	  System.out.print("testing sum2...\n");
	  System.out.println("sum m1 : " + sum2(m1));
	  System.out.println("sum m2 : " + sum2(m2));
	  System.out.println("sum m3 : " + sum2(m3));
	/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }

}//end class TwoDimArray