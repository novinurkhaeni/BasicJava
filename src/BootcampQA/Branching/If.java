package BootcampQA.Branching;

import java.util.Scanner;

public class If {
    //percabangan yang hanya punya 1 pilihan
    public static void main(String[] args) {
        // membuat variabel shopping dan scanner
        int shopping = 0;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("Total Belanja: Rp ");
        shopping = scan.nextInt();

        // cek apakah dia shopping di atas 100000
        if ( shopping > 100000 ) {
            System.out.println("Selamat, anda mendapatkan hadiah!");
        }

        System.out.println("Terima kasih...");
    }
}
