class student
{
    static long prefeb = 24070122;
    String name;
    int    clas;
    char   div;
    int    roll;
    student(String a,int b,char c,int d)
    {
        name = a;
        clas = b;
        div  = c;
        roll = d;
    }
    void display()
    {
        System.out.println(name +"  "+clas +"  "+div +"  "+prefeb + roll);
    }
}
public class Main
{
	public static void main(String[] args)
	{
		student s1= new student("vats",12,'A',01);
		s1.display();
	}
}
