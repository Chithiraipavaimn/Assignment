
public class FibonacciPrimeNumber {

    public static void main(String[] args) {
        int a = 0, b = 1, c;
        int i;
         for(int k=2;k<=10;k++)
        {
            c = a + b;
            a = b;
            b = c;
            int temp=c;
            if (c == 1)
            {
                continue;
            }
            int count = 0;
                for (i = 2; i <= temp/2; i++)
                {
                    if (temp % i == 0) {
                        count = 1;
                    }
                }
                if(count!=1)
                {
                    System.out.println(temp+" ");
                }
        }
    }
}
