
public class MaxMin {
    public static void main(String[]args)
    {
        int arr[]={9,4,6,8,1};
     Minmax(arr);
     System.out.println("Maximum Element :"+arr[4]);
     System.out.print("Minimum Element:"+arr[0]);
    }
    static int[]Minmax(int []num)   {
int i=1;
while(i<num.length)
{
    if(num[i-1]>num[i])
    {
int temp=num[i-1];
num[i-1]=num[i];
num[i]=temp;
i=1;
    }
    else{
  i++;
    }
  
}
return num;
}
}
