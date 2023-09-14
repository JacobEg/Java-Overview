package generics_overview;

public class TestMLL {
    public static void main(String[] args){
        MyLinkedList<Integer> l = new MyLinkedList<>();
        for(int i = 0; i < args.length; i++){
            l.add(Integer.parseInt(args[i]));
        }

        System.out.println(l.size() + " integers inputted");
    }
}
