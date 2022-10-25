import java.util.Scanner;

public class Palindrome {
    public static void main(String[] arg)
    {
        String a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input string: ");
        a =sc.nextLine();

        if(isPalindrome(a))
        {
            System.out.println(a+" is a Palindrome");
        }
        else
        {
            System.out.println(a+" is not a Palindrome");
        }
    }

    public static boolean isPalindrome(String s)
    {
        int left = 0, right =s.length() - 1;

        while(left<right)
        {
           if(s.charAt(left) != s.charAt(right))
           {
               return false;
           }
           left++;
           right--;
        }
        return true;
    }
}
