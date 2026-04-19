import java.util.Scanner;

class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

public class Main {

    static void checkNumber(int n) throws MyException {
        if (n < 0) {
            throw new MyException("Number cannot be negative");
        } else {
            System.out.println("Valid Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int c = a / b;
            System.out.println("Result = " + c);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");

        } catch (Exception e) {
            System.out.println("Wrong Input");

        } finally {
            System.out.println("Program Continued");
        }

        try {
            String name = "Java";
            System.out.println(name.charAt(10));

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index not found");
        }

        try {
            int arr[] = new int[3];
            arr[5] = 100;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array size exceeded");
        }

        try {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            checkNumber(n);

        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
