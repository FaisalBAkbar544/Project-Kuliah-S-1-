package Praktikum1;

import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, bagi = 0, bil, hasil = 0;
        double average;
        String cek;

        do {

            System.out.println("--------------------");
            System.out.print("Masukkan bilangan : ");
            bil = input.nextInt();

            if (bil > max) {
                max = bil;
            }
            if (bil < min) {
                min = bil;
            }
            bagi++;
            hasil += bil;

            System.out.print("Ingin memasukkan lagi(Y/N)? : ");
            cek = input.next().toUpperCase();

        } while (cek.equalsIgnoreCase("Y"));
        average = hasil / bagi;
        System.out.println("----------------------------");
        System.out.println("Nilai Terbesar : " + max);
        System.out.println("Nilai Terkecil : " + min);
        System.out.println("Nilai Rata-Rata : " + average);
        System.out.println("----------------------------");

    }

}
