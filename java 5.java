import java.util.Scanner;

public class Main
{
    
    public static int[] creater(int n)
    {
        int[] array = new int[n];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < n; i++)
        {
            array[i] = sc.nextInt();
        }

        return array;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();


        int[] arr = creater(n);

        
        System.out.println("Array elements are:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
