import java.util.Scanner;
public class Lingkaran13 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int r;
        double phi=3.14, keliling, luas;

        System.out.println("Silahkan masukkan jari-jari lingkaran: ");
        r=input .nextInt();

        keliling= 2*phi*r;
        luas = phi*r*r;

        System.out.println("Keliling: "+keliling);
        System.out.println("Luas: " +luas);

    }
}