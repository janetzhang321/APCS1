// class Coin
/*
  Janet Zhang
  APCS1 pd5
  HW14 -- Wayne’s World
  2015-10-07
*/


public class Coin {

    //attributes aka instance vars
    private double value;
    private String upFace, name;
    private int flipCtr, headsCtr, tailsCtr;
    private double bias = .5;

    /*=============================
      Coin() -- default constuctor
      precond: 
      postcond: 
      =============================*/
    public Coin() { 
	value=.01;
	upFace="heads";
	name="penny";
	flipCtr=0;
	headsCtr=0;
	tailsCtr=0;
	bias=Math.random();
    }

    /*=============================
      Coin(String) -- overloaded constructor
      precond: input is one of: "penny","nickel","dime","quarter",
      "half dollar","dollar"
      postcond: 
      =============================*/
    public Coin( String s ) {
        if (s=="penny"||s=="nickel"||s=="dime"||s=="quarter"||s=="half dollar"||s=="dollar"){
	    this.name=s;
	    this.upFace="heads";
	    this.bias=Math.random();}
    }

    /*=============================
      Coin(String,String) -- overloaded constructor
      precond: input is one of: "penny","nickel","dime","quarter",
      "half dollar","dollar"
      postcond: 
      =============================*/
    public Coin( String s, String nowFace ) { 
	if (s=="penny"||s=="nickel"||s=="dime"||s=="quarter"||s=="half dollar"||s=="dollar"){
	    this.name=s;
	    this.upFace=nowFace;
	    this.bias=Math.random();}
    }

    // Accessors...
    // ----------------------------
    public String getUpFace() { 
	return this.upFace;
    }

    public int getFlipCtr() { 
	return this.flipCtr;
    }

    public double getValue() { 
	return this.value;
    }

    public int getHeadsCtr() { 
	return this.headsCtr;
    }

    public int getTailsCtr() { 
	return this.tailsCtr;
    }
    // ----------------------------


    /*=============================
      assignValue() -- set a Coin's monetary value based on its name
      precond:  input String is a valid coin name ("penny", "nickel", etc.)
      postcond: instvar value gets appropriate value
      Returns value assigned.
      =============================*/
    private double assignValue( String s ) { 
	if (s=="penny"){
	    this.name=s;
	    this.value=.01;}
	if (s=="nickel"){
	    this.name=s;
	    this.value=.05;}
	if (s=="dime"){
	    this.name=s;
	    this.value=.1;}
	if (s=="quarter"){
	    this.name=s;
	    this.value=.25;}
	return value;
    }


    /*=============================
      reset() -- initialize a Coin
      precond:  s is "heads" or "tails", 0.0 <= d <= 1.0
      postcond: Coin's attribs reset to starting vals
      =============================*/
    public void reset( String s, double d ) { 
	if (0.0 <= d&&d <= 1.0 && s=="heads"||s=="tails"){
	    value=.01;
	    upFace=s;
	    name="penny";
	    flipCtr=0;
	    headsCtr=0;
	    tailsCtr=0;
	    bias=d;
	}
    }

    /*=============================
      String flip() -- simulates a Coin flip
      precond:  bias is a double on interval [0.0,1.0]
      (1.0 indicates always heads, 0.0 always tails)
      postcond: upFace updated to reflect result of flip.
      flipCtr incremented by 1.
      Either headsCtr or tailsCtr incremented by 1, as approp.
      Returns "heads" or "tails"
      =============================*/
    public String flip() {
	this.flipCtr+=1;
	if (Math.random() < this.bias){
	    this.upFace="heads";
	    this.headsCtr+=1;
	    return this.upFace;}
	else{
	    this.upFace="tails";
	    this.tailsCtr+=1;
	    return this.upFace;}
    }


    /*=============================
      boolean equals(Coin) -- checks to see if 2 coins have same face up
      precond: other is not null
      postcond: Returns true if both coins showing heads
      or both showing tails. False otherwise.
      =============================*/
    public boolean equals( Coin other ) { 
	if (this.upFace==other.upFace){
	    return true;}
	else{
	    return false;}
    }


    /*=============================
      String toString() -- overrides toString() provided by Java
      precond: n/a
      postcond: Return String comprised of name and current face
      =============================*/
    public String toString() {
	return this.name+"--"+this.upFace;
    }

}//end Coin class
