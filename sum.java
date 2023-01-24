import java.util.Scanner;

class sumation {
    public static void main(String[] args)

    {
        Scanner hehe = new Scanner(System.in);
        System.out.println("enter two integers to find the sum");
        Integer a = hehe.nextInt();
        Integer b = hehe.nextInt();
        hehe.close();
        Integer c = a + b;
        System.out.println("the sum of the two numbers is : " + c);

    }
}
