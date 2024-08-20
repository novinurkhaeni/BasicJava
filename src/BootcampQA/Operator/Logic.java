package BootcampQA.Operator;

public class Logic {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c;

        //konjungsi (dan)
        //keduanya harus benar
        c = a && b;
        System.out.println("true && false = " + c);

        //disjungsi (atau)
        //salahsatu harus benar
        c = a || b;
        System.out.println("true || false = " + c);

        //negasi (bukan) kebalikan
        c = !a;
        System.out.println("!true = " + c);
    }
}
