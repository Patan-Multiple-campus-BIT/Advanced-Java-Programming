// 10.	Write a Java program that uses a for-each loop to copy elements from one array to another and prints the copied array.
public class Question10 {
    public static void main(String[] args) {
        int[] OriginalArray = new int[]
        {
            1,2,3,4,5,6
        };
        int[] DuplicateArray = new int[OriginalArray.length];
        int k=0;
        for(int i:OriginalArray)
        {
            DuplicateArray[k++] =i;
        }
        System.out.println("The elements in duplicate array are as follow: ");
        for(int j: DuplicateArray)
        {
            System.out.print(j+" ");
        }
    }
}
