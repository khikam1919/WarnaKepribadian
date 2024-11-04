/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si.pkg23176014.latihan29.warnakepribadian;

/**
 *
 * @author User
 * NAMA     : Muhammad Nur Khikam
 * KELAS    : Sistem InformasiS
 * NIM      : 23176014
 * Deskripsi Program : Program ini berisi tentang program untuk melihat kepribadian seseorang dari warna
 */
import java.util.Scanner;

public class SI23176014Latihan29WarnaKepribadian {

    // ANSI escape codes untuk warna
    public static final String RESET = "\u001B[0m";
    public static final String MERAH = "\u001B[31m"; // Merah
    public static final String KUNING = "\u001B[33m"; // Kuning
    public static final String HIJAU = "\u001B[32m"; // Hijau
    public static final String BIRU = "\u001B[34m"; // Biru
    public static final String UNGU = "\u001B[35m"; // Ungu

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("PILIH WARNA FAVORITMU:");
        System.out.println(MERAH + "1. Merah" + RESET);
        System.out.println(KUNING + "2. Kuning" + RESET);
        System.out.println(HIJAU + "3. Hijau" + RESET);
        System.out.println(BIRU + "4. Biru" + RESET);
        System.out.println(UNGU + "5. Ungu" + RESET);
        System.out.print("Masukkan nomor pilihan Anda (1-5): ");
        
        int pilihan = scanner.nextInt();

        System.out.print("NAMA KAMU: ");
        scanner.nextLine();  // Mengonsumsi newline
        String nama = scanner.nextLine().trim();

        System.out.println("\n==HASIL TEST KEPRIBADIAN " + nama.toUpperCase() + "===\n");

        switch (pilihan) {
            case 1:
                System.out.println(MERAH + "Warna Favoritmu adalah MERAH." + RESET);
                System.out.println("1. Periang");
                System.out.println("2. Pemberani");
                System.out.println("3. Berani mengambil risiko dalam setiap langkah");
                System.out.println("4. Menyukai tantangan");
                System.out.println("5. Kurang sabar");
                System.out.println("6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya sulit untuk dikontrol");
                System.out.println("7. Memiliki energi kehangatan dan cinta.");
                break;
            case 2:
                System.out.println(KUNING + "Warna Favoritmu adalah KUNING." + RESET);
                System.out.println("1. Optimis");
                System.out.println("2. Suka bergaul");
                System.out.println("3. Periang");
                System.out.println("4. Senang menolong");
                System.out.println("5. Lincah dan aktif");
                System.out.println("6. Tidak suka meremehkan kekurangan orang lain");
                System.out.println("7. Loyal");
                System.out.println("8. Hangat");
                System.out.println("9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil");
                System.out.println("10. Cenderung penakut");
                break;
            case 3:
                System.out.println(HIJAU + "Warna Favoritmu adalah HIJAU." + RESET);
                System.out.println("1. Romantis");
                System.out.println("2. Menyukai hal yang berbau alami dan keindahan");
                System.out.println("3. Teguh pada prinsip");
                System.out.println("4. Menginginkan kesempurnaan");
                System.out.println("5. Mudah cemburu");
                System.out.println("6. Mudah merasa iri");
                System.out.println("7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
                break;
            case 4:
                System.out.println(BIRU + "Warna Favoritmu adalah BIRU." + RESET);
                System.out.println("1. Menyenangkan");
                System.out.println("2. Bijaksana");
                System.out.println("3. Pembawaan diri tenang saat menghadapi masalah");
                System.out.println("4. Dinamis");
                System.out.println("5. Senang berbagi");
                System.out.println("6. Bersahabat");
                System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang");
                System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.");
                break;
            case 5:
                System.out.println(UNGU + "Warna Favoritmu adalah UNGU." + RESET);
                System.out.println("1. Optimis");
                System.out.println("2. Tidak pernah ragu");
                System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat");
                System.out.println("4. Memiliki ambisi yang besar");
                System.out.println("5. Memiliki empati yang besar");
                System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaannya");
                System.out.println("7. Terkadang bersikap keras kepala dan angkuh");
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan pilih antara 1-5.");
                break;
        }

        scanner.close();
    }
}
