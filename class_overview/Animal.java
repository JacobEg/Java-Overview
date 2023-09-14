package class_overview;

public class Animal {

    // best practice to keep instance variables private
    private String name;
    private String species;
    private int age;

    public Animal(String name, String species, int age){
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String getSpecies(){
        return species;
    }

    public int getAge(){
        return age;
    }

    public void birthday(){
        age++;
    }

    public String sound(){
        return "The animal makes a sound";
    }
}
