import java.util.*;

public class Anagram
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String1: ");
        String str1 = scan.next();
        System.out.println("Enter String2: ");
        String str2 = scan.next();
        anagram(str1, str2);
    }
    public static void anagram(String str1,String str2) {
        int i;
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        char string1[] = str1.toCharArray();
        char string2[] = str2.toCharArray();
        for (i = 0; i < string1.length; i++) {
            for (int j = i + 1; j < string1.length; j++) {
                if (string1[i] > string1[j]) {
                    char temp = string1[i];
                    string1[i] = string1[j];
                    string1[j] = temp;
                }
            }
        }
        for (i = 0; i < string2.length; i++) {
            for (int j = i + 1; j < string2.length; j++) {
                if (string2[i] > string2[j]) {
                    char temp = string2[i];
                    string2[i] = string2[j];
                    string2[j] = temp;
                }
            }
        }
        str1 = Arrays.toString(string1);
        str2 = Arrays.toString(string2);
        display(str1,str2);
    }
    public static void display(String str1,String str2)
    {
        if(str1.equals(str2))
        {
            System.out.println("Given strings are anagrams of each other");
        }
        else
        {
            System.out.println("Given strings are not anagrams of each other");
        }
    }
}
