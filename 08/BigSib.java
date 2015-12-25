// Janet Zhang
// APCS1 pd5
// HW08 -- On BigSib Creation
// 2015-09-28

public class BigSib {
    //var
    String helloMsg;

    //methods
    
    //constructor
    public BigSib(String s) {
        helloMsg=s;
    }
    public BigSib() {
        helloMsg="Yoo-hoo";
    }
    /*  
	public void setHelloMsg(String newMsg){
	helloMsg=newMsg;
	}
    */
    public String greet(String name) {
	String retStr=helloMsg;
	retStr+= " " + name + ", what's good?";
	return retStr;
    }
}

/*
This site helped me: http://www.javaworld.com/article/2076204/core-java/understanding-constructors.html
*/
