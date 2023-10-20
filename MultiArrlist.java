import java.util.ArrayList;
import java.util.Scanner;
public class MultiArrlist {
    public static void main(String[]args)
    {
        ArrayList<ArrayList<Integer>>list=new ArrayList();
        Scanner in=new Scanner(System.in);
        for (int index = 0; index < 3; index++) {
            list.add(new ArrayList<>());
            
        }
        for (int index = 0; index < 3; index++) {
            for (int i = 0; i < 3; i++) {
                list.get(index).add(in.nextInt());
            }
            
        }
        System.out.println(list);
    }
}
