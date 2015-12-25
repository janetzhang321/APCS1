// Underwater Squad
//Janet Zhang
//Roster: Henry Zhang, Janet Zhang, Stanley Zeng
// APCS1 pd5
// HW10 -- Mo Money Mo Problems
// 2015-10-01

public class BankAccount{
    //Instance Variables
    private String name,pass;
    private int pin;
    private int acctNum;
    private double bal;

    //constructor
    public BankAccount(){
    }

    public BankAccount(String newName, String newPass, int newPin, int newAcctNum, double newBal){
	name=newName;
	pass=newPass;
	if (newPin < 1000 || newPin > 9998){
	    //conditional to limit range of pin 
	    pin = 9999;
	    //becomes 9999 if outside range
	    System.out.println("Pin Number out of range. Automatically has been set to 9999");
	    //notifying user about the error
	}   else{
	    pin=newPin;}
	//otherwise everything works like a standard constructor line
	if (newAcctNum < 100000000 || newAcctNum > 999999998){
		acctNum = 999999999;
	        System.out.println( " Account Number out of range. Automatically has been set to 999999999");
	 } else {
	    acctNum=newAcctNum;
	};
	bal=newBal;
    }

    //Accessor methods
    public String getName(){
	return name;
    }
    
    public String getPass(){
	return pass;
    }    
    public int getPin(){
	return pin;
    }    
    public int getAcctNum(){
	return acctNum;
    }    
    public double getBal(){
	return bal;
    }
    
    //mutator methods
    public void setName(String newName){
	//return "Old Name:"+name;
	name=newName;
    }
    
    public void setPass(String newPass){
	//return "Old Pass:"+pass;
	pass=newPass;
    }    
    public void setPin(int newPin){
	//return "Old Pin:"+pin;
	pin=newPin;
    }    
    public void setAcctNum(int newAcctNum){
	acctNum=newAcctNum;
    }    
    public void setBal(double newBal){
	//return "Old Bal:"+bal;
	bal=newBal;
    }
    
    //Return the Bank Account info
    public String accInfo(){
	return "Name: "+name+"\n"+"Pass: "+pass+"\n"+"Pin: "+pin+"\n"+"Acctnum: "+acctNum+"\n"+"Bal: "+bal;
    }

    //withdraw money
    public String withdraw(String name, String pass, int pin, double amt){
	if (getName()==name){//check name
	    if (getPass()==pass){//check pass
		if (getPin()==pin){//check pin
		    if (getBal()>amt){
			//Action
			setBal(bal-=amt); //bal=bal-amt
			return "Action: Withdrawal" + "\n" + "New Bal: "+getBal();}
		    else{
			return "You don't have enough money! Deposit more!"+"\n"+getBal();}}
		else{//if wrong pin
		    return "Error Pin"+"\n"+"Bal: "+getBal();}}
	    else{//if wrong pass
		return "Error Pass"+"\n"+"Bal: "+getBal();}}
	else{//if wrong name
	    return "Error Usr"+"\n"+"Bal: "+getBal();}
    }
    //deposit money
    public String deposit(String name, String pass, int pin, double amt){
	if (getName()==name){//check name
	    if (getPass()==pass){//check pass
		if (getPin()==pin){//check pin
		    //Action
		    setBal(bal+=amt); //bal=bal+amt
		    return "Action: Deposit" + "\n" + "New Bal: "+getBal();}
		else{//if wrong pin
		    return "Error Pin"+"\n"+"Bal: "+getBal();}}
	    else{//if wrong pass
		return "Error Pass"+"\n"+"Bal: "+getBal();}}
	else{//if wrong name
	    return "Error Usr"+"\n"+"Bal: "+getBal();}
    }
     public static void main(String [ ] args){
    BankAccount yeezy = new BankAccount("Kanye Omari West", "iamagod", 1977, 140922, 130000000);
    //creating test object "yeezy"
    BankAccount henry = new BankAccount("Henry 'Brokeboii' Zhang", "yungherb",0 , 0, 0);
    //second test object "henry"
    System.out.println(yeezy.accInfo());
    System.out.println(henry.accInfo());
    System.out.println(yeezy.withdraw("Kanye Omari West", "iamagod",1977, 923092390));
    //testing withdrawal
    System.out.println(yeezy.withdraw("Kanye Omari West", "iamagod",1977, 39));
    //testing withdrawal more than balance 
    System.out.println(henry.deposit("Henry 'Brokeboii' Zhang", "yungherb", 9999, 9001));
    //testing deposit
    System.out.println(henry.deposit("Henry 'Brokeboii' Zhang", "csgod",1991, 90));
    //testing authentication
     }
}

