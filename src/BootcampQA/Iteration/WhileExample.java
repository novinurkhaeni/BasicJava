package BootcampQA.Iteration;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        WhileExample obj = new WhileExample();
        obj.example1();
    }

    public void example1() {
        // Inisialisasi variabel
        int i = 1;

        // Menggunakan loop while untuk mencetak angka dari 1 hingga 10
        while (i <= 10) {
            System.out.println(i);
            i++; // Increment variabel i
        }
    }

    public void example2() {
        // membuat variabel dan scanner
        boolean running = true;
        int counter = 0;
        String answer;
        Scanner scan = new Scanner(System.in);

        while( running ) {
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [ya/tidak]> ");

            answer = scan.nextLine();

            // cek answernnya, kalau ya maka berhenti mengulang
            if( answer.equalsIgnoreCase("ya") ){
                running = false;
            }

            counter++;
        }

        System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali");
    }
}
