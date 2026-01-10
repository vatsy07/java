import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int a      = sc.nextInt();
	    int b      = sc.nextInt();
	    
	    if(a%b == 0)
	    {
	        System.out.println("B divides A completely");
	    }
	    else
	    {
	        System.out.println("B fails to divide A");
	    }
	}
}
