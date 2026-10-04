package com.mycompany.tugaspbo3;

import java.util.Scanner;

public class TugasPBO3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean programBerjalan = true;

        while (programBerjalan) {
            System.out.println("\n=== KALKULATOR VERSI ALTERNATIF ===");
            System.out.println("1. Tambah (+)");
            System.out.println("2. Kurang (-)");
            System.out.println("3. Kali (*)");
            System.out.println("4. Bagi (/)");
            System.out.println("0. Keluar");
            System.out.print("Silakan pilih menu (0-4): ");

            int pilihan = scanner.nextInt();

            if (pilihan == 0) {
                System.out.println("Program dimatikan. Terima kasih!");
                programBerjalan = false;

            } else if (pilihan >= 1 && pilihan <= 4) {
                System.out.print("Masukkan angka pertama: ");
                double a = scanner.nextDouble();

                System.out.print("Masukkan angka kedua: ");
                double b = scanner.nextDouble();

                if (pilihan == 1) {
                    System.out.println("Hasil penjumlahannya adalah: " + (a + b));

                } else if (pilihan == 2) {
                    System.out.println("Hasil pengurangannya adalah: " + (a - b));

                } else if (pilihan == 3) {
                    System.out.println("Hasil perkaliannya adalah: " + (a * b));

                } else if (pilihan == 4) {
                    if (b != 0) {
                        System.out.println("Hasil pembagiannya adalah: " + (a / b));
                    } else {
                        System.out.println("Peringatan: Tidak bisa membagi dengan angka nol!");
                    }
                }

            } else {
                System.out.println("Pilihan salah! Masukkan angka yang sesuai menu.");
            }
        }

        scanner.close();
    }
}