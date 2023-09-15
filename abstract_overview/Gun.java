// package abstract_overview;

public class Gun extends Weapon {

    int ammoInMag;

    public Gun(int damage, String name, double attackRate, int ammoInMag){
        super(damage, name, attackRate);
        this.ammoInMag = ammoInMag;
    }
    
    public String attack(String target) {
        return String.format(
            "%s attacked %s for %d damage",
            name, target, damage
        );
    }
    
}
