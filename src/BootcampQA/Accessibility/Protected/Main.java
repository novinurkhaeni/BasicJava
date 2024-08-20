package BootcampQA.Accessibility.Protected;

//protected: Dapat diakses oleh kelas itu sendiri, subclass, dan kelas lain dalam paket yang sama,
// tetapi tidak oleh kelas lain di luar paket kecuali melalui subclass.
public class Main {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.accessProtectedMethod();
        // obj.protectedVariable; // Kesalahan: tidak bisa diakses langsung dari luar kelas MyClass atau subclass
        // obj.protectedMethod(); // Kesalahan: tidak bisa diakses langsung dari luar kelas MyClass atau subclass
    }
}
