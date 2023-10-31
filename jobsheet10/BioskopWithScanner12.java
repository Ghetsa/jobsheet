package jobsheet10;
import java.util.Scanner;

public class BioskopWithScanner12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("-----------------------------");
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih Menu: ");

            int menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    nama = sc.nextLine();

                    System.out.print("Masukkan Baris: ");
                    baris = sc.nextInt();

                    System.out.print("Masukkan Kolom: ");
                    kolom = sc.nextInt();

                    if (baris > penonton.length || kolom > penonton[0].length || baris < 1 || kolom < 1) {
                        System.out.println("Nomor baris atau kolom kursi tidak tersedia!");
                    } else if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah terisi, silakan pilih kursi lain.");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil ditambahkan.");
                    }
                    sc.nextLine(); 
                    break;
                    

                case 2:
                    System.out.println("Daftar Penonton:");
                    for (String[] barisPenonton : penonton) {
                        for (String namaPenonton : barisPenonton) {
                            if (namaPenonton == null) {
                                System.out.print("****\t");
                            } else {
                                System.out.print(namaPenonton+"\t");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Thanks, Anda keluar dari program!");
                    return;

                default:
                    System.out.println("Menu tidak valid.");
            }

        }
    }
}
