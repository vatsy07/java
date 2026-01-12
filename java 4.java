/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    public static void main(String[] args)
    {
        String a = "*";

        for(int i = 0; i < 4; i++)
        {
            if(i == 0 || i == 3)
            {
                for(int j = 0; j < 3; j++)
                {
                    a = a + "*";
                }
                System.out.println(a);
            }
            else
            {
                for(int j = 0; j < 4; j++)
                {
                    if(j == 0 || j == 3)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            a = "*";
        }
    }
}
