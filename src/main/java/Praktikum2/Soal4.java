package Praktikum2;

import java.util.Scanner;

public class Soal4 {

    public static void input() {
        Scanner input = new Scanner(System.in);
        int tahun;
        String ulang;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Masukkan tahun : ");
            tahun = scan.nextInt();
            if (cek(tahun)) {
                System.out.println("Tahun " + tahun + " adalah tahun kabisat");
            } else {
                System.out.println("Tahun " + tahun + " bukan merupakan tahun kabisat");
            }

            System.out.println("-------------------------------------");
            System.out.print("Ingin memasukkan lagi(Y/N)? : ");
            ulang = input.next();
        } while (ulang.equalsIgnoreCase("Y"));
        System.out.println(" >> Terimakasih << ");

    }

    public static boolean cek(int tahun) {

        if (tahun % 400 == 0) {
            return true;
        } else if (tahun % 100 == 0) {
            return false;
        } else if (tahun % 4 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("     Program Cek Tahun Kabisat        ");
        System.out.println("-------------------------------------");
        input();
        System.out.println("-------------------------------------");
    }

}

//Berikut adalah ringkasan cara menentukan apakah suatu tahun termasuk tahun kabisat:
//Jika angka tahun habis dibagi 400, maka tahun tersebut pasti merupakan tahun kabisat
//Jika angka tahun tidak habis dibagi 400 tetapi habis dibagi 100, maka tahun tersebut bukan merupakan tahun kabisat.
//Jika angka tahun tidak habis dibagi 400, tidak habis dibagi 100, tetapi habis dibagi 4, maka tahun tersebut merupakan tahun kabisat.
//Jika angka tahun tidak habis dibagi 400, tidak habis dibagi 100, dan tidak habis dibagi 4, maka tahun tersebut bukan merupakan tahun kabisat.
