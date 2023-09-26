import java.util.Scanner;

/**
 * PemilihanPercobaan113
 */
public class PemilihanPercobaan113 {

    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        System.out.print("masukkan angka: ");
        String hasil;
        int angka = input13.nextInt();

        hasil = (angka % 2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";
            System.out.println("Angka " + angka + " adalah " + hasil);
        }
}
