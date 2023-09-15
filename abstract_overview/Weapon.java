//package abstract_overview;

public abstract class Weapon {
    int damage;
    String name;
    double attackRate;

    public Weapon(int damage, String name, double attackRate){
        this.damage = damage;
        this.name = name;
        this.attackRate = attackRate;
    }

    public abstract String attack(String target);
}
