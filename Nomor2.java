package Asesment;

import java.util.Scanner;

public class Ulangan1 {
    public static void main(String[] args) {
        Scanner scbd = new Scanner(System.in);
        String Beliau, Mereka, Kita;
        int tripKM;
        
        double Omset;
        int totalTrip;
        
        System.out.println("Masukkan Driver [Beliau/Mereka/Kita]? ");
        String namaDriver = scbd.nextLine();

        if (Beliau.equals(namaDriver)) {
            System.out.println("lama trip (km): ");
            tripKM = scbd.nextInt();
            
            Omset = tripKM * 13000;
            
            
    
            

            if (Mereka.equals(namaDriver)) {
                System.out.println("lama trip (km): ");
                tripKM = scbd.nextInt();

            
                Omset = tripKM * 13000;
                
                

                if (Kita.equals(namaDriver)) {
                    System.out.println("lama trip (km): ");
                    tripKM = scbd.nextInt();
                    
                    Omset = tripKM * 13000;
                    
                    
                    
                }
                
            }
        
        }
        totalTrip = tripKM ++;
        System.out.println("Total trip yang dilakukan driver: ");





    }
    
}
