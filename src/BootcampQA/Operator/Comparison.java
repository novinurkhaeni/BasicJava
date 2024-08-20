package BootcampQA.Operator;

public class Comparison {
    public static void main(String[] args) {
        int valueA = 12;
        int valueB = 4;
        boolean result;

        System.out.println("Value A: " + valueA + " Value B: " + valueB);
        // apakah A lebih besar dari B?
        result = valueA > valueB;
        System.out.println("valueA > valueB: " + result);

        // apakah A lebih kecil dari B?
        result = valueA < valueB;
        System.out.println("valueA < valueB: " + result);

        // apakah A lebih besar sama dengan B?
        result = valueA >= valueB;
        System.out.println("valueA >= valueB: " + result);

        // apakah A lebih kecil sama dengan B?
        result = valueA <= valueB;
        System.out.println("valueA <= valueB: " + result);

        // apakah nilai A sama dengan B?
        result = valueA == valueB;
        System.out.println("valueA == valueB: " + result);

        // apakah nilai A tidak sama dengan B?
        result = valueA != valueB;
        System.out.println("valueA != valueB: " + result);
    }
}
