/*
  Janet Zhang
  APCS1 pd5
  HW<24> -- I Was Born a Gamblin’ Man
  2015-11-04
*/

//class Slots
//simulates a slot machine in your very own terminal

public class Slots {

    private static final String[] FRUITS = {
	"lime", "lime", "lime", 
	"lemon", "lemon", "lemon", 
	"cherry", "cherry", "cherry", 
	"orange", "orange", "orange", 
	"grapefruit", "grapefruit", "grapefruit", 
	"tangerine", "tangerine", "tangerine", 
	"ugli", "ugli", "ugli",
	"peach", "peach", "peach"
    };//array of 24 slots
    private String[] _fruits; //to be init'd by each instance


    /*=====================================
      Slots() -- default constructor
      pre:  constant array FRUITS exists, has been initialized
      post: mutable array _fruits contains same elements as FRUITS
      =====================================*/
    public Slots() {

	//allocate memory for _fruits based on size of FRUITS
	_fruits= new String[FRUITS.length];

	//copy elements of FRUITS into _fruits
	for (int i=0;i<FRUITS.length;i++){
	    _fruits[i]=FRUITS[i];
	}
    }


    /*=====================================
      String toString() -- overrides inherited toString()
      pre:  
      post: returns String of elements in slots 0 thru 2, separated by tabs
      =====================================*/
    public String toString() {
        String r="";
	int i=0;
	while (i<3){
	    r+=_fruits[i]+"\t";
	    i++;
	}
	r=r.substring(0,r.length()-1);//take away extra end comma
	return r;
	//return _fruits[0] + "\t" + _fruits[1] + "\t" +_fruits[2]
    }//from ArrayUtils.java stringArray method


    /*=====================================
      void swap(int,int) -- array swap util fxn
      pre:  _fruits array exists
      post: elements at indices i, j are swapped
      =====================================*/
    private void swap( int i, int j ) {
	String temp=_fruits[i];//temp=i
	_fruits[i]=_fruits[j];//i=j
	_fruits[j]=temp;//j=temp
    }


    /*=====================================
      void spinOnce() -- simulate a pull of the slot machine lever
      pre:  _fruits array exists
      post: randomized order of elements in _fruits array
      =====================================*/
    public void spinOnce() {
	for (int x=0;x<_fruits.length;x++){
	    int i=x;
	    //int i=(int)(FRUITS.length*Math.random());
	    int j=(int)(FRUITS.length*Math.random());
	    swap(i,j);
	}
    }


    /*=====================================
      boolean jackpot() -- checks for a winning combo
      pre:  _fruits is existing array
      post: returns true if first 3 slots represent winning combo,
      false otherwise
      =====================================*/
    public boolean jackpot() {
	if (_fruits[0].equals(_fruits[1]) &&
	    _fruits[0].equals(_fruits[2])){return true;}
	return false;
    }


    /*=====================================
      boolean miniWin() -- checks for a winning combo
      pre:  _fruits is existing array
      post: returns true if first 3 slots represent winning combo,
      or if first 3 slots mutually distinct, 
      false otherwise
      =====================================*/
    public boolean miniWin() {
	if (jackpot() ^
	    !_fruits[0].equals(_fruits[1]) &&
	    !_fruits[0].equals(_fruits[2]) &&
	    !_fruits[1].equals(_fruits[2])){return true;}
	return false;
    }
    

    //main() method for testing
    public static void main( String[] args ) {
	//usage: move bar below down 1 line at a time to test functionality...
	Slots machine01 = new Slots();
	Slots machine02 = new Slots();

	//test to verify slot machines function indepently
	System.out.println();
	System.out.println( "Machine01 initial state:\t" + machine01 );
	System.out.println( "Machine02 initial state:\t" + machine02 );

	System.out.println( "\nSpinning machine01...\n" );

	machine01.spinOnce();

	System.out.println();
	System.out.println( "Machine01 state:\t" + machine01 );
	System.out.println( "Machine02 state:\t" + machine02 );
	System.out.println();


	//test gamble-until-you-win mechanism

	System.out.println( "Preparing to spin until a mini win! . . ." );
	System.out.println( "------------------------------------" );

	//if you haven't won, spin again until you win!
	while( machine01.miniWin() == false ) {
	    System.out.println( "Your spin..." + "\t" + machine01 );
	    System.out.println( "LOSE\n" );
	    machine01.spinOnce();
	}

	System.out.println( "====================================" );
	System.out.println( "Your spin..." + "\t" + machine01 );
	System.out.println( "WIN\n" );



	System.out.println( "Preparing to spin until...jackpot! . . ." );
	System.out.println( "------------------------------------" );

	//if you haven't won, spin again until you win!
	while( machine01.jackpot() == false ) {
	    System.out.println( "Your spin..." + "\t" + machine01 );
	    System.out.println( "LOSE\n" );
	    machine01.spinOnce();
	}

	System.out.println( "====================================" );
	System.out.println( "Your spin..." + "\t" + machine01 );
	System.out.println( "JACKPOT!\n" );
	/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main

}//end class Slots
