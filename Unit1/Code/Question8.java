// 8.	Write a Java program that initializes an array of strings and uses a for-each loop to print each element of the array.
public class Question8 {
    public static void main(String[] args) {
        String[] myString = new String[]
        {
            "Keshab","Prabhat","Himal","Monster"
        };
        System.out.println("Elements of array are as follow: ");
        for(String i:myString)
        {
            System.out.println(i);
        }
    }
}
