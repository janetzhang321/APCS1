/*=============================
  driver for class Coin
  Uses 3 while loops to simulate series of coin flips.
  =============================*/

public class Driver {

    //helper fxn for displaying relevant info
    public static void printStats( Coin c ) {
	System.out.println( "---Stats for " + c + "---" );
	System.out.println( "heads:\t" + c.getHeadsCtr() );
	System.out.println( "tails:\t" + c.getTailsCtr() );
	System.out.println( "flips:\t" + c.getFlipCtr() );
	System.out.println( "============================" );
    }


    public static void main( String[] args ) {

	//initialize 2 coins
	Coin miley = new Coin( "quarter" );
	Coin wayne = new Coin( "dollar", "heads" );


	//prepare to begin iterations...
	int x = 5;
	miley.reset("heads",0.5);  //change 2nd param to 0,1, or Math.random()*101/101.0 for fun
	wayne.reset("heads",0.5);  //change 2nd param to 0,1, or Math.random()*101/101.0 for fun

	System.out.println("\nRunning WHILE loop until " 
			   + x + " heads have appeared...");
	while( miley.getHeadsCtr() + wayne.getHeadsCtr() < x ) {
	    miley.flip();
	    wayne.flip();
	}//end while
	printStats(miley);
	printStats(wayne);


	//prepare to begin iterations...
	int y = 5;
	miley.reset("heads",0.5);
	wayne.reset("heads",0.5);
	int numMatches = 0;

	System.out.println("\nRunning WHILE loop until "
			   + y + " matches have appeared...");
	while( numMatches < y ) {
	    miley.flip();
	    wayne.flip();
	    if ( miley.equals(wayne) ) {
		System.out.println("We have a match!");
		numMatches = numMatches + 1;
	    }
	}//end while
	System.out.println( "matches:\t" + numMatches );
	printStats(miley);
	printStats(wayne);


	//prepare to begin iterations...
	miley.reset("heads",0.5);
	wayne.reset("heads",0.5);
	numMatches = 0;

	System.out.println("\nRunning WHILE loop until 13 matches have appeared, "
			   + "and # matches divisible by each coin's value in cents...");
	while( !( numMatches >= 13 
		  && numMatches % (miley.getValue()*100) == 0 
		  &&  numMatches % (wayne.getValue()*100) == 0) ) {
	    miley.flip();
	    wayne.flip();
	    if ( miley.equals(wayne) ) {
		System.out.println("We have a match!");
		numMatches = numMatches + 1;
	    }
	}//end while
	System.out.println( "matches:\t" + numMatches );
	printStats(miley);
	printStats(wayne);


	/*===================TOP==========================
	    ====================BOTTOM======================*/

    }//end main

}//end class
