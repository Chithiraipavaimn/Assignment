import java.util.*;

public class SumArray
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n=scan.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter your array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        System.out.println("Sum: ");
        int k= scan.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if((arr[i]+arr[j])%k==0)
                {
                   if(i<j)
                   {
                       count++;
                       System.out.println(" ["+arr[i]+","+arr[j]+"] ");
                   }
                }
            }
        }
        System.out.println("There are "+count+" pairs");
    }
}
