package BootcampQA.Operator;

import BootcampQA.JavaStructure;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        //buat variable
        double num1, num2, result;
        char operator;

        //buat objek scanner
        Scanner scanner = new Scanner(System.in);

        //input value operator
        System.out.print("Enter an operator (+, -, *, /, %): ");
        operator = scanner.next().charAt(0);

        //input value num1
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        //input value num2
        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        //buat objek untuk akses method / global variable
        Arithmetic arithmetic = new Arithmetic();


        result = arithmetic.calculator(operator, num1, num2);

        System.out.println("The result is: " + result);
    }

    public double calculator(char operator, double a, double b) {
        double result = 0;
        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '%':
                result = a % b;
                break;
            default:
                System.out.println("Invalid operator");
        }

        return result;
    }
}
