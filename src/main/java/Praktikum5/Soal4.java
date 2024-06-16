package Praktikum5;

import java.util.Scanner;

public class Soal4 {

    public static String[] bubbleSort(String[] arrayData) {
        String temp;
        for (int j = 0; j < arrayData.length - 1; j++) {
            for (int i = j + 1; i < arrayData.length; i++) {
                if (arrayData[j].compareTo(arrayData[i]) > 0) {
                    temp = arrayData[j];
                    arrayData[j] = arrayData[i];
                    arrayData[i] = temp;
                }
            }
        }
        return arrayData;
    }

    public static int sequentialSearch(String[] arrayData, String cari) {
        for (int i = 0; i < arrayData.length; i++) {
            if (cari.equals(arrayData[i])) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dataString, cariData;
        int index;

        System.out.println("===========================================");
        System.out.println("Masukan : ");
        dataString = input.nextLine().toUpperCase();

        System.out.print("\nMasukan angka/huruf yang dicari : ");
        cariData = input.nextLine();
        String[] arrayData = dataString.split("\\s+");
        System.out.println("-------------------------------------------");
        bubbleSort(arrayData);
        System.out.println("Huruf setelah disorting : ");
        for (String data : arrayData) {
            System.out.print(data + " ");
        }
        System.out.println("\n");

        index = sequentialSearch(arrayData, cariData);
        if (index == -1) {
            System.out.println(cariData + " tidak ditemukan dalam array.");
        } else {
            System.out.println(cariData + " ditemukan pada indexs-" + index + " dalam array.");
        }

        System.out.println("===========================================");
    }
}
