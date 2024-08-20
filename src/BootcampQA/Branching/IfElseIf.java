package BootcampQA.Branching;

import java.util.Scanner;

public class IfElseIf {
    //percabangan IF/ELSE/IF memiliki lebih dari dua pilihan.
    public static void main(String[] args) {
        // membuat variabel dan scanner
        int score;
        String grade;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("Inputkan nilai: ");
        score = scan.nextInt();

        // tentukan grade-nya
        if ( score >= 90 ) {
            grade = "A";
        } else if ( score >= 80 ){
            grade = "B+";
        } else if ( score >= 70 ){
            grade = "B";
        } else if ( score >= 60 ){
            grade = "C+";
        } else if ( score >= 50 ){
            grade = "C";
        } else if ( score >= 40 ){
            grade = "D";
        } else {
            grade = "E";
        }

        // cetak hasilnya
        System.out.println("Grade: " + grade);
    }
}
