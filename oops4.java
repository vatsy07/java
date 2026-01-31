import java.util.Scanner;

class Student {
    int marks;

    void getMarks(int m) {
        marks = m;
        System.out.println("Marks (Instance Method): " + marks);
    }

    static void showMessage() {
        System.out.println("This is a Static Method");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int m = sc.nextInt();

        Student s = new Student();
        s.getMarks(m);            
        Student.showMessage();   
    }
}