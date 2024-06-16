package Praktikum5;

import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahData;

        System.out.println("==========================================");
        System.out.print("Masukkan Jumlah Data : ");
        jumlahData = input.nextInt();
        System.out.println("------------------------------------------");

        int[] dataAngka = new int[jumlahData];
        for (int i = 0; i < dataAngka.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + " : ");
            dataAngka[i] = input.nextInt();
        }
        System.out.println("------------------------------------------");

        int bagiDua = dataAngka.length / 2;
        
        bubbleSort(dataAngka, bagiDua - 1);
        selectionSort(dataAngka, bagiDua, dataAngka.length - 1);

        System.out.println("Hasil Pengurutan :");
        for (int hasil : dataAngka) {
            System.out.print(hasil + " ");
        }

        System.out.println("\n==========================================");
    }

    public static void bubbleSort(int[] dataMasuk, int akhir) {
        for (int i = 0; i < akhir; i++) {
            for (int j = 0; j < akhir - i; j++) {
                if (dataMasuk[j] > dataMasuk[j + 1]) {
                    int temp = dataMasuk[j];
                    dataMasuk[j] = dataMasuk[j + 1];
                    dataMasuk[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] dataMasuk, int awal, int akhir) {
        for (int i = awal; i < akhir; i++) {
            int maxIndex = i;
            for (int j = i + 1; j <= akhir; j++) {
                if (dataMasuk[j] > dataMasuk[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = dataMasuk[maxIndex];
            dataMasuk[maxIndex] = dataMasuk[i];
            dataMasuk[i] = temp;
        }
    }
}
