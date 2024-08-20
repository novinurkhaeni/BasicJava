package BootcampQA;

public class VariableAndDataType {
    //global variable
    //ada 2 : class variable dan instance variable
    //Class variable adalah variabel yang dideklarasikan di dalam kelas dengan kata kunci static.
    //Karena itu, variabel ini juga disebut sebagai static variable.
    // hanya ada satu salinan dari class variable yang dibagikan oleh semua objek dari kelas tersebut.
    //Class variable diinisialisasi saat kelas tersebut dimuat ke dalam memori, sebelum ada objek yang dibuat.
    //Nilai ini sama untuk semua instance dari kelas.
    //Dibagikan oleh semua objek dari kelas tersebut, dan perubahan nilainya akan terlihat oleh semua objek dari kelas itu.
    private static int classVariable = 10;

    // Instance variable adalah variabel yang dideklarasikan di dalam kelas, tetapi di luar metode apa pun,
    // dan setiap objek yang dibuat dari kelas tersebut akan memiliki salinan variabel ini sendiri.
    // Instance variable diakses menggunakan objek dari kelas
    // Instance variable diinisialisasi ketika objek dari kelas tersebut dibuat. Nilainya bisa berbeda untuk setiap objek
    private int instanceVariable = 10;

    public static void main(String[] args) {
        //DATA TYPE
        System.out.println("Macam-macam tipe data");
        char character = 'a';
        String word = "Hello World";
        int number = 123;
        float decimal = 3.1415927f;
        double doubleNumber = 3.141592653589793;
        boolean bool = true;

        System.out.println("1. char, Tipe data karakter = " + character);
        System.out.println("2. int, angka atau bilangan bulat = " + number);
        System.out.println("3. float, bilangan desimal = " + decimal);
        System.out.println("4. double, bilangan desimal juga, tapi lebih besar kapasitasnya = " + doubleNumber);
        System.out.println("5. String, kumpulan dari karakter yang membentuk teks = " + word);
        System.out.println("6. boolean, tipe data yang hanya bernilai true dan false = " + bool);


        //VARIABLE
        System.out.println("\nMacam-macam penulisan variable");
        //ini adalah variable kosong
        int emptyVariable;
        //memberi nilai pada variable kosong
        emptyVariable = 1;
        System.out.println("empty variable = " + emptyVariable);

        //membuat variable dan langsung diberi nilai
        String valuedVariable = "My name is John Doe";
        System.out.println("valued variable = " + valuedVariable);

        //Membuat sekumpulan variabel yang tipe datanya sama
        int a = 1, b = 2, c = 3;
        System.out.println("Variable dengan tipe data sama int a = 1,b = 2,c = 3; " + a + b + c);

        //local variable = variable yang ditulis didalam method/function
        int localVariable = 10;
        System.out.println("localVariable = " + localVariable);

        //instance variable
        VariableAndDataType obj1 = new VariableAndDataType();
        VariableAndDataType obj2 = new VariableAndDataType();
        obj1.instanceVariable = 20; // Mengubah nilai instanceVariable untuk obj1
        System.out.println("Obj1 instanceVariable: " + obj1.instanceVariable); // Output: 20
        System.out.println("Obj2 instanceVariable: " + obj2.instanceVariable); // Output: 10

        //class variable
        VariableAndDataType obj3 = new VariableAndDataType();
        VariableAndDataType obj4 = new VariableAndDataType();
        obj3.classVariable = 20; // Mengubah nilai classVariable
        System.out.println("Obj3 classVariable: " + obj3.classVariable); // Output: 20
        System.out.println("Obj4 classVariable: " + obj4.classVariable); // Output: 20
        System.out.println("MyClass classVariable: " + VariableAndDataType.classVariable); // Output: 20
    }
}
