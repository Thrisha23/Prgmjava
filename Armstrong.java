public class Armstrong {
     static int result;
    
    public static void main(String[]args)
    {
      //  Scanner in=new Scanner(System.in);
       // int n=in.nextInt();
        for(int i=0;i<=999;i++)
        {
           isArmstrong(i);
           if(result!=-1){
            System.out.println(result);
           }
            }


    }
static void isArmstrong( int n){
    int same=n;
    int sum=0;
    while(n>0)
    {
        int quoteint=n%10;
        n=n/10;
sum=sum+quoteint*quoteint*quoteint;
    }
    if(sum==same)
    {
         result = sum;
         
    }
    else{
        result=-1;
    }
}
}
