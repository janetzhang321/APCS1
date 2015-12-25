// Janet Zhang
// APCS1 pd5
// HW09 -- CMYM
// 2015-09-29

public class BankAccount{
    //Instance Vars
    private String name;
    private String pass;
    private int pin;
    private int acctNum;
    private int bal;
    
    //Constructors
    public BankAccount(){
	
	  name="Jane Doe";
	  pass="hi";
	  pin=1234;
	  acctNum=123456789;
	  bal=100;
    }

    //set AcctInfo
    public BankAccount(String newName, String newPass, int newPin, int newAcctNum, int newBal){
	name=newName;
	pass=newPass;
	pin=newPin;
	acctNum=newAcctNum;
	bal=newBal;
    }

    //Print AcctInfo
    public String PrintAcct(String oldName, String oldPass, int oldPin){
	String s;
	if(name==oldName) {
	    if(pass==oldPass) {
		if(pin==oldPin) {
		    s="Name:";
		    System.out.println(s);
		    s=oldName;
		    System.out.print(s);
		    /*
		    //"""Name:""" + oldName
		    //		   AcctNum:
		    //		   Balance:*/}
		else {
		    return "Error with pin";}}
	    else {
	        return "Error with password";}}
	else {
	    return "Error with name";}
    return name;
    }

    public String dpst(String oldName, String oldPass, int oldPin, int money){
	if(name==oldName) {
	    if(pass==oldPass) {
		if(pin==oldPin) {
		    bal=bal+money;
		    System.out.println("Your bal is now" + bal);}
		else{
		    return "wrong pin";}
	    }
	    else{
		return "wrong pass";}}
	else{
	    return "wrong name";}
	return "bal";
    }
	
        public String wdrw(String oldName, String oldPass, int oldPin, int money){
	if(name==oldName) {
	    if(pass==oldPass) {
		if(pin==oldPin) {
		    bal=bal-money;
		    System.out.println("Your bal is now" + bal);}
		else{
		    return "wrong pin";}
	    }
	    else{
		return "wrong pass";}}
	else{
	    return "wrong name";}
	return  "bal";
    }
	
    
    public String main(String[] args){
	return PrintAcct("Janet","Hi",1234);
    }

    //I know my code has a lot of errors rn, but I'll go to CS Dojo and fix it later, right now it compiles.

    
    //Methods

    //Set Attributes
    //	public void SetName(String newName){
    //    newName=name;
    //	}
    /*
      public static void SetPass(String newPass){
      newPass=pass;
      }
      public static void SetPin(int newPin){
      newPin=pin;
      }
      public static void SetAcctNum(int newAcctNum){
      newAcctNum=acctNum;
      }
      public static void SetBal(int newBal){
      newBal=Bal;
      }
    */
    //print acct info
    /*
      public static String PrntAcct(String name){
      if (name==name.BankAccount){
      System.out.print("Hi");
      }
      }*/
	
}
