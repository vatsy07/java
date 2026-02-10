public class ArrayExample {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}




import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Fruits: " + fruits);

        fruits.remove("Banana"); 
        System.out.println("After removing Banana: " + fruits);

        System.out.println("Size: " + fruits.size()); 

        System.out.println("Contains Apple? " + fruits.contains("Apple"));
    }
}







public class StringMethods {
    public static void main(String[] args) {

        String str = " Java Programming ";

        System.out.println("Length: " + str.length());
        System.out.println("Trimmed: " + str.trim());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Substring(2,6): " + str.substring(2, 6));
        System.out.println("Replaced Java with Python: " + str.replace("Java", "Python"));
    }
}




import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {

        String str = "Java, Python, C++, JavaScript";

        StringTokenizer st = new StringTokenizer(str, ",");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}






class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class TestPolymorphism {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();
        a.sound();  

        a = new Cat();
        a.sound();   
    }
}






import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        Vector<Integer> numbers = new Vector<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);

        System.out.println("Vector: " + numbers);

        numbers.remove(1); 
        System.out.println("After removing index 1: " + numbers);

        System.out.println("Size: " + numbers.size());

        System.out.println("Element at index 0: " + numbers.get(0));
    }
}