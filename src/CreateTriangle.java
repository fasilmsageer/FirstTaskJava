import java.util.Scanner;

public class CreateTriangle {
    public static void main(String[] arg)
    {
        int a,i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        a=sc.nextInt();
        System.out.println("The triangle is: ");
        for(i=1;i<=a;i++)
        {
            for(n=1;n<=i;n++)
                System.out.print(i);
            System.out.println("");
        }


    }
}
