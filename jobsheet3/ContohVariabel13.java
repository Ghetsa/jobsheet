/**
 * ContohVariabel13
 */
public class ContohVariabel13 {

    public static void main(String[] args) {
        String hobiSaya = "Bermain petak umpet";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte umurSekarang = 17;
        double ipk = 3.99, tinggi = 1.78;

        System.out.println(hobiSaya);
        System.out.println("Apakah saya pandai? " + isPandai);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini: " + umurSekarang);
        System.out.println(String.format("Saya ber-IPK %s, dengan tinggi badan %s", ipk, tinggi));
    }
}