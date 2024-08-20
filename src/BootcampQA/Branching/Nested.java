package BootcampQA.Branching;

import java.util.Scanner;

public class Nested {
    //percabangan yang ada di dalam percabangan (percabangan bersarang)
    public static void main(String[] args) {
        // deklarasi variabel dan Scanner
        int shopping, discount, payment;
        String card;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("Apakah ada kartu member (yes / no)? ");
        card = scan.nextLine();
        System.out.print("Total belanjaan: ");
        shopping = scan.nextInt();

        // proses
        // equalsIgnoreCase = abaikan huruf besar dan kecil
        if (card.equalsIgnoreCase("yes")) {
            if (shopping > 500000) {
                discount = 50000;
            } else if (shopping > 100000) {
                discount = 15000;
            } else {
                discount = 0;
            }

        } else {
            if (shopping > 100000) {
                discount = 5000;
            } else {
                discount = 0;
            }
        }

        // total yang harus dibayar
        payment = shopping - discount;

        // output
        System.out.println("Total Bayar: Rp " + payment);

    }
}
