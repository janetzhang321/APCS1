// Janet Zhang
// APCS1 pd5
// HW07 -- On BigSib Individuality and the Elimination of Radio Fuzz
// 2015-09-22

public class Greet { 

    public static void main( String[] args ) { 

	String greeting;

	BigSib richard = new BigSib();    
	BigSib grizz = new BigSib();    
	BigSib dotCom = new BigSib();    
	BigSib tracy = new BigSib();    

	richard.setHelloMsg("Word up"); 
	grizz.setHelloMsg("Hey ya");
	tracy.setHelloMsg("Salutations"); 
	dotCom.setHelloMsg("Sup"); 

	greeting = richard.greet("freshman"); 
	System.out.println(greeting); //Word up freshman, what's good?
	greeting = tracy.greet("Dr. Spaceman"); 
	System.out.println(greeting); //Salutations Dr. Spaceman, what's good?
	greeting = grizz.greet("Kong Fooey"); 
	System.out.println(greeting); //Hey ya Kong Fooey, what's good?
	greeting = dotCom.greet("mom"); 
	System.out.println(greeting); //Sup mom, what's good?

	/* Q: The statement below does not work. What single, simple, 
	   small modification in BigSib.java will enable it to work? */ 
	System.out.println(richard.helloMsg); //Word up

    } //end main() 

} //end Greet
