/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peperiksaan;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Peperiksaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int i;
        int ulangan;
        
        System.out.print("Peperiksaan/ujian kali ke (1/2/3): ");
        ulangan = input.nextInt();
        
        double [] markah  = new double [5];
        for(i = 0;i<5;i++){
        markah [i]=input.nextDouble();
       }
        
        System.out.println("5 markah yang dimaksukkan ialah ");
        int x;
        for(x=0;x<5;x++){
          System.out.println((x+1)+"."+markah[x]);
        }
       
         double tambah,purata;
        
        tambah = markah[0] + markah[1] + markah[2] + markah[3] + markah[4];
        System.out.println("Hasil tambah 5 markah ialah "+tambah);
        
        purata = tambah/5;
        System.out.println("Purata markah ialah "+purata);
        
        int jumlah =0;
        for (x = 0;x<5;x++){
            if(markah[x]>purata){
                jumlah++;
            }
        
    }  
    }
}
