import java.util.Arrays;
public class Passingarrfunt{
    public static void main(String[]args)
    {
        int input[]={5,656,6787,678,464,90};
        System.out.println(Arrays.toString(input));
        change(input);
        System.out.println(Arrays.toString(input));
    }
static void change(int[] num)
{
    num[3]=0;
}
}