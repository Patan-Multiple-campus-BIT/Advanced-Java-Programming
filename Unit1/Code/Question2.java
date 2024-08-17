// 2.	Array Manipulation:
// ●	Create a Java program that takes an array of strings as input and prints the reverse of each string in the array.
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of strings you want to reverse: ");
        number = sc.nextInt();
        
        String[] myStringArray = new String[number];
        for(int i=0; i<number ;i++)
        {
            System.out.print("Enter the string "+i+" : ");
            myStringArray[i] = sc.next();
        }
 
        for(String i: myStringArray)
        {
            System.out.println(Reverse(i));;
        }
        sc.close();
    }
    static String Reverse(String word)
    {
        String reverse = "";
        for(int i= word.length()-1;i>=0;i--)
        {
            reverse += word.charAt(i);
        }
        return reverse;
    }
}
