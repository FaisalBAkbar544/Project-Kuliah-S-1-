package Praktikum5;

import java.util.Scanner;

public class Soal3 {

    public static int[] arrayAngka(String stringAngka) {
        String[] arrayStringAngka = stringAngka.split("\\s+");
        int[] arrayAngka = new int[arrayStringAngka.length];
        for (int i = 0; i < arrayAngka.length; i++) {
            arrayAngka[i] = Integer.parseInt(arrayStringAngka[i]);
        }
        return arrayAngka;
    }

    public static int[] selectionSort(int[] arrayData) {
        for (int i = 0; i < arrayData.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arrayData.length; j++) {
                if (arrayData[j] < arrayData[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arrayData[minIndex];
            arrayData[minIndex] = arrayData[i];
            arrayData[i] = temp;
        }
        return arrayData;
    }

    public static int binarySearch(int[] arrayAngka, int cari) {
        int batasAtas = 0, batasBawah = arrayAngka.length - 1;
        while (batasAtas <= batasBawah) {
            int mean = batasAtas + (batasBawah - batasAtas) / 2;
            if (arrayAngka[mean] == cari) {
                return mean;
            }
            if (arrayAngka[mean] < cari) {
                batasAtas = mean + 1;
            } else {
                batasBawah = mean - 1;
            }
          
        }
        return -1; // Jika tidak ditemukan
    }

    public static boolean cekInput(String inputAngka) {
        return inputAngka.matches("[0-9\\s]+") && !inputAngka.matches(".*[^0-9\\s].*");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputAngka;
        int cariAngka;

        System.out.println("===========================================");
        System.out.println("Masukkan angka-angka: ");
        inputAngka = in.nextLine();
        System.out.println("-------------------------------------------");

        if (cekInput(inputAngka)) {
            System.out.print("Angka yang ingin dicari indexnya: ");
            if (in.hasNextInt()) {
                cariAngka = Integer.parseInt(in.nextLine());
                int[] arrayAngka = arrayAngka(inputAngka);
                System.out.println("Angka sebelum diurutkan : ");
                for (int angka : arrayAngka) {
                    System.out.print(angka + " ");
                }
                System.out.println("\nAngka setelah diurutkan : ");
                arrayAngka = selectionSort(arrayAngka);
                for (int angka : arrayAngka) {
                    System.out.print(angka + " ");
                }
                System.out.println("");

                int index = binarySearch(arrayAngka, cariAngka);
                if (index != -1) {
                    System.out.println("Angka " + cariAngka + " yang Anda cari berada di index ke - " + index);
                } else {
                    System.out.println("Angka " + cariAngka + " tidak ditemukan.");
                }
            } else {
                System.out.println("Error! Masukkan hanya angka.");
            }
        } else {
            System.out.println("Error! Masukkan hanya angka dan spasi.");
        }

        System.out.println("===========================================");
    }
}
