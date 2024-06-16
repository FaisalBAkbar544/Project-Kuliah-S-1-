package Praktikum2;

import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {
        input();
    }

    public static String fibon(int banyakAngka) {
        int angkaAwal = 0, angkaKedua = 1, fibon1;
        String fibon = "";
        for (int a = angkaAwal; a < banyakAngka; a++) {
            fibon += (angkaAwal + " ");
            fibon1 = angkaAwal + angkaKedua;
            angkaAwal = angkaKedua;
            angkaKedua = fibon1;
        }
        return fibon;
    }

    public static void input() {
        int totalAngka;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas atas bilangan Fibonnaci : ");
        totalAngka = input.nextInt();
        System.out.print(fibon(totalAngka));
    }

}
