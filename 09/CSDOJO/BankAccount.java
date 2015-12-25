// Janet Zhang
// APCS1 pd5
// HW09 -- CMYM
// 2015-09-30

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
	pin=newPin;
	acctNum=newAcctNum;
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
    public String setName(String newName){
	//return "Old Name:"+name;
	name=newName;
	return "New Name: "+name;
    }
    
    public String setPass(String newPass){
	//return "Old Pass:"+pass;
	pass=newPass;
	return "New Pass: "+pass;
    }    
    public String setPin(int newPin){
	//return "Old Pin:"+pin;
	pin=newPin;
	return "New Pin: "+pin;
    }    
    public String setAcctNum(int newAcctNum){
	//return "Old AcctNum: "+acctNum;
	acctNum=newAcctNum;
	return "New AcctNum: "+acctNum;
    }    
    public String setBal(double newBal){
	//return "Old Bal:"+bal;
	bal=newBal;
	return "New Bal: "+bal;
    }
    
    //Return the Bank Account info
    public String ToString(){
	return "Name: "+name+"\n"+"Pass: "+pass+"\n"+"Pin: "+pin+"\n"+"Acctnum: "+acctNum+"\n"+"Bal: "+bal;
    }

    //withdraw money
    public String withdraw(String name, String pass, int pin, double amt){
	if (getName()==name){//check name
	    if (getPass()==pass){//check pass
		if (getPin()==pin){//check pin
		    //Action
		    setBal(bal-=amt); //bal=bal-amt
		    return "Action: Withdrawal" + "\n" + "New Bal: "+getBal();}
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
}


