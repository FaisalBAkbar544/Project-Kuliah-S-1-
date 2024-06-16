package Praktikum4;

import java.util.*;

public class Soal3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> dataAngka = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan data integer ke-" + (i + 1) + " : ");
            int data = input.nextInt();
            dataAngka.add(data);
        }

        System.out.print("Cek jumlah angka pada list : ");
        int cek = input.nextInt();
        int jumlahData = Collections.frequency(dataAngka, cek);
        
        System.out.println("Jumlah bilangan " + cek + " yang ada di dalam data sebanyak " + jumlahData + " buah ");
    }
}
