//4.	Finding Maximum and Minimum:
//        ●	Develop a Java program that finds and prints the maximum and minimum values in an array of integers.
import java.util.Scanner;
public class Question4
{
    static int[] maxiMin(int[] Arr)
    {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i:Arr)
        {
            if(max<i) max = i;
            if(min>i) min = i;
        }
        int ans[] = new int[]{max,min};
        return ans;
    }

    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        size = sc.nextInt();
        int[] Arr = new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter the element at position "+(i+1)+" ");
            int num = sc.nextInt();
            Arr[i] = num;
        }
        int ans[] = maxiMin(Arr);
        System.out.format("Maximum Number: %d\nMinimum Number: %d",ans[0],ans[1]);
        sc.close();
    }
}
