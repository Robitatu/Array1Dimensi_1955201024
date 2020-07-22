/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan9_Array1Dimensi;

/**
 *
 * @author WINDOWS 8
 */
public class Example5 {
    public static void main(String[] args) {
        String[][] kontak={{"Lili","08111"},{"Lala","08122"},{"Maya","08133"}};
        for(int x=0; x<kontak.length; x++){
            System.out.println("Nama: "+kontak[x][0]);
            System.out.println("Nomer: "+kontak[x][1]);
            System.out.println("---------------------");
        }
    }
    
}
