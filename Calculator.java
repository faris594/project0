//v1.0
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator!");
    }
    public static int add(int a, int b) {
	return a + b;
    }
    public static int divide(int a, int b) {
    if (b == 0) {
        System.out.println("Division by zero is undefined");
        return 0;
    }
    return a / b;
    }
}
