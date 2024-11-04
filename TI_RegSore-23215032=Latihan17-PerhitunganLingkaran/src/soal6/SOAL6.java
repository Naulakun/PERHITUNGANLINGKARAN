/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal6;

/**
 *
 * @author
 * NAMA         : AYIP NANDANG MAULANA
 * NIM          : 23215032
 * KELAS        : PBO 1 REG.SORE
 * DESKRIPSI    : PERHITUNGAN LINGKARAN
 */
import java.util.Scanner;

public class SOAL6 {
    public static void main(String[] args) {
        // Membuat scanner untuk input dari user
        Scanner input = new Scanner(System.in);

        // Meminta user memasukkan diameter lingkaran
        System.out.print("Masukkan diameter lingkaran : ");
        double diameter = input.nextDouble();

        // Memeriksa apakah diameter sesuai dengan batas yang ditentukan
        if (diameter < 1 || diameter > 1000) {
            System.out.println("Nilai diameter tidak sesuai");
        } else {
            // Menghitung jari-jari, luas, dan keliling lingkaran
            double jariJari = diameter / 2;
            double luas = Math.PI * Math.pow(jariJari, 2);
            double keliling = Math.PI * diameter;

            // Menampilkan hasil perhitungan
            System.out.printf("Jari-jari lingkaran: %.0f\n  " ,jariJari );
            System.out.printf("Luas lingkaran: %.2f\n  ",luas);
            System.out.printf("Keliling lingkaran: %.2f\n  ",keliling);
        }
        // Menutup scanner
        input.close();
    }
}
