import java.util.Scanner;

public class ATM {

    static boolean validasiNama(String nama) {
        return nama.matches("[a-zA-Z]+");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;

        do {
            System.out.print("Masukkan nama anda: ");
            nama = input.next();
            if (!validasiNama(nama)) {
                System.out.println("Nama tidak valid! Harus huruf semua.\n");
            }
        } while (!validasiNama(nama));

        System.out.print("Masukkan NIM anda (angka saja): ");
        String nim = input.next();
        int saldo = Integer.parseInt(nim);

        System.out.println("\nHalo " + nama + ", saldo awal kamu adalah Rp " + saldo + "\n");

        while (true) {
            System.out.println("===== MENU ATM =====");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Setor Tunai");
            System.out.println("4. Transfer");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            int pilih = input.nextInt();

            switch (pilih) {
                case 1 ->
                    System.out.println("Saldo kamu: Rp " + saldo + "\n");

                case 2 -> {
                    System.out.print("Jumlah tarik: ");
                    int tarik = input.nextInt();

                    if (tarik <= saldo) {
                        saldo -= tarik;
                        System.out.println("Tarik berhasil! Saldo sekarang: Rp " + saldo + "\n");
                    } else {
                        System.out.println("Saldo tidak cukup!\n");
                    }
                }

                case 3 -> {
                    System.out.print("Jumlah setor: ");
                    int setor = input.nextInt();
                    saldo += setor;
                    System.out.println("Setor berhasil! Saldo sekarang: Rp " + saldo + "\n");
                }

                case 4 -> {
                    System.out.print("Jumlah transfer: ");
                    int transfer = input.nextInt();

                    if (transfer <= saldo) {
                        saldo -= transfer;
                        System.out.println("Transfer berhasil! Saldo sekarang: Rp " + saldo + "\n");
                    } else {
                        System.out.println("Saldo tidak cukup!\n");
                    }
                }

                case 5 -> {
                    System.out.println("Terima kasih telah menggunakan ATM!");
                    return;
                }

                default ->
                    System.out.println("Menu tidak valid!\n");
            }
        }
    }
}
