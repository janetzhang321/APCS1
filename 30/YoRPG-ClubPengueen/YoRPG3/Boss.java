/*
Team Club Pengueen -- Janet Zhang, Kevin Hwang, Dorothy Ng
APCS1 pd5
HW30 -- Ye Olde Role Playing Game, Expanded
2015-11-15
*/

public class Boss extends Character{
    
    public Boss(String n) {
        super( 1000000 , 1000000 , 1000000 , 1.0 , "Boss" );
        name=n;
    }
    
    public String toString(){
        String ret="The Boss is the master of all trades. ";
        ret+="His stats are all ridiculously high. Some say he's invincible. ";
        ret+="Recently, there has been a rumor that a single hero might have a chance at defeating him...";
        ret+="\nHP: "+hp;
        ret+="\nSTR: "+str;
        ret+="\nDEF: "+def;
        ret+="\nATK: "+(atk*str);
        return ret;
    }   
    
    public static String descript() {
        String ret="The Boss is the master of all trades. ";
        ret+=" His stats are all ridiculously high. Some say he's invincible. ";
        ret+=" Recently, there has been a rumor that a single hero might have a chance at defeating him...";
        return ret; }
}