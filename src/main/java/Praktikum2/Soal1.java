package Praktikum2;

import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {
        System.out.println("=============================");
        System.out.println("     Program FPB dan KPK    ");
        System.out.println("-----------------------------");
        input();
    }

    public static void input() {
        Scanner input = new Scanner(System.in);
        int angka1, angka2;
        System.out.print("Masukkan angka pertama : ");
        angka1 = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan angka kedua   : ");
        angka2 = input.nextInt();
        input.nextLine();

        panggilFpb(angka1, angka2);
        panggilKpk(angka1, angka2);

    }

    public static int hitungFPB(int angka1, int angka2) {
        int c;
        do {
            c = angka1 % angka2;
            angka1 = angka2;
            angka2 = c;
        } while (angka2 != 0);

        return angka1;
    }

    public static int hitungKPK(int angka1, int angka2) {
        int hasil = angka1 * angka2;
        int fpb = hitungFPB(angka1, angka2);
        int kpk = hasil / fpb;
        return kpk;
    }

    public static void panggilFpb(int nilai1, int nilai2) {
        int fpb = hitungFPB(nilai1, nilai2);
        System.out.println("fpb dari " + nilai1 + " dan " + nilai2 + " : " + fpb);
    }

    public static void panggilKpk(int nilai1, int nilai2) {
        int kpk = hitungKPK(nilai1, nilai2);
        System.out.println("kpk dari " + nilai1 + " dan " + nilai2 + " : " + kpk);
    }
}
