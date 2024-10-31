import java.util.Scanner;

public class SearchNilai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlhMhs = sc.nextInt();

        int[] arrNilai = new int[jmlhMhs];
        int key;
        int hasil = 0;

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");
        key = sc.nextInt();
        boolean ada = true;
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                ada = true;
                break;
            } else if (key != arrNilai[i]) {
                ada = false;
            }
        }
        if (ada) {
        System.out.println();
        System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil+1));
        System.out.println();
        } else {
        System.out.println();
        System.out.println("Nilai yang dicari tidak ditemukan");
        System.out.println();
        }
    }
}
