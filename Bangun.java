package bangun.java;

import java.util.Scanner;
public class Bangun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sisi, pan, leb, alas, tinggi, luas, jari, phi=3.14;
        int pil;
        System.out.println("-----------------------------------");
        System.out.println("|PROGRAM MENGHITUNG BANGUN DATAR  |");
        System.out.println("-----------------------------------");
        System.out.println("|1. Persegi                       |");
        System.out.println("|2. Persegi Panjang               |");
        System.out.println("|3. Segitiga                      |");
        System.out.println("|4. Lingkaran                     |");
        System.out.println("-----------------------------------");
        System.out.println("Masukkan Pilihan Anda (1/2/3/4)    ");
        pil = input.nextInt();
        switch(pil) {
            case 1 -> { 
                System.out.println("MENGHITUNG LUAS PERSEGI");
                System.out.println("-----------------------");
                System.out.println("Masukkan Sisi Persegi");
                sisi = input.nextDouble();
                luas = sisi * sisi;
                System.out.println("Luas Persegi Adalah : "+luas);
            }
                
            case 2 -> {
                System.out.println("MENGHITUNG LUAS PERSEGI PANJANG");
                System.out.println("-------------------------------");
                System.out.println("Masukkan Panjang Persegi");
                pan = input.nextDouble();
                System.out.println("Masukkan Lebar Persegi");
                leb = input.nextDouble();
                luas = pan * leb;
                System.out.println("Luas Persegi Panjang Adalah : "+luas);
            }
              
            case 3 -> { 
                System.out.println("MENGHITUNG LUAS SEGITIGA");
                System.out.println("------------------------");
                System.out.println("Masukkan Alas Segitiga");
                alas = input.nextDouble();
                System.out.println("Masukkan Tinggi Segitiga");
                tinggi = input.nextDouble();
                luas = 0.5  * (alas*tinggi);
                System.out.println("Luas Segitiga Adalah : "+luas);
            }
                
            case 4 -> {
                System.out.println("MENGHITUNG LUAS LINGKARAN");
                System.out.println("-------------------------");
                System.out.println("Masukkan Jari Lingkaan");
                jari = input.nextDouble();
                luas = phi * (jari*jari);
                System.out.println("Luas Lingkaran adalah : "+luas);
            }
                
            case 5 -> System.out.println("Pilihan Tidak Tersedia");
            }
        }
    }



