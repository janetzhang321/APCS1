/*
Team Club Pengueen -- Janet Zhang, Kevin Hwang, Dorothy Ng
APCS1 pd5
HW30 -- Ye Olde Role Playing Game, Expanded
2015-11-15
*/

public class Mage extends Character{ 
    
    public Mage(String n) {
        super( 100 , 23 , 20 , .5 , "Mage" );
        name=n;
    }

    public String toString(){
        String ret="The Mage specializes in the magic granted by mysterious spirits. ";
        ret+="Despite having low strength and defense, with help from the mysterious spirits, he is a force to be reckoned with. ";
        ret+="\nHP: "+hp;
        ret+="\nSTR: "+str;
        ret+="\nDEF: "+def;
        ret+="\nATK: "+(atk*str);
        return ret;
    }
    
    public static String descript() {
        String ret="The Mage specializes in the magic granted by mysterious spirits. ";
        ret+="Despite having low strength and defense, with help from the mysterious spirits, he is a force to be reckoned with. ";
        return ret; }
}