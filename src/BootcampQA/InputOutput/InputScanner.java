package BootcampQA.InputOutput;

import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        //--INPUT--
        //Class Scanner;
        //Class BufferReader;
        //dan Class Console.
        //--OUTPUT--
        //print(), println(), dan format()

        //--SCANNER--
        // deklarasi variabel
        String nama, alamat;
        int usia, gaji;

        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("### Pendataan Karyawan PT. Novi Wahyu ###");
        System.out.print("Nama karyawan: ");
        // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        nama = keyboard.nextLine();
        // Tampilkan output lagi
        System.out.print("Alamat: ");
        // menggunakan scanner lagi
        alamat = keyboard.nextLine();

        System.out.print("Usia: ");
        usia = keyboard.nextInt();

        System.out.print("Gaji: ");
        gaji = keyboard.nextInt();


        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("--------------------");
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Gaji: Rp " + gaji);
    }
}
