package BootcampQA.Accessibility.Protected;

//extends digunakan untuk mewarisi sifat (fields) dan metode (methods) dari satu kelas ke kelas lain
public class SubClass extends MyClass{
    public void accessProtectedMethod(){
        System.out.println(protectedVariable); // Akses dari subclass
        protectedMethod(); // Akses dari subclass
    }
}
