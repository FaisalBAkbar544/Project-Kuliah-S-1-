package Praktikum4;

import java.util.*;

public class Soal2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> nilaiMahasiswa = new ArrayList<>();
        ArrayList<String> namaMahasiswa = new ArrayList<>();
        ArrayList<Double> rataRata = new ArrayList<>();

        System.out.print("Jumlah mahasiswa : ");
        int jumlahMahasiswa = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            String nama = input.nextLine();
            namaMahasiswa.add(nama);

            int totalNilai = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print("Nilai mata kuliah ke-" + (j + 1) + " : ");
                int nilai = input.nextInt();
                nilaiMahasiswa.add(nilai);
                totalNilai += nilai;
            }
            input.nextLine(); 
            double rata = (double) totalNilai / 3;
            rataRata.add(rata);
        }

     
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("| Nama\t\t| Matkul1\t| Matkul2\t| Matkul3\t| Rata-rata |");

        
        System.out.println("-----------------------------------------------------------------------------");

        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.printf("| %-10s\t| ", namaMahasiswa.get(i));
            for (int j = 0; j < 3; j++) {
                int index = i * 3 + j;
                System.out.printf("%-8d\t| ", nilaiMahasiswa.get(index));
            }
            System.out.printf("%.2f\t |\n", rataRata.get(i));
        }

        
        System.out.println("------------------------------------------------------------------------------");
    }
}
