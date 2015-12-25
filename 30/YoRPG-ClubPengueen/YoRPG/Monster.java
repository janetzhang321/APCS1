//Team Club Pengueen -- Janet Zhang, Kevin Hwang, Dorothy Ng
//APCS1 pd5
//HW28 -- Ye Olde Role Playing Game
//2015-11-10

public class Monster {
    private String name;
    private int hp;
    private int str;
    private int def;
    private double atk;
    
    public Monster(){
        hp=150;
        str=20+(int)(Math.random()*45);//[20-65)
        def=20;
        atk=1;
    }
    public boolean isAlive() {return hp>0;}
    public int getDefense() {return def;}
    public String getName() {return name;}
    public void lowerHP(int dmg){hp-=dmg;}
    public int attack(Warrior hero) {
        int damage=(int)(str*atk-hero.getDefense());
        if (damage<0) {damage=0;}
        hero.lowerHP(damage);
        return damage;
    }
}