import java.util.ArrayList;

public class Arraylist {
    public static void main(String[]args)
    {
    ArrayList <Integer> list=new ArrayList(3);
        list.add(34);
        list.add(44);
        list.add(22);
        list.add(56);
        list.add(67);
        list.add(89);
        System.out.println(list);
        System.out.println(list.contains(456));
        list.set(4,900);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}
