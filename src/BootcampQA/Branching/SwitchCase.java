package BootcampQA.Branching;

import java.util.Scanner;

public class SwitchCase {
    //Percabangan SWITCH/CASE sebenarnya adalah bentuk lain dari IF/ELSE/IF
    public static void main(String[] args) {
        // membuat variabel dan Scanner
        String trafficLights;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("Inputkan nama warna: ");
        trafficLights = scan.nextLine().toLowerCase(); // Mengubah input menjadi huruf kecil

        switch(trafficLights){
            case "merah":
                System.out.println("Lampu merah, berhenti!");
                break;
            case "kuning":
                System.out.println("Lampu kuning, harap hati-hati!");
                break;
            case "hijau":
                System.out.println("Lampu hijau, silakan jalan!");
                break;
            default:
                System.out.println("Warna lampu lalu lintas salah!");
        }
    }
}
