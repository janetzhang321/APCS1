/*
  Advay Sriram: Janet Zhang, Advay Sriram
  APCS1 pd5
  HW55 -- Don’t Think You Are. Know You Are.
  2016-01-06
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
		return (matrix[r])[c]==null;
    }//O(1)


    //overwrite item at specified row and column with newVal
    //return old value
    private Object set( int r, int c, Object newVal ) {
	Object oldVal=(matrix[r])[c];
	(matrix[r])[c]=newVal;
	return oldVal;
    }//O(1)


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
    }//O(x^2)


    //override inherited equals method
    //criteria for equality: matrices have identical dimensions,
    // and identical values in each slot
    public boolean equals( Object rightSide ) {
	if (rightSide instanceof Matrix){
	    if ( (((Matrix)rightSide).matrix).length==matrix.length ) {
		return true;}
	}
	return false;
    }//O(1)


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
    }//O(x)
    

    //swap two rows of this matrix 
    //(1,1) is top left corner of matrix
    //row values increase going down
    //column value increase L-to-R
    public void swapRows( int r1, int r2  ) {
		Object[] swap1=matrix[r1];
		Object[] swap2=matrix[r2];
		matrix[r1]=swap2;
		matrix[r2]=swap1;
    }//O(1)

    //Hw55 methods
	// returns false if there are any non-significant slots in the function, else true
    public boolean isFull(){
    		for(int r=0;r<matrix.length;r++){
    			for(int e=0;e<r;e++){
    				if(isEmpty(r,e)){return false;}
    			}
    		}
    	return true;
    }//O(n^2)
    
    // returns the specified row of the matrix	
    public Object[] getRow( int r ){
    	Object ans []= new Object [size()];
	  	for (int a = 0; a < size(); a ++){
			  ans [a] = get(r,a);
  		}
	  	return ans;
    }//O(n)
    
    	
    //sets the row r to newRow and returns the old row
    public Object[] setRow( int r, Object[] newRow ){
   		Object[] oldRow=getRow(r);
    	matrix[r]=newRow;
    	return oldRow;
    }//O(n)
    
    // sets the column c to newCol and returns the old column
    public Object[] setCol( int c, Object[] newCol )
    {
    	Object ans [] = new Object [size()];
    	for (int i = 0; i < newCol.length; i ++){
    		ans [i] = matrix [i][c];
    		matrix [i][c] = newCol [i];
   	  }
    	return ans;
    	
    }//O(n)
    
    //makes all the rows, columns and all the columns rows
    public void transpose(){
    	Matrix newMatrix = new Matrix(size());//create a copy
		//get the rows
		for(int i=0;i<size();i++){//does the transposing
		    newMatrix.setCol(i,getRow(i));
		    System.out.println("newMatrix:\n"+newMatrix);
		    System.out.println("oldMatrix:\n"+this);
		}
		//replaces the matrices
		for(int r=0;r<size();r++){
		    for(int j=0;j<size();j++){
			set(r,j,newMatrix.get(r,j));
		    }
		}
    }//O(n^2)


    //main method for testing
    public static void main( String[] args ) {
	//==========CONSTRUCTORS==========
	//Matrix ron = new Matrix();
	Matrix ron = new Matrix(3);
	Matrix fred = new Matrix(3);
	Matrix george = new Matrix(3);
	Matrix ginny = new Matrix();
	/*
	System.out.println("ron:\n" + ron + "\n" +
			   "fred:\n" + fred + "\n" +
			   "george:\n" + george + "\n" +
			   "ginny:\n" + ginny);
	*/
	
	//==========GET()/SET()==========
	for (int i=0; i<2;i++) {
	    for (int j=0; j<2; j++) {
			ron.set(i,j,5+i+j);
			fred.set(i,j,i-j);
			george.set(i,j,i-j);
	    }
	}
	
	ron.set(0,0,1);
	ron.set(0,1,2);
	ron.set(0,2,3);
	ron.set(1,0,4);
	ron.set(1,1,5);
	ron.set(1,2,6);
	ron.set(2,0,7);
	ron.set(2,1,8);
	ron.set(2,2,9);
	
	/*System.out.println("ron.get(1,1):\t"+ ron.get(1,1));
	System.out.println("======AFTER FILLING======\n" +
			   "ron:\n" + ron + "\n" +
			   "fred:\n" + fred + "\n" +
			   "george:\n" + george + "\n");
	
	//==========isEmpty()/Size()==========
	System.out.println("\nfred.size():\t" + fred.size() + "\n" +
			   "ginny.isEmpty():\t" + ginny.isEmpty(0,1) + "\n" +
			   "george.isEmpty():\t" + george.isEmpty(0,0));

	//==========equals()==========
	System.out.println("\ngeorge.equals(fred):\t" + george.equals(fred) + "\n" + 
			   "ron.equals(ginny):\t" + ron.equals(ginny) + "\n" +
			   "ginny.equals(fred):\t" + ginny.equals(fred) + "\n");

	//==========swappers==========
	System.out.println("Fred Pre-swap:\n" + fred);
	fred.swapRows(1,2);
	System.out.println("Fred Post-swap:\n" + fred);
	
	System.out.println("Ron Pre-swap:\n" + ron);
	ron.swapColumns(0,1);
	System.out.println("Ron Post-swap:\n" + ron);
	
	System.out.println("George Pre-swap:\n" + george);
	george.swapColumns(2,1);
	System.out.println("George Post-swap:\n" + george);
	*/
    
    
    /*=================hw55====================
    //==========isFull===========
	System.out.println("\nginny.isFull():\t" + ginny.isFull() + "\n" +
					   "\ngeorge.isFull():" + george.isFull() + "\n" +
					   "\nfred.isFull():\t" + fred.isFull() + "\n" +
					   "\nron.isFull():\t" + ron.isFull() + "\n"
					   );
					   
    //==========Rows===========
    System.out.println("\nron:"+ron);
    george.setRow(1,ron.getRow(1));
    System.out.println("\ngeorge now:\n" + george.toString());
    
    //==========Col============
    System.out.println("\nron:"+ron);
    george.setCol(0,(ron.matrix)[1]);
    System.out.println("\ngeorge now:\n" + george.toString());
    */
    
    //=========transpose=======
    System.out.println("ron Pre-Transpose:\n"+ron);
    ron.transpose();
    System.out.println("\nron Post-Transpose:\n"+ron);
    }
}//end class Matrix
