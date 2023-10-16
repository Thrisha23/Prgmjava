import java.util.Arrays;

public class Overloadvargs {
    public static void main(String[]args)
    {
        demo(2,4,3,4,3,55);
        demo("Laptop Watch","neeyu","nanum","sen dhae","selum","neramae");
    }
    static void demo(int...v)
    {
        System.out.println(Arrays.toString(v));
    }
    static void demo(String...v)
    {
        System.out.println(Arrays.toString(v));
    }
}

