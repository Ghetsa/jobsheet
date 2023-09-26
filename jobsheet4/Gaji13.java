import java.util.Scanner;

public class Gaji13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlMasuk, jmlTdkMasuk, TotGaji;
        int gaji, potGaji;

        System.out.println("Masukkan Besaran Gaji Harian Anda: ");
        gaji=input.nextInt();
        System.out.println("Masukkan Besaran Potongan Gaji Anda: ");
        potGaji=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda: ");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda: ");
        jmlTdkMasuk=input.nextInt();

        TotGaji= (jmlMasuk*gaji)-(jmlTdkMasuk*potGaji);

        System.out.println("gaji yang anda terima sebesar: " + TotGaji);

    }
}
