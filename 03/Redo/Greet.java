public class Greet{
    public static void main (String[] args) {
	String G1 = "Donald Trump!";
	String G2 = "Mr. Brown!";
	String G3 = "Kanye West!";
        greet(G1);
	greet(G2);
	greet(G3);
    }
    public static void greet(String name) {
	System.out.println("Hello " + name);
    }
}
