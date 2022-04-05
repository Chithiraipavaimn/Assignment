import java.util.*;

public class SumArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter your array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Sum: ");
        int k = scan.nextInt();
        List<Integer> al=sum(arr,k);
        System.out.println("arr: "+al);
    }

    public static List<Integer> sum(int arr[], int k)
    {
        List<Integer> al=new ArrayList<>();
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if((arr[i]+arr[j])%k==0)
                {
                   if(i<j)
                   {
                       count++;
                       al.add(arr[i]);
                       al.add(arr[j]);
                   }
                }
            }
        }
        System.out.println("There are "+count+" pairs");
        return al;
    }
}
