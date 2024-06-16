package Praktikum4;

import java.util.*;

public class Soal4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> nama = new ArrayList<>();
        ArrayList<String> golongan = new ArrayList<>();
        ArrayList<Integer> jam = new ArrayList<>();
        System.out.print("Jumlah Karyawan : ");
        int jumlahKaryawan = input.nextInt();
        input.nextLine();
        for (int i = 0; i < jumlahKaryawan; i++) {
            System.out.println("-------------------------");
            System.out.print("Masukkan nama : ");
            String inputNama = input.nextLine();
            nama.add(inputNama);
            System.out.print("Masukkan golongan (A|B|C|D|E) : ");
            String inputGolongan = input.nextLine().toUpperCase();
            golongan.add(inputGolongan);
            System.out.print("Jumlah jam kerja : ");
            int jamKerja = input.nextInt();
            jam.add(jamKerja);
            input.nextLine();
        }

        System.out.println("---------------------");
        System.out.println("Hasil : ");
        for (int i = 0; i < jumlahKaryawan; i++) {
            gaji(nama.get(i), golongan.get(i), jam.get(i));
        }
    }

    public static void gaji(String nama, String golongan, int jam) {
        int gaji = 0;
        switch (golongan) {
            case "A":
                gaji = 5_000;
                break;
            case "B":
                gaji = 4_000;
                break;
            case "C":
                gaji = 3_000;
                break;
            case "D":
                gaji = 2_000;
                break;
            case "E":
                gaji = 1_000;
                break;
            default:
                System.out.println("Golongan tidak valid");
                return;
        }

        int totalGaji = gaji * jam;
        System.out.println("Total gaji untuk " + nama + " dengan golongan " + golongan + " dengan jam kerja " + jam + " jam adalah: " + totalGaji);
    }
}
