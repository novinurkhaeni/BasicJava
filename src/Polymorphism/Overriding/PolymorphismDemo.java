package Polymorphism.Overriding;

// Kelas ini dapat diakses oleh kelas di mana saja dalam proyek
public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.voice();  // Output: Anjing menggonggong
        animal2.voice();  // Output: Kucing mengeong
    }
}
