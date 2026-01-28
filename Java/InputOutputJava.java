import java.util.Scanner;

public class InputOutputJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        // Output
        System.out.println("Nama saya adalah " + nama);
        System.out.println("Umur saya " + umur + " tahun");
    }
}
