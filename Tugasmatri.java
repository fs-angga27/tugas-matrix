import java.util.Scanner;

public class Tugasmatri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Baris: ");
        int baris = input.nextInt();
        System.out.println("Masukkan Jumlah Kolom: ");
        int kolom = input.nextInt();

        int Matrix[][] = new int[baris][kolom];

        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                System.out.println("Masukkan Nilai Matrix Baris " + i + " Kolom " + j + " : ");
                Matrix[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                System.out.print(Matrix[i][j] + " ,");
            }
            System.out.println();
        }

        input.close();
    }
}
