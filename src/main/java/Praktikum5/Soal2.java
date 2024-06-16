package Praktikum5;

import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputData, noSpace;
        System.out.println("===========================================");
        System.out.print("Inputkan Data : ");
        inputData = in.nextLine();
        noSpace = inputData.replaceAll("\\s+", "");
        
        char[] arrayChar = noSpace.toCharArray();
        for (int i = (arrayChar.length - 1); i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayChar[j] > arrayChar[(j + 1)]) {
                    char temp = arrayChar[(j + 1)];
                    arrayChar[(j + 1)] = arrayChar[j];
                    arrayChar[j] = temp;
                }
            }
        }

        System.out.println("-------------------------------------------");
        System.out.println("Output Setelah dilakukan Sorting :");
        for (char hasil : arrayChar) {
            System.out.print(hasil);
        }
        System.out.println("\n===========================================");
    }

}
