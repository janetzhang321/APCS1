//Team Club Pengueen -- Janet Zhang, Kevin Hwang, Dorothy Ng
//APCS1 pd5
//HW29 -- Ye Olde Role Playing Game, Improved
//2015-11-12

public class Warrior extends Character{
    private String name;
    private int origStr;
    private int sStr;
    private int origDef;
    private int sDef;
    
    public Warrior(String n) {
    super( 125 , 100 , 40 , .4 );
        name=n;
        origStr=str;
        sStr=(int)(origStr*1.5);
        origDef=def;
        sDef=(int)(origDef*.5);
    }
    public String getName(){return name;}

    public void specialize() {
        def=sDef;
        str=sStr;
    }
    public void normalize() {
        def=origDef;
        str=origStr;
    }
}

