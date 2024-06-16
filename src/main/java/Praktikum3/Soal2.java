package Praktikum3;

import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjangArray, indeksMin = 0, min = Integer.MAX_VALUE;
        System.out.print("Masukkan panjang Array : ");
        panjangArray = input.nextInt();

        int[] nilaiArr = new int[panjangArray];
        for (int i = 0; i < nilaiArr.length; i++) {
            System.out.print("Angka indeks ke-" + i + " : ");
            nilaiArr[i] = input.nextInt();

            if (nilaiArr[i] < min) {
                min = nilaiArr[i];
                indeksMin = i;
            }

        }
        System.out.println("Nilai minimum ada pada indeks ke-" + indeksMin + " dengan nilai " + min);
    }

}
