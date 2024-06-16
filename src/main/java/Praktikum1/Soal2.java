package Praktikum1;

import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil;
        System.out.println("-------------------");
        System.out.print("Masukkan bilangan : ");
        bil = input.nextInt();
        System.out.println("-------------------");

        for (int i = 0; i < bil; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= bil - i; j++) {
                System.out.print(" *");
            }
            if (i < bil - 1) {
                System.out.println();
            }

        }
        for (int k = 0; k <= bil; k++) {
            for (int j = 0; j < bil - k; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= k; j++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }

    }

}
