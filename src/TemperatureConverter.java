import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] arg)
    {
        double a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Fahrenheit temperature");
        a =sc.nextDouble();
        System.out.println("Celsius temperature is = "+celsius(a));
    }
    static double celsius(double f)
    {
        return (f-32)*5/9;
    }
}
