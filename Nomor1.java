package Asesment;

import java.util.Scanner;


public class Ulangan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jamLembur;
        double gajiLembur = 10000;
        double honorLembur;

        System.out.print("Masukkan jam lembur : ");
        jamLembur = input.nextInt();

        

        honorLembur = jamLembur * gajiLembur;  // hitung durasi jam kerja

        if (honorLembur >= 16 ) {
            honorLembur = jamLembur * 10000;
            
        } else if (honorLembur > 16 ) {
            honorLembur = jamLembur * 15000;
            
        } else {
            
        }
        System.out.println("Honor Lembur anda: " + honorLembur);
        input.close();
    }
     
}
