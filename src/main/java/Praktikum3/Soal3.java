package Praktikum3;

import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int barisKolom, diagonal = 0, k = 0, l = 0;
        System.out.print("Masukkan panjang baris dan kolom : ");
        barisKolom = input.nextInt();

        int[][] matriks = new int[barisKolom][barisKolom];

        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {

                System.out.print("Angka pada baris-" + (i) + " Kolom-" + (j) + " : ");
                matriks[i][j] = input.nextInt();
            }
            diagonal += matriks[k][l];
            k += 1;
            l += 1;
        }

        System.out.println("Matriks :");
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.print("Jumlah diagonal : " + diagonal);

    }

}
