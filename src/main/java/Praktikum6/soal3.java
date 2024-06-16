package Praktikum6;

import java.util.Scanner;

public class soal3 {

    public static void printPola(int n, int spasi) {
        if (n > 0) {

            printPola(n - 1, spasi + 1);
            printBintang(n);
            printSpasi(spasi);
            System.out.println();

        }
    }

    public static void printBintang(int n) {
        if (n > 0) {
            System.out.print("* ");
            printBintang(n - 1);
        }
    }

    public static void printSpasi(int n) {
        if (n > 0) {
            System.out.print(" ");
            printSpasi(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga : ");
        int nilai = input.nextInt();
        System.out.println("\nOutput : \n");
        if (nilai >= 1) {
            printPola(nilai, 0);
        } else {
            System.out.println("Tidak ada tampilan karena tinggi : " + nilai + "!");
        }
    }
}
