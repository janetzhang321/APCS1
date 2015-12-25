public class Driver{
    public static void main(String[] arg){
	//sets a in class BankAccount
	BankAccount a = new BankAccount("Janet","Zhang",1234,123456789,100);
	System.out.println(a.ToString());
	System.out.println(a.deposit("Janet", "Zhang",1234,50));
	System.out.println(a.withdraw("Janet", "Zhang",1234,50));
    }
}
