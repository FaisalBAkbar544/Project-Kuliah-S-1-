package Praktikum6;

import java.util.Scanner;

public class soal1 {

    public static int faktorial(int n) {
        if (n == 1) {
            return n;
        } else {
            return n * faktorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        int bil = input.nextInt();

        System.out.println("Faktorial dari " + bil + " adalah " + faktorial(bil));

    }

}
