package jobsheet9;

public class LinearSearch12 {
    public static void main(String[] args) {
        
        int[] arrayInt = {34, 16, 26, 48, 72, 20, 56, 63};
        int key = 20;
        int hasil = 0;

        for (int i = 0; 1 < arrayInt.length;i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }

        System.out.println("Key ada dalam array pada posisi index ke-"+hasil);
    }
}
