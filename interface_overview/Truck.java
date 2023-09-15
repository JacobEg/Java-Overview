//package interface_overview;

public class Truck implements Automobile {

    private String name;
    private String noise;
    private int velocity;
    private int gear;

    public Truck(String name){
        velocity = 0;
        this.name = name;
        noise = "honk";
        gear = PARK_GEAR;
    }

    public Truck(String name, String noise){ // overloading
        velocity = 0;
        this.name = name;
        this.noise = noise;
        gear = PARK_GEAR;
    }

    public void shiftGear(int gear) {
        if(gear < REVERSE_GEAR || gear > MAX_GEAR){
            throw new Error("Invalid gear!");
        }
        this.gear = gear;
    }

    public String honk() {
        return noise;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public boolean isSpeeding(int speedLimit){
        return velocity > speedLimit;
    }
    
    public String getName(){
        return name;
    }
}
