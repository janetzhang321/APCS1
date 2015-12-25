/*
Team Club Pengueen -- Janet Zhang, Kevin Hwang, Dorothy Ng
APCS1 pd5
HW30 -- Ye Olde Role Playing Game, Expanded
2015-11-15
*/

public class Rogue extends Character{
    
    public Rogue(String n) {
        super( 50 , 150 , 31 , .75 , "Rogue");
        name=n;
    }
    
    public String toString(){
        String ret="The Rogue is a nimble attacker. His attacks are on point, just like his choice of weapon, daggers. ";
        ret+="However, while he has high strength, he also has low HP and low defense. Getting hit will definitely hurt a lot. ";
        ret+="\nHP: "+hp;
        ret+="\nSTR: "+str;
        ret+="\nDEF: "+def;
        ret+="\nATK: "+(atk*str);
        return ret;
    }
    
    public static String descript() {
        String ret="The Rogue is a nimble attacker. His attacks are on point, just like his choice of weapon, daggers. ";
        ret+="However, while he has high strength, he also has low HP and low defense. Getting hit will definitely hurt a lot. ";
        return ret; }
    
}