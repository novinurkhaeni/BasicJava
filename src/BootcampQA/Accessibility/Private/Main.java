package BootcampQA.Accessibility.Private;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        // myClass.privateVariable; // Kesalahan: tidak bisa diakses dari luar kelas MyClass
        // myClass.privateMethod(); // Kesalahan: tidak bisa diakses dari luar kelas MyClass
        myClass.accessPrivateMethod(); // Akses melalui metode publik
    }
}
