package Praktikum6;

import java.util.Scanner;
import java.util.Arrays;

public class soal4 {

    public static void inputArray(int[] dataInputan, String inputValues) {
        int[] inputArr = Arrays.stream(inputValues.split("\\s+")).mapToInt(Integer::parseInt).toArray();
        System.arraycopy(inputArr, 0, dataInputan, 0, Math.min(dataInputan.length, inputArr.length));
    }

    public static int minMax(int[] data, int n, int index, boolean ifMax) {
        if (n == data.length) {
            return index;
        }
        if (ifMax) {
            if (data[n] > data[index]) {
                index = n;
            }
        } else {
            if (data[n] < data[index]) {
                index = n;
            }
        }
        return minMax(data, n + 1, index, ifMax);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang array: ");
        int panjangArr = input.nextInt();
        int[] dataInputan = new int[panjangArr];

        System.out.print("Masukkan element array : ");
        String inputArr = input.nextLine();
        inputArr += input.nextLine();

        inputArray(dataInputan, inputArr);

        boolean keluar = false;
        do {

            System.out.println("--------------------------------");
            System.out.println("Pilih operasi:");
            System.out.println("1. Cari Bilangan terbesar");
            System.out.println("2. Cari Bilangan terkecil");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda : ");
            int pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    int maxIndex = minMax(dataInputan, 0, 0, true);
                    System.out.println("Bilangan terbesar dalam array : " + dataInputan[maxIndex] + " (berada di index ke-" + maxIndex + ")");
                    break;
                case 2:
                    int minIndex = minMax(dataInputan, 0, 0, false);
                    System.out.println("Bilangan terkecil dalam array : " + dataInputan[minIndex] + " (berada di index ke-" + minIndex + ")");
                    break;
                case 0:
                    keluar = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (!keluar);

        System.out.println("Terima kasih telah menggunakan program ini!");
    }

}
