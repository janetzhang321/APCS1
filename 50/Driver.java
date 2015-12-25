import java.util.*;
//public String toString(){return this.toString;}
public class Driver{
    public static void main(String[] args){

	ArrayList<Integer> a=new ArrayList<Integer>(10);
	int i=0;
	while (i<10){
	    a.add((int)(Math.random()*10));
	    i++;
	}
	System.out.println(a.size());
	System.out.println(a);
	StatPrinter b=new StatPrinter(a);
	System.out.println(b);
	System.out.println(b.getFrequency());
	System.out.println(b.getLocalModes());
	int longestBar=20;
	b.printHistogram(longestBar);
	
	
    }
    
}
