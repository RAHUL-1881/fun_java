import java.util.Scanner; // importing scanner class

public class user_input {
    public static void main(String... rahul) {
        Scanner haha = new Scanner(System.in); // creating scanner object;
        System.out.println("enter the string");
        String name = haha.nextLine();// taking user input;
        System.out.println("user name is :" + name);
    }
}
