import java.util.Scanner;
public class Tugas211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahOrder;

        System.out.print("Masukkan jumlah pesanan: ");
        jumlahOrder = sc.nextInt();
        sc.nextLine();

        String[] menu = new String[10];
        int[] price = new int[10];
        double total = 0;

        for (int i = 0; i < jumlahOrder; i++) {
            System.out.println("Masukkan pesanan anda yang ke-" + (i+1) + ": ");
            menu[i] = sc.nextLine();
            System.out.println("Harga pesanan ke-" + (i+1) + ": ");
            price[i] = sc.nextInt();
            total += price[i];
            sc.nextLine();
        }
        for (int i = 0; i < jumlahOrder; i++) {
            System.out.println("Pesanan anda ke-" + (i+1) + " " + menu[i] + " dengan harga " + " " + price[i]);
        }
        System.out.println("Total harga yang anda pesan berjumlah: " + total);
    }
}
