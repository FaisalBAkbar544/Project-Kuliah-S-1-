package Praktikum1;

import java.util.Scanner;

public class Soal4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int awal, akhir;

        System.out.println("-----------------------");
        System.out.println("Program Cek Angka");
        System.out.println("-----------------------");
        System.out.print("Masukkan angka pertama : ");
        awal = input.nextInt();
        System.out.print("Masukkan angka terakhir : ");
        akhir = input.nextInt();

        while (awal <= akhir) {
            System.out.print(awal + " ");

            if (awal < 0) {
                System.out.print(" Negatif ");
            }
            if (awal % 2 == 0) {
                System.out.print("Genap ");
            } else {
                System.out.print("Ganjil");
            }
            System.out.println(" ");
            awal++;
        }
    }

}
