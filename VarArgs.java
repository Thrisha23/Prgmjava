
public class VarArgs {

    static int minvalue(int... vals)
    {
        int min=Integer.MAX_VALUE;
        for(int k:vals)
        {
            if(k<min)
            {
            min=k;
        }
    }
    return min;
}
public static void main(String[]args)
{
   int a= minvalue(4,45,34,2,7,8,967,4,5,67,457,3,1,56,7856,45,6);
   System.out.println("The smallest value of a var:"+a);
   int y=minvalue(-2,-78,56,1,-889,0,567,-456567,79,11);
    System.out.print("The smallest value of y:"+y);
}
}
