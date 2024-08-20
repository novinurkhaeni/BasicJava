package BootcampQA.Operator;

public class Assignment {
    public static void main(String[] args) {
        //create variable
        int a, b;

        //memberikan value
        a = 5;
        b = 10;

        // penambahan
        b += a;
        // sekarang b = 10 + 5 = 15
        System.out.println("Penambahan : " + b);

        // pengurangan
        b -= a;
        // sekarang b = 15 - 5 = 10
        System.out.println("Pengurangan : " + b);

        // perkalian
        b *= a;
        // sekarang b = 10 * 5 = 50
        System.out.println("Perkalian : " + b);

        // pembagian
        b /= a;
        // sekarang b = 50 / 5 = 10
        System.out.println("Pembagian : " + b);

        // modulus
        b %= a;
        // sekarang b = 10 % 5 = 0
        System.out.println("Modulus : " + b);
    }
}
