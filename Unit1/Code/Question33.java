// 32.	Static Variable in User Class:
// Question: Create a User class with a static variable userCount to keep track of the total number of user instances. Implement methods to increment the count when a new user is created and display the total count. Demonstrate its usage in the main method.
// 33.	Static Method in User Class:
// Question: Extend the User class with a static method generateUsername that takes a user's first name and generates a unique username by appending the user count. Use this method to create usernames for several user instances in the main method.
import java.util.Scanner;
class User
{
    static int userCount;
    public User()
    {
        increaseUser();
        totalUser();
        generateUsername();
    }
    static void increaseUser()
    {
        System.out.println("New user added");
        userCount++;
    }
    static void totalUser()
    {
        System.out.println("Total number of user so far is "+userCount);
    }
    static void generateUsername()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String name = sc.next();
        String username = name+userCount;
        System.out.println("Username: "+username);
    }
}

public class Question33 {
    public static void main(String[] args) {
        User u1 = new User();
        User u2 = new User();
        User u3 = new User();
    }
}
