import cs1.Keyboard;  //if comfortable with Scanner, you may comment this out
/*
  Team Real Pengueen - Janet Zhang, Dorothy Ng
  APCS1 pd5
  HW36 -- Some Folks Call It a Memory
  2015-11-23
*/
		
public class Concentration {

    //instance variables
    private Tile[][] _board;     //storage for 4x4 grid of Tiles.
    private int _numberFaceUp;   //count of Tiles with faces visible
    private String[] _words;     //list of unique Strings used for Tile vals
    private static int _numRows = 4;
    
    //insert constructor and methods here
    public Concentration(){
	    _numberFaceUp=0;
	    _board=new Tile[4][4];
	    _words=new String[8];
	    _words[0]="owl";
	    _words[1]="bat";
	    _words[2]="dolphin";
	    _words[3]="cat";
	    _words[4]="star";
	    _words[5]="moon";
	    _words[6]="sun";
	    _words[7]="comet";
    }
    public void setTiles(){
    	double iT=0;
    	for (int iBR=0;iBR<_board.length;iBR++){
    	    for (int iBC=0;iBC<_board[iBR].length;iBC++){
    	        _board[iBR][iBC]= new Tile (_words[(int)iT]);
    	        iT+=0.5;
    	    }
    	}
    }
    public static void swapp(Tile[][]a,int r1,int c1, int r2, int c2){
        Tile s1=a[r1][c1]; //save string val in first pos
        Tile s2=a[r2][c2]; //save string val in second pos
        a[r1][c1]=s2; //assign the first pos the second string val
        a[r2][c2]=s1; //assign the second pos the first string val
   }
    public void shuffleBoard(Tile[][]a){
        for (int i=0;i<a.length;i++){
            for (int p=0;p<a[i].length;p++){
                int r2=(int)(Math.random()*a.length);
                int c2=(int)(Math.random()*a[i].length);
                swapp(a,i,p,r2,c2);
            }
        }
    }
   public static void printArray(Tile[][]a){
      for (int i=0;i<a.length;i++){
             System.out.println();   //print new line for every new row
             for (int p=0;p<a[i].length;p++){
                System.out.print(a[i][p]+"\t");  //print each item in column
            }
        }
      System.out.println(); //for aesthetics on the cli
    }
    public void play(){
        setTiles();
        shuffleBoard(_board);
        int moves=0;
        while (_numberFaceUp<16){
            printArray(_board);
            //data for first tile
            System.out.println("~~~Tile 1~~~");
            System.out.print("Row:\t");
            int r1=Integer.parseInt(Keyboard.readString()); //print row of second string
            System.out.print("Column:\t");
            int c1=Integer.parseInt(Keyboard.readString()); //print col of second string
            //data for second tile
            System.out.println("~~~Tile 2~~~");
            System.out.print("Row:\t");
            int r2=Integer.parseInt(Keyboard.readString()); //print row of second string
            System.out.print("Column:\t");
            int c2=Integer.parseInt(Keyboard.readString()); //print col of second string
            //flip le cards and show the results
            if (r1>3||c1>3||r2>3||c2>3){
                System.out.println("Error: choose a number between 0 and 3");
                //needs more, need to catch or something...idk the syntax tho
                //catch();
                //solution: changed the syntax, moved game play and flip to the end, after all the exceptions are made
            }
            else if (r1==r2 && c1==c2){
                System.out.println("Error: Can't flip same card.");
            }
            else if (_board[r1][c1].isFaceUp() || _board[r1][c1].isFaceUp()){
                System.out.println("Error: At least one of the tiles chosen is already face up.");
            }
            else {
                _board[r1][c1].flip();
                _board[r2][c2].flip();
                moves++;
                printArray(_board);
                System.out.println("~~~~~~~~~~~~~~~");
                //are they the same card or nah
                if (_board[r1][c1].equals(_board[r2][c2])){
                    _numberFaceUp+=2;
                }
                else{ //if nah then just flip em back down
                    _board[r1][c1].flip();
                    _board[r2][c2].flip();
                }
            }
            System.out.println("Moves: "+moves);
        }
    }
		
    //DO NOT MODIFY main()
    public static void main(String[] args){
	Concentration game = new Concentration();
	game.play();
    }

}//end class Concentration
