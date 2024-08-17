//3.	Sum and Average:
//        ●	Write a Java program that generates an array of random numbers (between 1 and 100), calculates the sum, and then computes the average of those numbers.
import java.util.Random;
import java.util.Scanner;
public class Question3 {
    static int[] GenerateRandom()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int number = sc.nextInt();
        int[] RandomArray = new int[number];
        Random rd = new Random();
        for(int i=0;i<number;i++)
        {
            RandomArray[i] = rd.nextInt(100)+1;
        }
        System.out.println("Random Array is generated as follow: ");
        for(int i:RandomArray)
        {
            System.out.print(i+" ");
        }
        sc.close();
        System.out.println();
        return RandomArray;
        
    }
    static int Sum(int[] Arr)
    {
        int sum = 0;
        for(int i:Arr)
        {
            sum+=i;
        }
        return sum;
    }
    static float Average(int[] Arr)
    {
        int sum = Sum(Arr);
        float avg = sum/(float) Arr.length;
        return avg;
    }
    public static void main(String[] args) {
        int[] RandomNumbers = GenerateRandom();
        int sum = Sum(RandomNumbers);
        float avg = Average(RandomNumbers);
        System.out.println("The sum is: "+sum);
        System.out.println("The Average is: "+avg);
        System.out.println();
    }
}
