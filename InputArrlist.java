import java.util.Scanner;
import java.util.ArrayList;

public class InputArrlist {
    
    public static void main(String[]args)
    {
        ArrayList<Integer> list=new ArrayList();
Scanner in=new Scanner(System.in);
for (int i = 0; i < 6; i++) {
    list.add(in.nextInt());
}
for (int i = 0; i <6; i++) {
   list.get(i);
}
System.out.print(list);
    }
}
