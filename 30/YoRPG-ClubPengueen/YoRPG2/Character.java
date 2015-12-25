//Team Club Pengueen -- Janet Zhang, Kevin Hwang, Dorothy Ng
//APCS1 pd5
//HW29 -- Ye Olde Role Playing Game, Improved
//2015-11-12

public class Character{
    protected int hp;
    protected int str;
    protected int def;
    protected double atk;
    
    public Character(int h,int s, int d, double a){
        hp=h;
        str=s;
        def=d;
        atk=a;
    }
    
    public boolean isAlive() {return hp>0;}
    public int getDefense(){return def;}
    public void lowerHP(int dmg){hp-=dmg;}
    
    public int attack(Character other) {
        int damage=(int)(str*atk-other.getDefense());
        if (damage<0) {damage=0;}
        other.lowerHP(damage);
        return damage;
    }
}