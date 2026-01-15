import java.util.Scanner;

public class Main
{
    public static  int add(int a, int b)
    {
        int c = a + b;
        return c;
    }

    public static int mul(int a, int b)
    {
        int c = a * b;
        return c;
    }

    public static void main(String[] args)
    {
        System.out.print("Enter Your Numbers: \n");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        

        int c = add(a, b);
        int d = mul(a, b);

        System.out.println("Addition = " + c);
        System.out.println("Multiplication = " + d);
    }
}
