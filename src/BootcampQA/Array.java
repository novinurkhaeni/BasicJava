package BootcampQA;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //MEMBUAT ARRAY
        //array kosong
        String[] name1 = new String[5];

        //MENGISI ARRAY
        name1[0] = "Linda";
        name1[1] = "Santi";
        name1[2] = "Susan";
        name1[3] = "Mila";
        name1[4] = "Ayu";

        //MENGISI ARRAY
        String[] name2 = {"Linda", "Santi", "Susan", "Mila", "Ayu"};

        //MENGAMBIL DATA ARRAY
        //dimulai dari 0
        System.out.println(name1[2]);
        System.out.println("---------------------------");

        for (String name : name2) {
            System.out.println(name);
        }
        System.out.println("---------------------------");

        //ARRAY MULTI DIMENSI
        String[][] kontak = {
                {"Lili","08111"},
                {"Lala","08122"},
                {"Maya","08133"}
        };

        Array obj = new Array();
        obj.arrayListExample();
    }

    public void example2(){
        // membuat array buah-buahan
        String[] fruits = new String[5];

        // membuat scanner
        Scanner scan = new Scanner(System.in);

        // mengisi data ke array
        for( int i = 0; i < fruits.length; i++ ){
            System.out.print("Buah ke-" + i + ": ");
            fruits[i] = scan.nextLine();
        }

        System.out.println("---------------------------");

        // menampilkan semua isi array
        for( String fruit : fruits ){
            System.out.println(fruit);
        }
    }

    public void multipleArray(){
        // Membuat Array dan Scanner
        String[][] tables = new String[2][3];
        Scanner scan = new Scanner(System.in);

        // mengisi setiap meja
        for(int rows = 0; rows < tables.length; rows++){
            for(int columns = 0; columns < tables[rows].length; columns++){
                System.out.format("Siapa yang akan duduk di meja (%d,%d): ", rows, columns);
                tables[rows][columns] = scan.nextLine();
            }
        }

        // menampilkan isi Array
        System.out.println("-------------------------");
        for(int rows = 0; rows < tables.length; rows++){
            for(int columns = 0; columns < tables[rows].length; columns++){
                System.out.format("| %s | \t", tables[rows][columns]);
            }
            System.out.println("");
        }
        System.out.println("-------------------------");
    }

    public void arrayListExample(){
        //ArrayList mampu menyimpan data dengan tipe yang berbeda.
        // membuat objek array list
        ArrayList kantongAjaib = new ArrayList();

        // Mengisi kantong ajaib dengan 5 benda
        kantongAjaib.add("Senter Pembesar");
        kantongAjaib.add(532);
        kantongAjaib.add("tikus");
        kantongAjaib.add(1231234.132);
        kantongAjaib.add(true);
        kantongAjaib.add(1, "Pisang"); // Menambahkan Pisang di indeks ke-1

        System.out.println(kantongAjaib);

        // menghapus tikus dari kantong ajaib
        kantongAjaib.remove("tikus");
        kantongAjaib.remove(0); // Menghapus elemen di indeks 0

        // Menampilkan isi kantong ajaib
        System.out.println(kantongAjaib);

        kantongAjaib.set(1, "Jeruk"); // Mengubah elemen di indeks 1 menjadi "Jeruk"
        System.out.println(kantongAjaib);

        // menampilkan banyak isi kantong ajaib
        System.out.println("Kantong ajaib berisi "+ kantongAjaib.size() +" item");

        String basket = kantongAjaib.get(0).toString(); // get index ke 0
        System.out.println(basket);

        boolean ada = kantongAjaib.contains("Mangga"); // Mengembalikan true jika "Mangga" ada
        System.out.println(ada);

        System.out.println("---------------------------");
        for (Object item : kantongAjaib) {
            System.out.println(item);
        }
        System.out.println("---------------------------");

        kantongAjaib.clear(); // Menghapus semua elemen

        // menampilkan banyak isi kantong ajaib
        System.out.println("Kantong ajaib berisi "+ kantongAjaib.size() +" item");

    }
}
