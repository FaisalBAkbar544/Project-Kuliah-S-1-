package Praktikum4;

import java.util.*;

public class Soal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> data = new ArrayList<>();
        int pilih;
        do {
            Menu();
            pilih = input.nextInt();
            input.nextLine();
            switch (pilih) {
                case 1:
                    tampilkanData(data);
                    break;
                case 2:
                    tambahkanData(data, input);
                    break;
                case 3:
                    editData(data, input);
                    break;
                case 4:
                    hapusData(data, input);

                    break;
                case 5:
                    System.out.println("Goodbye, anda telah keluar");
                    break;
                default:
                    System.out.println("Masukkan menu yang benar");

            };

        } while (pilih != 5);

    }

    private static void Menu() {

        System.out.println("--------------------------------------------");
        System.out.println("Menu\n1.Tampilkan data\n2.Tambahkan data\n3.Edit data\n4.Hapus data\n5.Keluar");
        System.out.print("Pilih :");

    }

    public static void tampilkanData(ArrayList<String> data) {

        if (data.isEmpty()) {
            System.out.println("Nilai tidak ada");
        } else {
            System.out.println(data);
        }

    }

    public static void tambahkanData(ArrayList<String> data, Scanner input) {
        String data2;
        System.out.print("Masukkan data : ");
        data2 = input.nextLine();
        data.add(data2);
        System.out.println("Data ditambahkan");
    }

    public static void editData(ArrayList<String> data, Scanner input) {

        System.out.print("Masukkan index yang mau diubah : ");
        int ubahIndex = input.nextInt();
        System.out.print("Masukkan nilai yang diubah : ");
        input.nextLine();
        String ubahList = input.nextLine();
        data.set(ubahIndex, ubahList);

    }

    public static void hapusData(ArrayList<String> data, Scanner input) {
        int index;
        System.out.print("Masukkan index : ");
        index = input.nextInt();
        if (index >= 0 && index < data.size()) {
            data.remove(index);
            System.out.println("Nomor dihapus");
        } else {
            System.out.println("Index tidak ada");
        }

    }

}
