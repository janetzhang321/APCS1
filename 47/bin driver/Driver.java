public class Driver{
    
    public static void main(String[] args){
	OrderedArrayList Franz = new OrderedArrayList();
	OrderedArrayList Euroz = new OrderedArrayList();
	for( int i = 0; i < 15; i++ ) {
	    int valToAdd = (int)( 50 * Math.random() );
	    System.out.println( valToAdd );
	    Franz.addLinear( valToAdd );
	}

	//Euroz=Franz;

	System.out.println("\nFranz after population via addLinear() calls:");
	System.out.println( Franz );
	System.out.println();
	
	for( int i = 0; i < 10; i++ ) {
	    int valToAdd = (int)( 50 * Math.random() );
	    System.out.println( valToAdd );
	    Euroz.addBinary( valToAdd );
	    }

	System.out.println("\nEuroz after population via addBinary() calls:");
	System.out.println( Euroz );
	System.out.println();
	
    }

}
