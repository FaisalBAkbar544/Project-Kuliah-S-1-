package Praktikum2;

import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        menu();
    }

    public static void menu() {
        Scanner input = new Scanner(System.in);
        int menu, panjang = 0, lebar = 0, tinggi = 0;
        boolean cek = false;
        do {
            System.out.println("Menu : ");
            System.out.println("1. Input nilai panjang, lebar, tinggi");
            System.out.println("2. Hitung luas permukaan dan volume balok");
            System.out.println("3. Hitung luas permukaan dan volume prisma segitiga");
            System.out.println("4. Hitung luas permukaan dan volume limas segi empat");
            System.out.println("5. Keluar");
            System.out.print("Masukkan Menu : ");
            menu = input.nextInt();
            System.out.println("--------------------------");

            if (menu == 1) {
                System.out.print("Masukkan panjang : ");
                panjang = input.nextInt();
                System.out.print("Masukkan lebar   : ");
                lebar = input.nextInt();
                System.out.print("Masukkan tinggi  : ");
                tinggi = input.nextInt();
                cek = true;
            } else if (menu == 2) {
                if (cek) {
                    System.out.println("Permukaan Balok : " + permukaanBalok(panjang, tinggi, lebar));
                    System.out.println("Volume Balok    : " + volumeBalok(panjang, tinggi, lebar));
                }
            } else if (menu == 3) {
                if (cek) {
                    System.out.println("Permukaan Prisma: " + permukaanPrisma(panjang, tinggi, lebar));
                    System.out.println("Volume Prisma   : " + volumePrisma(panjang, tinggi, lebar));
                }
            } else if (menu == 4) {
                if (cek) {
                    System.out.println("Permukaan Limas : " + permukaanLimas(panjang, tinggi, lebar));
                    System.out.println("Volume Limas    : " + volumeLimas(panjang, tinggi, lebar));
                }
            } else if (menu == 5) {
                break;
            } else {
                System.out.println("Menu tidak valid");
            }

        } while (menu != 5);
        System.out.println(">> TerimaKasih <<");

    }

    public static double permukaanBalok(int p, int t, int l) {
        return 2 * (p * l + l * t + p * t);
    }

    public static double volumeBalok(int p, int t, int l) {
        return p * l * t;
    }

    public static double permukaanPrisma(int p, int t, int l) {
        double luasAlas = (0.5) * p * l;
        double luasSisi = p * t;
        double luasPermukaan = 2 * luasAlas + 2 * luasSisi;
        return luasPermukaan;
    }

    public static double volumePrisma(int p, int t, int l) {
        double luasAlas = (0.5) * p * l;
        double volumePrisma = luasAlas * t;
        return volumePrisma;

    }

    public static double permukaanLimas(double p, double t, double l) {
        double luasAlas = p * l;
        double luasSisiTegak = 2 * (p * Math.sqrt(Math.pow(l / 2, 2) + Math.pow(t, 2)))
                + 2 * (l * Math.sqrt(Math.pow(p / 2, 2) + Math.pow(t, 2)));
        double luasPermukaan = luasAlas + luasSisiTegak;
        return luasPermukaan;
    }

    public static double volumeLimas(int p, int t, int l) {
        return (p * l * t) / 3;
    }

}
