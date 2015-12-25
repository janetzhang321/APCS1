// Janet Zhang
// APCS1 pd5
// HW07 -- On BigSib Individuality and the Elimination of Radio Fuzz
// 2015-09-22

public class BigSib {
    //instance var
    public  String helloMsg;
    //methods
    public  void setHelloMsg(String newMsg){
	helloMsg=newMsg;
    }
    public  String greet(String name) {
	String retStr=helloMsg;
	retStr+= " " + name + ", what's good?";
	return retStr;
    }
}
