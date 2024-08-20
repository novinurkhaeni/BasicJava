package BootcampQA.Accessibility.Public;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        System.out.println(myClass.publicVariable); // Akses variable public dari luar kelas MyClass
        myClass.publicMethod(); // Akses method dari luar kelas MyClass
    }
}
