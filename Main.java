class OuterClass {

    int outerData = 50;

    class InnerClass {
        void display() {
            System.out.println("Outer class data: " + outerData);
        }
    }

    public static void main(String[] args) {
        OuterClass obj = new OuterClass();
        OuterClass.InnerClass in = obj.new InnerClass();
        in.display();
    }
}