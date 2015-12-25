/*
Team Club Pengueen -- Janet Zhang, Kevin Hwang, Dorothy Ng
APCS1 pd5
HW30 -- Ye Olde Role Playing Game, Expanded
2015-11-15
*/

public class Warrior extends Character{
    
    public Warrior(String n) {
    super( 200 , 50 , 100 , .4 , "Warrior");
        name=n; }
        
    public String toString(){
        String ret="The Warrior is primarily a defender. His main job is the take the brunt of attacks for his teammates. ";
        ret+="Because of this, the Warrior has higher HP and defense than other classes do.";
        ret+="\nHP: "+hp;
        ret+="\nSTR: "+str;
        ret+="\nDEF: "+def;
        ret+="\nATK: "+(atk*str);
        return ret;
    }
    public static String descript() {
        String ret="The Warrior is primarily a defender. His main job is the take the brunt of attacks for his teammates. ";
        ret+="Because of this, the Warrior has higher HP and defense than other classes do.";
        return ret;
    }
}

