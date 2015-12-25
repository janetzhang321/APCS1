/*
Team Club Pengueen -- Janet Zhang, Kevin Hwang, Dorothy Ng
APCS1 pd5
HW30 -- Ye Olde Role Playing Game, Expanded
2015-11-15
*/

public class Ducky extends Character {
    
    public Ducky(String n) {
        super( 1 , 1 , 1000000000 , .1337 , "Ducky");
        name=n;
    }
    
    
    public String toString(){
        String ret="The Ducky is the defender of the World and the only one who has a 99.7% chance of defeating the Boss.";
        ret+="While his strength and HP is abysmal, he has incredibly high defense, likened to a solid firewall.";
        ret+="\nHP: "+hp;
        ret+="\nSTR: "+str;
        ret+="\nDEF: "+def;
        ret+="\nATK: "+(atk*str);
        return ret;
    }
    
    public static String descript() {
        String ret="The Ducky is the defender of the World and the only one who has a 99.7% chance of defeating the Boss. ";
        ret+="While his strength and HP is abysmal, he has incredibly high defense, likened to a solid firewall.";
        return ret; }
}