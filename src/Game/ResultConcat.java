package Game;

import Game.MathGame;

import java.util.*;

public class ResultConcat extends MathGame
{
    public void concat_1()
    {
        String str="";
        for(int i=0;i<4;i++)
        {
            str=str+options.get(i);
        }
        String str_r="";
        for(int i=3;i>=0;i--)
        {
            str_r=str_r+options.get(i);
        }
        int ans=Integer.parseInt(str);
        int ans1=Integer.parseInt(str_r);
        if(ans==question_1 || ans1==question_1)
         {
             System.out.println("Answer is :" +question_1);
             System.out.println("Successfully Passed to Next Level.");
             System.exit(0);
         }
    }
    public int index_cal(int number)
    {
        int index=0;
        for(int i=0;i<4;i++)
        {
            if(number== options.get(i))
            {
                 index = i;
            }
        }
        return index;
    }
    public void operation()
    {
        Scanner scan=new Scanner(System.in);
        List<Integer> store=options;
        int result=0;
        do
        {
            System.out.println("Given numbers are: ");
            System.out.println(options);
            System.out.println("Enter your number: ");
            int number=scan.nextInt();
            System.out.println("Operators: \n1. ( \n2. +\n3. -\n4. *\n5. /\n6. )");
            int operator=scan.nextInt();
            switch (operator)
            {
                case 1:
                    index_cal(number);

            }

        }while(question_1!=result);
    }
}
