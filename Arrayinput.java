import java.util.Scanner;

public class Arrayinput {
    public static void main(String[]args)
    {
Scanner input=new Scanner(System.in);
int arr[]=new int[6];
for (int i = 0; i < arr.length; i++) {
    arr[i]=input.nextInt();
    
}
for (int ans : arr) {
    System.out.print(ans+" ");
}
    }
}
