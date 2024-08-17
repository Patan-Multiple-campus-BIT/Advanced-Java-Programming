// 18.	Overloading Constructors:  
// ●	Design a Java class with multiple constructors. Demonstrate the concept of constructor overloading by creating objects using different constructors.

class Monster
{
    private int a;
    private int b;
    private int c;

    public Monster()
    {
        System.out.format("The value assigned to a, b and c are: %d, %d and %d\n",a,b,c);
    }
    public Monster(int first, int second)
    {
        this.a = first;
        this.b = second;
        System.out.format("The value assigned to a, b and c are: %d, %d and %d\n",a,b,c);
    }
    public Monster(int first,int second, int third)
    {
        this.a = first;
        this.b = second;
        this.c = third;
        System.out.format("The value assigned to a, b and c are: %d, %d and %d\n",a,b,c);
    }
}
public class Question18 {

public static void main(String[] args) {
    Monster mnstr = new Monster();
    Monster  mnster2= new Monster(10,5);
    Monster  mnster3= new Monster(10,5,4);
}    
}
