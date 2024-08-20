package BootcampQA.Iteration;

public class ForExample {
    public static void main(String[] args){
        ForExample obj = new ForExample();
        obj.forIteration();
    }

    public void forIteration(){
        // Menggunakan loop for untuk mencetak angka dari 1 hingga 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public void star() {
        int n = 5; // Jumlah baris maksimum untuk bagian pertama pola

        // Mencetak bagian atas pola
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Mencetak bagian bawah pola
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
