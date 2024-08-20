package BootcampQA.Accessibility.Private;

//Akses private mencegah atribut atau metode diakses oleh kelas lain, bahkan oleh subclass.
public class MyClass {
    private int privateVariable = 10;

    private void privateMethod() {
        System.out.println("Ini adalah metode privat.");
    }

    public void accessPrivateMethod() {
        privateMethod(); // Akses metode privat dari dalam kelas
    }
}
