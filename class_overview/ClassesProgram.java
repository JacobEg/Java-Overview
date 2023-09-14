package class_overview;

public class ClassesProgram {
    public static void main(String[] args){
        Animal dog = new Animal("Fido",
        "Canis lupus familiaris", 1);
        dog.birthday();
        Person p = new Person("John", 20);
        p.addMoney(2300);
        p.spendMoney(300);
        System.out.println(p.introduce());

        // Polymorphism
        Animal animal1 = new Animal("Wilbur", "Pig", 3);
        Animal animal2 = new Person("Mary", 30);
        System.out.println(animal1.sound());
        System.out.println(animal2.sound());
    }
}
