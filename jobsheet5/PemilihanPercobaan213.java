import java.util.Scanner;

public class PemilihanPercobaan213 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        String message;

        System.out.print("Nilai uas       : ");
        float uas = input13.nextFloat();
        System.out.print("Nilai uts       : ");
        float uts = input13.nextFloat();
        System.out.print("Nilai kuis      : ");
        float tugas = input13.nextFloat();
        System.out.print("Nilai tugas     : ");
        float kuis = input13.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        if (total > 80 && total <= 100) {
            message="Anda mendapatkan nilai A";
        } else if (total > 73 && total <= 80) {
            message="Anda mendapatkan nilai B+" ;
        } else if (total > 65 && total <= 73) {
            message="Anda mendapatkan nilai B" ;
        } else if (total > 60 && total <= 65) {
            message="Anda mendapatkan nilai C+" ;
        } else if (total > 50 && total <= 60) {
            message="Anda mendapatkan nilai C" ;
        } else if (total > 39 && total <= 50) {
            message="Anda mendapatkan nilai D" ;
        } else if (total >= 0 && total <= 39) {
            message="Anda mendapatkan nilai E" ;
        } else {
            message="Nilai yang anda masukkan tidak valid" ;
        }
        
        String hasil = total < 65 ? "Remidi" : "Tidak remidi";

        
        if (total >= 0 && total <= 100) {
        System.out.println("Nilai akhir = " + total + " sehingga " + message + ", Maka " + hasil);
        } else{
        System.out.println("Inputan yang anda masukkan salah");
        } 
    }
}
