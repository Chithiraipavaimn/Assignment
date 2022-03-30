package Game;

import java.util.*;

public class MathGame
{
    List<Integer> options=new ArrayList<>();
    int question_1;
    public  void input()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Question 1:");
        question_1= scan.nextInt();
        System.out.println("Choices: ");
        for(int i=0;i<4;i++)
        {
            options.add(scan.nextInt());
        }
        System.out.println("The Choices are: "+ options);
    }
}
