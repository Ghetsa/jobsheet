import java.util.Scanner;

public class PemilihanPercobaan213 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        System.out.print("Nilai uas       : ");
        float uas = input13.nextFloat();
        System.out.print("Nilai uts       : ");
        float uts = input13.nextFloat();
        System.out.print("Nilai kuis      : ");
        float tugas = input13.nextFloat();
        System.out.print("Nilai tugas     : ");
        float kuis = input13.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.1F) + (kuis * 0.1F) + (tugas * 0.2F);

        String message = total < 65 ? "Remidi" : "Tidak remidi";

        System.out.println("Nilai akhir = " + total + " sehingga " + message);
    }
}
