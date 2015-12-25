/*
Team Club Pengueen -- Janet Zhang, Kevin Hwang, Dorothy Ng
APCS1 pd5
HW30 -- Ye Olde Role Playing Game, Expanded
2015-11-15
*/

public class Monster extends Character{
    
    public Monster(){ 
        //super (int hp,int str, int def, double atk, String t)
        super( 150 , 20+(int)(Math.random()*45) , 20 , 1.0 , "Monster" ); 
    }
    
    public String toString(){
        String ret="The Monster is not a mindless beast the hero must slay. He is but a creature trying to survive in this world just like the hero is. ";
        ret+="The Monster, however, is an obstacle that the hero must overcome in his journey. ";
        ret+="\nHP: "+hp;
        ret+="\nSTR: "+str;
        ret+="\nDEF: "+def;
        ret+="\nATK: "+(atk*str);
        return ret;
    }
    
    public static String descript() {
        String ret="The Monster is not a mindless beast the hero must slay. He is but a creature trying to survive in this world just like the hero is. ";
        ret+="The Monster, however, is an obstacle that the hero must overcome in his journey. ";
        return ret; }
}