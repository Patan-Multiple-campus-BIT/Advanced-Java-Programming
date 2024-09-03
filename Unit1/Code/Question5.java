// 5.	Sorting an Array:
// ●	Write a Java program that sorts an array of integers in ascending order using the Bubble Sort algorithm. Print the sorted array.

import java.util.Arrays;
public class Question5 {
    public static void swap(int[]arr,int i)
    {
        int temp = arr[i];
        arr[i]=arr[i+1];
        arr[i+1] = temp;
    }
    public static void main(String[] args) {
        int[] Arr= new int[]
        {
            9,8,7,6,5,4,3,2,1
        };
        System.out.print("Before sorting: ");
        System.out.println(Arrays.toString(Arr));
        for(int i =0;i<Arr.length;i++)
        {
            for(int j=0;j<Arr.length-i-1;j++)
            {
                if(Arr[j]>Arr[j+1])
                    swap(Arr,j);
            }
        }
        System.out.print("After sorting: ");
        System.out.println(Arrays.toString(Arr));
    }   
}
