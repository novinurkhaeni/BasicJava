package Polymorphism;

//Overloading/Compile-Time Polymorphism
// terjadi ketika dua atau lebih metode dalam sebuah kelas memiliki nama yang sama
// tetapi dengan parameter yang berbeda (baik dalam jumlah, tipe, atau keduanya).
public class Overloading {
    // Metode pertama dengan satu parameter integer
    void show(int a) {
        System.out.println("Angka: " + a);
    }

    // Metode kedua dengan dua parameter integer
    void show(int a, int b) {
        System.out.println("Angka: " + a + ", " + b);
    }

    // Metode ketiga dengan satu parameter string
    void show(String a) {
        System.out.println("String: " + a);
    }
    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.show(1);
        obj.show(10, 20);
        obj.show("Hello");
    }
}
