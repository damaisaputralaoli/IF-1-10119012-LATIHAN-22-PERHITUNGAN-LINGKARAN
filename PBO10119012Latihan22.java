
package pbo10119012latihan22;

import java.util.Scanner;

/**
 *
 * @author damai
 * Nama  : Damai Saputra Laoli
 * Kelas : IF-1
 * NIM   : 10119012
 */
public class PBO10119012Latihan22 {

    
    public static void main(String[] args) {
        double diameter, jarijari, luas, keliling;
        final double PHI = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====Perhitungan Lingkaran=====");
        System.out.print("Masukkan nilai diameter lingkaran : ");
        while(true) {
            try {
                diameter = Double.parseDouble(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nilai Diameter Tidak Sesuai\n");
                System.out.print("Masukkan nilai diameter lingkaran : ");
                continue;
            }
        }
        jarijari = diameter /2 ;
        luas = PHI * jarijari * jarijari;
        keliling = PHI * diameter;
        System.out.println();
        System.out.println("======Hasil Perhitungan Lingkaran======");
        System.out.printf("Jari-jari Lingkaran\t\t= %.2f cm%n", jarijari);
        System.out.printf("Luas Lingkaran\t\t\t= %.2f cm%n", luas);
        System.out.printf("Keliling lingkaran\t\t= %.2f cm%n", keliling);
    }
}