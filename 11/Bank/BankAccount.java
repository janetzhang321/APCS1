/*
KaKeS
Kathy Lau, Shantanu Jha, Kevin Hwang
APCS pd5
HW10 -- Mo Money Mo Problems
2015-10-01
*/

public class BankAccount{
    private double balance;
  private long account;
  private String uname;
  private String pass;
  private int pin;

	//default constructor
	public BankAccount(){
		uname="User";
		pass="123456";
		pin=9999;
		account=999999999;
		balance= 0;
        help();
	}

	//Constructs bank account with specified info
	public BankAccount(double balance, long account, int pin, String uname, String pass)
	{
	setBalance(balance);
	setAccount(account);
	setPin(pin);
	setUsername(uname);
	setPassword(pass);
        help();
    }

    // set methods
  public void setBalance(double x)
	{
    if(x >= 0)
	{
        balance = x;
	}
	else{
	    System.out.println("Enter a non-negative balance!");
    }
  }

  public void setAccount(long x)
	{
	if(x >= 100000000 && x <= 999999998)
	{
	    account = x;
	}
	else{
	    account = 999999999;
	    System.out.println("You have entered an invalid account number. Your account number will be set to 999999998.");
    }
	}

    public void setPin(int x){
			if(x<= 9998 && x>=1000){
				pin = x;
			}
			else{
				pin=9999;
				System.out.println("You have entered an invalid pin number. Your pin number will be set to 9998");
			}
    }

    public void setUsername(String s){
	uname = s;
    System.out.println("New username: " + uname);
    }

    public void setPassword(String s){
	pass = s;
    System.out.println("New password: " + pass);
    }




    public boolean auth(long accountNum, String pazz){

			return account==accountNum && pazz==pass;
		    }

	//Deposits money with given password
	public boolean deposit(double amount)
	{
		if (amount > 0){
			balance+=amount;
			System.out.println("Deposited: $" + amount);
			System.out.println("Balance: $" + balance);
			return true;
		}
		else {
			System.out.println("No deposit was made. Please insert a positive value.");
			return false;
		}
	}
	//Withdraws money if amount is not greater than balance.
	public boolean withdraw(double amount)
	{
		if (amount <= balance && amount > 0) {
			balance-=amount;
			System.out.println("Withdrew: $" + amount);
			System.out.println("Balance: $" + balance);
			return true;
		}
		else {
			System.out.println("$"+amount+ " cannot be withdrawn.");
			return false;
		}
	}



	//toString method
	public String toString()
	{
		return "Username: " + uname + "\nPassword: " + pass + "\nBalance: " + balance + "\nAccount Number: " + account + "\nPin Number: " + pin;
    }

    //help function
    public void help()
    {
        String a;
        a = "\n\nConstructor Methods:\npublic BankAccount(double <balance>, long <account number>, int <pin number>, String <Name>, String <password>)\n\n\nSetter Methods:\npublic void setBalance(double <balance>)\t\t\tEnter non-negative inputs\npublic void setAccount(long <Account number>)\t\t\tEnter integers between 100000000 and 999999998 inclusive\npublic void setPin(int <PIN number>)\t\t\t\tEnter integers between 1000 9998 inclusive\npublic void setUsername(String <Username>)\t\t\tEnter the bank account holder's user name\npublic void setPassword(String <Password>)\t\t\tEnter the bank account password!\n\n\npublic boolean withdraw(double <amount>)\t\t\tWithdraws only if there is enough money in the account\npublic boolean deposit(double <amount>)\t\t\t\tDeposits only posotive numbers\npublic boolean auth(long <Account_number>, String <password>)\tEnter Account Number and Password and returns boolean true if they are correct and false if not\n\npublic void help()\t\t\t\t\t\tHelp Method!";
        System.out.println(a);

    }
}
