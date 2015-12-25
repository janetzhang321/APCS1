//Team Club Pengueen -- Janet Zhang, Kevin Hwang, Dorothy Ng
//APCS1 pd5
//HW28 -- Ye Olde Role Playing Game
//2015-11-10

public class Warrior {
    private String name;
    private int hp;
    private int str;
    private int origStr;
    private int sStr;
    private int def;
    private int origDef;
    private int sDef;
    private double atk;
    
    public Warrior(String n){
        name=n;
        hp=125;
        origStr=100;
        str=origStr;
        sStr=(int)(origStr*1.5);
        origDef=40;
        def=origDef;
        sDef=(int)(origDef*.5);
        atk=.4;
    }
    public boolean isAlive() {return hp>0;}
    public int getDefense(){return def;}
    public String getName(){return name;}
    public void lowerHP(int dmg){hp-=dmg;}
    
    public int attack(Monster mob) {
        int damage=(int)(str*atk-mob.getDefense());
        if(damage<0) damage=0;
        mob.lowerHP(damage);
        return damage;
    }
    
    public void specialize() {
        def=sDef;
        str=sStr;
    }
    public void normalize() {
        def=origDef;
        str=origStr;
    }
}

