package Praktikum6;

import java.util.Scanner;

public class soal2 {

    public static int fibonnaci(int nilai) {
        if (nilai <= 1) {
            return nilai;
        } else {
            return fibonnaci(nilai - 1) + fibonnaci(nilai - 2);
        }
    }

    public static void tampilkanFibonnaci(int n, int panjang) {
        if (n < panjang) {
            System.out.print(fibonnaci(n) + " ");
            tampilkanFibonnaci(n + 1, panjang);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang Fibonacci : ");
        int panjang = input.nextInt();
        
        System.out.println("\n" + panjang + " Bilangan Fibonacci : ");
        if (panjang <= 0) {
            System.out.println("Tidak ada bilangan Fibonacci");
        } else {
            tampilkanFibonnaci(0, panjang);
            System.out.println(" ");
        }
    }
}
