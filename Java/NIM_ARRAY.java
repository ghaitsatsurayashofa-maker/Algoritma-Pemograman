import java.util.Scanner;

public class NIM_ARRAY {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        int[] digits = new int[nim.length()];

        for (int i = 0; i < nim.length(); i++) {
            digits[i] = Character.getNumericValue(nim.charAt(i));
        }

        int total = 0;
        int maks = digits[0];
        int min = digits[0];

        for (int d : digits) {
            total += d;
            if (d > maks) maks = d;
            if (d < min) min = d;
        }

        double rata = (double) total / digits.length;

        int[] reverse = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reverse[i] = digits[digits.length - 1 - i];
        }

        System.out.print("Array digit        : ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        System.out.println("Total digit        : " + total);
        System.out.println("Digit maksimum     : " + maks);
        System.out.println("Digit minimum      : " + min);
        System.out.println("Rata-rata digit    : " + rata);

        System.out.print("Reverse array NIM  : ");
        for (int d : reverse) System.out.print(d + " ");
        System.out.println();
    }
}
