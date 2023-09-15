//package interface_overview;

public class InterfacesProgram {
    public static void main(String[] args){
        Truck truck1 = new Truck("F-150", "HONK");
        System.out.println(truck1.honk());
        Truck truck2 = new Truck("Silverado");
        System.out.println(truck2.honk());
        int speedLimit = 45;
        // use command-line args
        if(args.length >= 1){
            speedLimit = Integer.parseInt(args[0]);
        }
        truck1.setVelocity(43);
        truck2.setVelocity(70);
        System.out.println("1 is speeding: " + truck1.isSpeeding(speedLimit));
        System.out.println("2 is speeding: " + truck2.isSpeeding(speedLimit));
    }

    public int honkLength(Automobile a){ // "Automobile" type?
        return a.honk().length();
    }
}
