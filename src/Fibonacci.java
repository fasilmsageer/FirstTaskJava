import java.util.Scanner;

public class Fibonacci {
    static int n1=0,n2=1,n3=0;
    static void printFibonacci(int n){
        for(int i=n;i>=1;i--){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.print(n1+" "+n2);
        printFibonacci(n-2);
    }
}
