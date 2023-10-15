public class LoopScope {
    public static void main(String[]args)
    {

        int a=78;
        for(int i=0;i<3;i++)
        {
            System.out.print(i);
            a=34;
              System.out.println(a);
        }

        System.out.println(a);

    }

}
