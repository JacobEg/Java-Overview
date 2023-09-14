package class_overview;

public class Person extends Animal {

    private int money;

    public Person(String name, int age){
        super(name, "Homo sapiens", age);
        money = 0;
    }

    public void addMoney(int money){
        this.money += money;
    }

    public boolean spendMoney(int cost){
        if(cost > money){
            return false;
        }
        money -= cost;
        return true;
    }

    public String introduce(){
        return "Hello! My name is " + getName() + "! I have $" + money + ".";
    }

    public void birthday(){ // overriding
        super.birthday();
        addMoney(50);
    }

    public String sound(){ //overriding
        return "The person speaks";
    }
}
