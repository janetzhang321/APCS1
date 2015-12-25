public class Greet {
    public static void main(String[] args){
	if (Math.random() <= 0.33){
	    greet("Donald Trump");}
	else if (Math.random() <= 0.66){
	    greet("Mr. Brown");}
	else {
	    greet("Kanye");}
    }
    static void greet(String name) {
	System.out.println("Hello,"+name);
    }
}
