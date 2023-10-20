import java.util.Scanner;

public class isPrime {
    public static void main(String[]args)
    {
        try (Scanner scanner = new Scanner(System.in)) {
            int n=scanner.nextInt();
            boolean ans =isprime(n);
            System.out.println(ans);
        }
        
    }
    static boolean isprime(int n)
    {
if(n<=1)
{
    return false;
}
int c=2;
while(c*c<=n)
{
    if(n%c==0)
{
    return false;
}
c++;
}
return c*c>n;
}
}