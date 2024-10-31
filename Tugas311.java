import java.util.Scanner; 
 
public class Tugas311 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 

        String key;
        System.out.println("Menu makan: 1. Nasi Goreng, 2. Mie Goreng, 3. Roti Bakar, 4. Kentang Goreng");
        System.out.println("Menu minuman: 1. Teh Tarik, 2. Cappucino, 3. Chocolato Ice");
        System.out.print("Masukkan menu yang ingin anda cari: "); 
        key=sc.nextLine(); 

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate ice"}; 
        for (int i = 0; i < menu.length; i++) { 
            if (key.equalsIgnoreCase(menu[i])) { 
                System.out.println("Menu yang anda pilih tersebut ada di urutan ke-" + (i+1)); 
                break; 
            } else if (key != menu[i] && i==(menu.length-1) ) { 
                System.out.println("Menu yang anda cari tidak ada dalam data"); 
            } 
        } 
    } 
} 
 
