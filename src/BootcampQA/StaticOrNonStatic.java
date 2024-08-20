package BootcampQA;

public class StaticOrNonStatic {
    //void artinya tidak mengembalikan nilai
    //tanpa public, private, atau protected = berarti default access
    //hanya dapat diakses di class yang sama dan package yang sama

    //non-statis
    void eat(String food){
        System.out.println("Hi!");
        System.out.println("Saya sedang makan " + food);
    }

    //static
    static void drink(String food){
        System.out.println("Saya sedang minum " + food);
    }

    // fungsi main
    public static void main(String[] args) {

        // pemanggilan fungsi static
        drink("Kopi");


        // mambuat instansiasi objek saya dari class FungsiStatic
        StaticOrNonStatic obj = new StaticOrNonStatic();
        // pemanggilan fungsi non-static
        obj.eat("Nasi Goreng");

    }
}
