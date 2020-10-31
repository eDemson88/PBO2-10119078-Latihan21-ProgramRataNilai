/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119078.latihan21.programratanilai;

import java.util.Scanner;

/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan21ProgramRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int banyakMhs;
        float nilaiMhs,jum = 0,rata;
        
        Scanner scanner = new Scanner (System.in);
        System.out.printf("Masukan banyaknya mahasiswa: ");
        banyakMhs = scanner.nextInt();
        
        for (int i = 1; i <= banyakMhs; i++){
            System.out.printf("nilai mahasiswa ke-" + i +": ");
            nilaiMhs = scanner.nextFloat();
            jum += nilaiMhs;
            
        }
        rata = jum / banyakMhs;
        System.out.println("rata rata: " + rata);
    }
    
}
