/*
  Janet Zhang
  APCS1 pd5
  HW54 -- Red vs Blue
  2016-01-05
*/


/*====================================
  class Matrix -- models a square matrix

  TASK: Implement methods below.
  Categorize runtime of each. 
  Test in your main method.
  ====================================*/ 

public class Matrix {

    //constant for default matrix size
    private final static int DEFAULT_SIZE = 2;

    private Object[][] matrix;


    //default constructor intializes a DEFAULT_SIZE*DEFAULT_SIZE matrix
    public Matrix( ) {matrix=new Object[DEFAULT_SIZE][DEFAULT_SIZE];}


    //constructor intializes an a*a matrix
    public Matrix( int a ) {matrix=new Object[a][a];}


    //return size of this matrix, where size is 1 dimension
    private int size() {return matrix.length;}


    //return the item at the specified row & column   
    private Object get( int r, int c ) {return (matrix[r])[c];}


    //return true if this matrix is empty, false otherwise
    private boolean isEmpty( int r, int c ) {
	if ((matrix[r])[c]==null){return true;}
	return false;
    }


    //overwrite item at specified row and column with newVal
    //return old value
    private Object set( int r, int c, Object newVal ) {
	Object oldVal=(matrix[r])[c];
	(matrix[r])[c]=newVal;
	return oldVal;
    }


    //return String representation of this matrix
    // (make it look like a matrix)
    public String toString() {
	String s="\t";
	for (Object[] row: matrix){
	    for (Object column: row){
		s+=column+"\t";
	    }
	    s+="\n\t";
	}
	return s;
    }


    //override inherited equals method
    //criteria for equality: matrices have identical dimensions,
    // and identical values in each slot
    public boolean equals( Object rightSide ) {
	if (rightSide instanceof Matrix){
	    if ( (((Matrix)rightSide).matrix).length==matrix.length ) {
		return true;}
	}
	return false;
    }


    //swap two columns of this matrix 
    //(1,1) is top left corner of matrix
    //row values increase going down
    //column value increase L-to-R
    public void swapColumns( int c1, int c2  ) {
	for (Object[] row:matrix){
	    Object Obj1=row[c1];
	    Object Obj2=row[c2];
	    row[c2]=Obj1;
	    row[c1]=Obj2;
	}
    }
    

    //swap two rows of this matrix 
    //(1,1) is top left corner of matrix
    //row values increase going down
    //column value increase L-to-R
    public void swapRows( int r1, int r2  ) {
	Object[] swap1=matrix[r1];
	Object[] swap2=matrix[r2];
	matrix[r1]=swap2;
	matrix[r2]=swap1;
    }


    //main method for testing
    public static void main( String[] args ) {
	//==========CONSTRUCTORS==========
	Matrix ron = new Matrix();
	Matrix fred = new Matrix(3);
	Matrix george = new Matrix(3);
	Matrix ginny = new Matrix();
	System.out.println("ron:\n" + ron.toString() + "\n" +
			   "fred:\n" + fred.toString() + "\n" +
			   "george:\n" + george.toString() + "\n" +
			   "ginny:\n" + ginny.toString());

	//==========GET()/SET()==========
	for (int i=0; i<2;i++) {
	    for (int j=0; j<2; j++) {
		ron.set(i,j,i+j+5);
		fred.set(i,j,i-j);
		george.set(i,j,i-j);
	    }
	}
	System.out.println("======AFTER FILLING======\n" +
			   "ron:\n" + ron.toString() + "\n" +
			   "fred:\n" + fred.toString() + "\n" +
			   "george:\n" + george.toString() + "\n" +
			   "ron.get(1,1):\t"+ ron.get(1,1));

	//==========isEmpty()/Size()==========
	System.out.println("\nfred.size():\t" + fred.size() + "\n" +
			   "ginny.isEmpty():\t" + ginny.isEmpty(0,1) + "\n" +
			   "george.isEmpty():\t" + george.isEmpty(0,0));

	//==========equals()==========
	System.out.println("\ngeorge.equals(fred):\t" + george.equals(fred) + "\n" + 
			   "ron.equals(ginny):\t" + ron.equals(ginny) + "\n" +
			   "ginny.equals(fred):\t" + ginny.equals(fred) + "\n");

	//==========swappers==========
	System.out.println("Fred Pre-swap:\n" + fred.toString());
	fred.swapRows(1,2);
	System.out.println("Fred Post-swap:\n" + fred.toString());
	
	System.out.println("Ron Pre-swap:\n" + ron.toString());
	ron.swapColumns(0,1);
	System.out.println("Ron Post-swap:\n" + ron.toString());
	
	System.out.println("George Pre-swap:\n" + george.toString());
	george.swapColumns(2,1);
	System.out.println("George Post-swap:\n" + george.toString());
	
    }

}//end class Matrix
