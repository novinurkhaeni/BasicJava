package BootcampQA.Branching;

import java.util.Scanner;

public class IfElse {
    //memiliki pilihan alternatif kalau kondisinya salah.
    public static void main(String[] args) {
        // membuat variabel dan Scanner
        int score;
        String name;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("Nama Murid: ");
        name = scan.nextLine();
        System.out.print("Nilai Ujian: ");
        score = scan.nextInt();

        // cek apakah dia lulus atau tidak
        if( score >= 70 ) {
            System.out.println("Selemat " + name + ", anda lulus!");
        } else {
            System.out.println("Maaf " + name + ", anda gagal");
        }
    }
}
