// 13.	Multiple Objects:
// ●	Develop a Java program that defines a class named Car with attributes like model and year. Create multiple objects of the Car class and print their details.

class Car
{

    String model;
    int year;

    public Car(String s, int y)
    {
        this.model = s;
        this.year = y;
    }
    void displayDetails()
    {
        System.out.format("Car model: %s\nYear: %d\n",this.model,this.year);
    }
}
public class Question13 {
    public static void main(String[] args) {
        Car c1 = new Car("X",2024);
        Car c2 = new Car("Y",2022);
        c1.displayDetails();
        c2.displayDetails();
    }
}
