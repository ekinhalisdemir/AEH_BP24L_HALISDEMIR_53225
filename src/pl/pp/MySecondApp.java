package pl.pp;

import java.util.Scanner;

public
class MySecondApp {
    public static void main(String[] args) {
        double x = 10;
        double y = 2;
        Scanner scanner = new Scanner(System.in);
        var result = x + y;
        System.out.println("x + y = " + result);
        result = x - y;
        System.out.println("x - y = " + result);
        result = x * y;
        System.out.println("x * y = " + result);
        result = x / y;
        System.out.println("x / y = " + result);
        result = x % y;
        System.out.println("x % y = " + result);
        System.out.println("Enter two numbers separated by the Enter key:");
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();
        System.out.println("x + y = " + (first + second));
        System.out.println("x - y = " + (first - second));
        System.out.println("x * y = " + (first * second));
        System.out.println("x / y = " + (first / second));

    }
}
