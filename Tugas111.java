import java.util.Scanner;

public class Tugas111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();
        
        int[] nilaiMhs = new int[jumlahMhs];
        int total = 0;
        double rata2 = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
        } rata2 = total/jumlahMhs;
        double tertinggi = 0, terendah = 100;
        for (int i=0; i<nilaiMhs.length; i++) { 
            if (nilaiMhs[i] > tertinggi) { 
                tertinggi = nilaiMhs[i]; 
            } 
            if (nilaiMhs[i] < terendah) { 
                terendah = nilaiMhs[i]; 
            }            
    }
    for (int i=0; i<nilaiMhs.length; i++) { 
        System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah: " + nilaiMhs[i]); 
    } System.out.println("Nilai rata rata = " + rata2); 
    System.out.println("Nilai tertinggi = " + tertinggi); 
    System.out.println("Nilai terendah = " + terendah); 
}
}
