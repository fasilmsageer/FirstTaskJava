import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] arg)
    {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        a = sc.nextInt();
        System.out.println("Enter the second value: ");
        b = sc.nextInt();
        System.out.println("Perfect square numbers between "+a+" and "+b+" are: ");
        for(int i=a;i<=b;i++)
        {
            if(Math.sqrt(i) == (int)Math.sqrt(i))
            {
                System.out.print(i+ " ");
            }
        }
    }
}
