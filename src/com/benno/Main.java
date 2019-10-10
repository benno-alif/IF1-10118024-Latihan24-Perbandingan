package com.benno;
import java.util.Scanner;

    /*
        NAMA        : BENNO ALIF ANGGARA
        KELAS       : IF1
        NIM         : 10118024
        Deskripsi   : Melakukan perbandingan dua buah nilai
     */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer bil1, bil2;
        String ulang;

        System.out.println("=====Program Perbandingan Nilai=====");

        do {
            System.out.print("Masukkan Nilai Pertama : ");
            bil1 = scanner.nextInt();

            System.out.print("Masukkan Nilai Kedua : ");
            bil2 = scanner.nextInt();

            hitungPerbandingan(bil1,bil2);

            System.out.print("Ulangi Aktifitas (Ya/Tidak) : ");
            ulang = scanner.next();
            System.out.println();
        } while (ulang.equals("Ya") || ulang.equals("ya"));

    }

    private static void hitungPerbandingan(Integer bil1, Integer bil2) {
        String hasil;
        if (bil1 > bil2){
            hasil = " Lebih Besar dari ";
        }else if (bil1 < bil2){
            hasil = " Lebih kecil dari ";
        }else{
            hasil = " Sama dengan ";
        }

        System.out.println("Hasil : " + bil1 + hasil + bil2);
        System.out.println();
    }
}
