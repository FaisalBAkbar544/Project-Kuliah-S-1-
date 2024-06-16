package Praktikum1;

import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputA;
        boolean cek = true;
        System.out.println("- Tabel Perkalian -");
        System.out.print("Perkalian : ");
        inputA = input.nextInt();

        do {
            if (inputA > 0) {
                cek = false;

                //garis
                for (int i = 0; i <= inputA; i++) {
                    System.out.print("------------");
                }

                System.out.println("");
                System.out.print("X\t|");
                for (int i = 1; i <= inputA; i++) {
                    System.out.print("\t" + i);
                }

                //garis
                System.out.println("");
                for (int i = 0; i <= inputA; i++) {
                    System.out.print("------------");
                }

                System.out.println("");
                for (int i = 1; i <= inputA; i++) {
                    System.out.print(i + " \t | ");
                    for (int j = 1; j <= inputA; j++) {
                        System.out.print("\t" + i * j);
                    }
                    System.out.println(" ");
                }

            } else {
                System.out.println("-------------------");
                System.out.println("Input tidak ada");
                System.out.println("-------------------");

            }
        } while (cek);

    }
}
