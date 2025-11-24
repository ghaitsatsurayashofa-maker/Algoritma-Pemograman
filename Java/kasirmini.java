import java.util.Scanner;

public class kasirmini { 
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Barang : ");
        String nama_barang = input.nextLine();

        System.out.print("Harga Barang : ");
        double harga_barang = input.nextDouble();

        System.out.print("Jumlah Barang : ");
        int jumlah_barang = input.nextInt();

        double total = harga_barang * jumlah_barang;
        double diskon;

        if (total > 65100) {
            diskon = total * 0.01;
        } else {
            diskon = 0;
        }

        double total_bayar = total - diskon;

        System.out.println("\n====  STRUK PEMBELAIN  ====");
        System.out.println("Nama Barang      : " + nama_barang);
        System.out.println("Harga Satuan     : " + harga_barang);
        System.out.println("Jumlah Beli      : " + jumlah_barang);
        System.out.println("Total Harga      : " + total);
        System.out.println("Diskon           : " + diskon);
        System.out.println("Total Bayar      : " + total_bayar);
        System.out.println("============================");
     }
}
