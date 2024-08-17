// 1.	Array Declaration and Initialization:
// ●	Write a Java program that declares and initializes an array of integers. Print the elements of the array to the console.

public class Question1{
    public static void main(String[] args)
    {
        int[] myArr;                              //declaration
        myArr = new int[] {10,9,8,7,6};           //initialization
        for(int i: myArr)
        {
            System.out.print(i+" ");
        }
    }
}

