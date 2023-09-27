import java.util.Scanner;

/**
 * PemilihanPercobaan112
 */
public class PemilihanPercobaan112 {

    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
        System.out.print("masukkan angka: ");
        String hasil;
        int angka = input12.nextInt();

        hasil = (angka % 2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";
            System.out.println("Angka " + angka + " adalah " + hasil);
        }
}
