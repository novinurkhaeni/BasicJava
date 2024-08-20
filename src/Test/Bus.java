package Test;

import java.util.Scanner;
import java.util.Arrays;

public class Bus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //String input = scan.nextLine();

        //WRITE YOUR CODE HERE
        int n = scan.nextInt();
        scan.nextLine();

        String[] familySizesStr = scan.nextLine().split(" ");
        if (familySizesStr.length != n) {
            System.out.println("Input must be equal with count of family");
            return;
        }

        int[] familySizes = new int[n];
        for (int i = 0; i < n; i++) {
            familySizes[i] = Integer.parseInt(familySizesStr[i]);
        }

        Arrays.sort(familySizes);
        int left = 0;
        int right = n - 1;
        int busCount = 0;

        while (left <= right) {
            if (familySizes[left] + familySizes[right] <= 4) {
                left++;
            }
            right--;
            busCount++;
        }

        System.out.println("Minimum bus required is : " + busCount);
    }
}