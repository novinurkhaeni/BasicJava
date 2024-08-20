package BootcampQA; // deklarasi package
//package merupakan folder yang berisj sekumpulan program java

import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;


//class
//suatu program harus dibungkus di dalam class
public class JavaStructure {
//    method adalah suatu fungsi atau prosedur yang berada di dalam class yang akan dieksekusi
//    name method ==> main()
//    method main() memiliki parameter dengan tipe data string dengan nama variablenya adalah arg
//    parameter ini yang akan menyimpan sebuah argumen di command line
    // void artinya tidak mengembalikan nilai
    public static void main(String[] arg) throws ParseException { //method main
        System.out.println("Nama = Novi Nurkhaeni"); //menampilkan text
        System.out.println("Umur = " + test());

        //kalkulator
        Scanner scanner = new Scanner(System.in);
        Locale locale = new Locale("in", "ID");
        NumberFormat format = NumberFormat.getInstance(locale);
        System.out.print("Enter the first number: ");
        double num1 = format.parse(scanner.next()).doubleValue();

        System.out.print("Enter the second number: ");
        double num2 = format.parse(scanner.next()).doubleValue();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        JavaStructure javaStructure = new JavaStructure();
        double result = 0;

        switch (operator) {
            case '+':
                result = javaStructure.add(num1, num2);
                break;
            case '-':
                result = javaStructure.substract(num1, num2);
                break;
            case '*':
                result = javaStructure.multiplication(num1, num2);
                break;
            case '/':
                result = javaStructure.division(num1, num2);
                break;
            default:
                System.out.println("Invalid operator");
        }

        System.out.println("The result is: " + result);
    }

    public static int test(){
        int umur = 27;
        return umur;
    }

    public double add(double a, double b){
        double result = a + b;
        return result;
    }

    public double substract(double a, double b){
        double result = a - b;
        return result;
    }

    public double multiplication(double a, double b){
        double result = a * b;
        return result;
    }

    public double division(double a, double b){
        double result = a / b;
        return result;
    }
}
