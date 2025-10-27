import java.util.Scanner;

public class Main {
    public static void main(string[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama:");
        int a =sc.nextInt();
        System.out.print("Masukkkan angka kedua:");
        int b = sc.nextInt();

        if (a>b)
            System.ou.printIn(a + "lebih besar dari" + b);
        else if (a<b)
          System.out.printIn(a + "lebih kecil dari" + b);
        else
          System.out.printIn("Keduanya sama besar");

        System.out.printIn("Apakah keduanya sama?" + (a == b));
        
    }
}