import java.util.scanner;

public class main {
    public static void main(string[]args) (
        Scanner sc = new Scanner(system.in);
        System.out.print("Masukkan nilai tugas: ");
        double tugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        double uts = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double uas = sc.nextDouble();

        double nilaiAkhir = (0.3*tugas) + (0.3*uts) + (0.4*uas);

        System.out.println("Nilai Akhir =" +nilaiAKhir);
        if (nilaiAKhir>=60)
        System.out.println("Status: LULUS");
        else
        System.out.println("Status: TIDAK LULUS");
}
}