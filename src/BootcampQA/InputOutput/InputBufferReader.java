package BootcampQA.InputOutput;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

//Class BufferReader sebenarnya tidak hanya untuk mengambil input dari keyboard saja.
//Class ini juga dapat digunakan untuk membaca input dari file dan jaringan.

public class InputBufferReader {
    public static void main(String[] args) throws IOException {
        String name;
        int age;

        // Membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);

        // membuat objek bufferreader
        BufferedReader br = new BufferedReader(isr);

        // Mengisi variabel nama dengan Bufferreader
        System.out.print("Inputkan nama: ");
        name = br.readLine();
        System.out.print("Inputkan umur: ");
        age = Integer.parseInt(br.readLine());

        // tampilkan output isi variabel nama
        System.out.println("Nama kamu adalah " + name);
        System.out.println("Umur kamu adalah " + age);
    }
}
