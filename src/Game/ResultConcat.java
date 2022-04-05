package Game;

import Game.MathGame;

import java.util.*;

public class ResultConcat extends MathGame
{
    public int index_cal(int number)
    {
        int index=0;
        for(int i=0;i<4;i++)
        {
            if(number==options.get(i))
            {
                 index = i;
                 break;
            }
        }
        return index;
    }
    public void operation()
    {
        Scanner scan=new Scanner(System.in);
        int result=0;
        while (options.size()!=0)
        {
            System.out.println("Your Choices: "+options);
            System.out.println("Enter your number: ");
            int number=scan.nextInt();
            System.out.println("Operators: \n1. +\n2. -\n3. *\n4. /\n5. Concat");
            int operator=scan.nextInt();
            switch (operator)
            {
                case 1:
                    result=result+number;
                    break;
                case 2:
                    result=result-number;
                    break;
                case 3:
                    if(result==0)
                    {
                        result=1;
                    }
                    result=result*number;
                    break;
                case 4:
                    if(result==0)
                    {
                        result=1;
                    }
                    result=result/number;
                    break;
                case 5:
                    result=(result*10)+number;
                    break;
                default:
                    System.out.println("Enter a valid operator");
                    break;

            }
            System.out.println("result "+result);
            options.remove(index_cal(number));
        }
        if(result!=question_1) {
            System.out.println("Do you wish to restart your game (y/n):");
            char ch = scan.next().charAt(0);
            if (ch == 'y')
            {
                for(int i:arr)
                {
                    options.add(i);
                }
                operation();
            }
        }
        else
        {
            System.out.println("Successfully Passed to Next Level");
            System.exit(0);
        }
    }
}
