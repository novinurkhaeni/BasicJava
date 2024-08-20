package Polymorphism.Overriding;

// Kelas ini hanya dapat diakses oleh kelas dalam package Polymorphism.Overriding
class Dog extends Animal{
    // Mengoverride metode voice() dari kelas Animal
    @Override
    void voice() {
        System.out.println("Anjing menggonggong");
    }
}
