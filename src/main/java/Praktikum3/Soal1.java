package Praktikum3;

import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjangArray, kelipatan, sum = 0;
        System.out.print("Masukkan kelipatan : ");
        kelipatan = input.nextInt();
        System.out.print("Masukkan panjang Array : ");
        panjangArray = input.nextInt();

        int[] nilaiArray = new int[panjangArray];
        for (int i = 0; i < nilaiArray.length; i++) {
            nilaiArray[i] = (i + 1) * kelipatan;
            System.out.println("Kelipatan " + kelipatan + " Ke-" + (i + 1) + " : " + nilaiArray[i]);
            sum += nilaiArray[i];

        }
        System.out.println("Jumlah isi Array : " + sum);

    }
}
