//12.	Simple Class and Object:
// ●	Write a Java program that defines a class called Person with attributes such as name and age. Create an object of this class and print its details.
class Person
{
    String name;
    int age;
}
public class Question12 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Keshab Aryal";
        p1.age = 23;
        System.out.format("The name of person is: %s and the age is %d years",p1.name,p1.age);
    }
}
