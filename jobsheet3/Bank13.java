import java.util.Scanner;

public class Bank13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jml_tabungan_awal, lama_menabung;
        double prosentage_bunga = 0.05, bunga, jml_tabungan_akhir;

        System.out.println("Silahkan masukkan jumlah tabungan awal anda: ");
        jml_tabungan_awal = input.nextInt();
        System.out.println("Masukkan lama anda menabung: ");
        lama_menabung = input.nextInt();

        bunga = lama_menabung*jml_tabungan_awal;
        jml_tabungan_akhir = bunga+jml_tabungan_awal;

        System.out.println("Jumlah tabungan akhir anda adalah " + jml_tabungan_akhir);

    }
       
}
