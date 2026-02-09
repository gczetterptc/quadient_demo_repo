// Demo.java
public class Demo {

    public static void main(String[] args) {
        System.out.println("Hello, Java!");

        Demo demo = new Demo();
        demo.sayHello("World");
        demo.addNumbers(5, 7);
    }

    // A simple method
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Another demo method
    public int addNumbers(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
        return sum;
    }
}
