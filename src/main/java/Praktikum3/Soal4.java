package Praktikum3;

public class Soal4 {

    public static void main(String[] args) {
        int nilai1[][] = {{2, 7, 8}, {1, 3, 9}, {3, 7, 3}};
        int nilai2[][] = {{2, 1, 6}, {3, 9, 8}, {3, 3, 8}};

        //tampil
        System.out.println("Array 1 : ");
        for (int i = 0; i < nilai1.length; i++) {
            for (int j = 0; j < nilai1[i].length; j++) {
                System.out.print(nilai1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("Array 2 : ");
        for (int i = 0; i < nilai2.length; i++) {
            for (int j = 0; j < nilai2[i].length; j++) {
                System.out.print(nilai2[i][j] + " ");
            }
            System.out.println();
        }

        int[][] hasil = new int[20][20];
        for (int i = 0; i < nilai1.length; i++) {
            for (int j = 0; j < nilai2.length; j++) {
                hasil[i][j] = nilai1[i][j] * nilai2[i][j];
            }

        }
        System.out.println();
        System.out.println("Hasil perkalian antara kolom dan baris yang sama : ");
        for (int i = 0; i < nilai2.length; i++) {
            for (int j = 0; j < nilai2[i].length; j++) {
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
