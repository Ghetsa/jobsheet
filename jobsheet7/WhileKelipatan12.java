import java.util.Scanner;

public class WhileKelipatan12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kelipatan, jumlah = 0, counter = 0;

        System.out.print("Silahkan masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan.nextInt();

        int i = 1; // Inisialisasi luar perulangan
        while (i <= 50) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
            i++;
        }

        double rataRata = (double) jumlah / counter; // Menghitung rata-rata

        System.out.printf("Banyak bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("Rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %.2f\n", kelipatan, rataRata);
    }
}
