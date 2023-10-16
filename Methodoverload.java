public class Methodoverload {
    public static void main(String[]args)
    {
       int ice= fun(34,5,23,45);
       System.out.println(ice);
       int error=fun(2,1);
       System.out.println(error);
       String food=fun("r","e","d");
       System.out.println(food);

    }
    static int fun(int a,int b){
        int answer=a+b;
        return answer;
    }
    static String fun(String a,String b,String c)
    {
        return a+b+c;
    }
    static int fun(int a,int b,int c,int d)
    {
        int sum=a+b+c+d;
        return sum;
    }
}
