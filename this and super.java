class person
{
    int age;
    String nae;

    person(int age, String nae)
    {
        this.age = age;
        this.nae = nae;
    }

    void display()
    {
        System.out.println(this.age);
        System.out.println(this.nae);
    }

    void speak()
    {
        System.out.println("Parent speaking");
    }
}

class child extends person
{
    child(int age, String nae)
    {
        super(age, nae);   // Call parent constructor
    }

    void speak()
    {
        super.speak();   // Call parent method
        System.out.println("Child speaking");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        child a1 = new child(10, "ts");
        a1.speak();
    }
}
