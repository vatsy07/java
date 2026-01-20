class method
{
    static int count = 0;
    static void show()
    {
        System.out.println(count);
    }
    int a;
    method(int a)
    {
        this.a = a;
        count  = count+1;
    }
    void display()
    {
        System.out.println(count + " "+"->"+a);
    }
}


class Main
{
    public static void main(String[] args)
    {
        method.show();
        method m1 = new method(3);
        m1.display();
    }
}