/*=============================
  driver for class Coin
  ~~~ SUGGESTED WORKFLOW: ~~~
  1. Compile this file and run.
  2. Cut&paste the "TOP" line below the first statement. 
  (with cursor at beginning of TOP line, C-k C-k, DOWN, DOWN, C-y)
  3. Compile and run again. 
  4. Resolve errors 1 at a time until it works
  5. Repeat 2-4 until TOP meets BOTTOM
  =============================*/

public class Driver {
    public static void main( String[] args ) {

	//build Objects from blueprint specified by class Coin

	//test default constructor
	Coin mine = new Coin();

	//test 1st overloaded constructor
	Coin yours = new Coin( "quarter" );

	//test 2nd overloaded constructor
	Coin wayne = new Coin( "dollar", "heads" );
	//System.out.println(yours.getUpFace());
	/*
	//test toString() methods of each Coin
	System.out.println("mine: " + mine);
	System.out.println("yours: " + yours);
	System.out.println("wayne: " + wayne);

	//test flip() method
	System.out.println("\nAfter flipping...");
	yours.flip();
	wayne.flip();
	System.out.println("yours: " + yours);
	System.out.println("wayne: " + wayne);

	//test equals() method
	if ( yours.equals(wayne) ) 
	System.out.println( "Matchee matchee!" );
	else
	System.out.println( "No match. Firestarter you can not be." );

	*/
	
	//a. flips until x heads have come up
	//While loop
	int x=10;
	while (yours.getHeadsCtr()<x){
	    yours.flip();
	    //System.out.println(headsCtr);
	}
        System.out.println( "heads:" + yours.getHeadsCtr() + "\nflips:" + yours.getFlipCtr() );
	
	//b. flips until y matches have come up
	int y=5;
	int matches=0;
	while (matches<y){
	    yours.flip();
	    mine.flip();
	    if (yours.getUpFace()==mine.getUpFace()){
		matches+=1;}
	    /*else{
	      yours.flip();
	      mine.flip();
	      }*/
	}
	System.out.println("yours and mine matches:" + matches);

	//c. flip until at least 13 matches have come up, and the number of matches is divisible by both the number of heads so far and number of tails

	matches=0;
	mine=new Coin();
	yours=new Coin("quarter");//reset
	while (matches<13){
	    yours.flip();
	    mine.flip();
	    if (yours.equals(mine)){
		matches+=1;}
	    /*else{
	      yours.flip();
	      mine.flip();
	      }*/
	}
	while (matches%yours.getValue()!=0 && matches%mine.getValue()!=0){
	    yours.flip();
	    mine.flip();
	    if(yours.getValue()==mine.getValue()){
		matches+=1;
	    }
	    
	}
	System.out.println(matches);
	System.out.println("mine value:"+ mine.getValue());
	System.out.println("yours value:"+yours.getValue());
	System.out.println("number of flips:"+yours.getFlipCtr());
	
	/*===================TOP==========================

	  ====================BOTTOM======================*/

    }//end main

}//end class
