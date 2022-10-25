
import java.util.Scanner;

public class Vowels
{
    public static void main(String[] arg)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Alphabet: ");
        char ch=((in.nextLine()).charAt(0));
        char str=Character.toUpperCase((ch));

        switch (str){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Entered Alphabet is a Vowel: ");
                break;
            default:
                System.out.println("Entered Alphabet is not a Vowel: ");
        }
    }
}
