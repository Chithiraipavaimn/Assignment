
public class FibonacciPrimeNumber {

    public static void main(String[] args) {
        int arr[]=new int[10];
        int a = 0, b = 1, c;
        int i,j=0;
        int count = 0;
        while (j<10)
        {
            c = a + b;
            if (c == 1) {
                continue;
            }
            else {
                for (i = 2; i <= c; i++) {
                    if (c % i == 0) {
                        count = 1;
                    }
                }
                if (count != 1) {
                    arr[j]=c;
                    j++;
                }
                a = b;
                b = c;
            }
        }
        for(int k:arr)
        {
            System.out.println(k+" ");
        }
    }
}
