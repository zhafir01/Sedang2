package UKL;

import java.util.Scanner;

public class VolumeTabung {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jarijari, tinggi;
       

        System.out.print("Masukkan jari-jari tabung (cm): ");
        jarijari = input.nextDouble();
        
        System.out.print("Masukkan tinggi tabung (cm): ");
        tinggi = input.nextDouble();
       
        double volume =  3.14 * jarijari * jarijari * tinggi;

        System.out.println("Volume tabung adalah: " + volume + " cm^3");


    }
}
