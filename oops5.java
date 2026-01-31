import java.util.Scanner;

class WrapperExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a float value: ");
        Float f = sc.nextFloat();

        int i = f.intValue();

        System.out.println("Integer value: " + i);
    }
}