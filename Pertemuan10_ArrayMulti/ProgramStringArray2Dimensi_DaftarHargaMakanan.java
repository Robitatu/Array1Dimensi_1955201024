/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan10_ArrayMulti;

import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS 8
 */
public class ProgramStringArray2Dimensi_DaftarHargaMakanan {
    public static void main(String[] args) {
        System.out.println("Array 2 dimensi untuk Data Makanan");
        String makanan[][]={{"Rp.10000","Sate"},{"Rp.5000","Bakso"},{"Rp.6000","Mie Ayam"},{"Rp.8000","Rujak"}};
        
        for (int i=0; i<makanan.length; i++){
            for (int j=0; j<makanan[0].length; j++){
                System.out.print(makanan[i][j]+" ");
            }
            System.out.println(" ");
        }
        
        String cari= JOptionPane.showInputDialog(null,"Cari Makanan berdasarkan harga");
        for (int i=0; i<makanan.length; i++){
            for (int j=0; j<makanan[0].length; j++){
                if(makanan[i][j].equals(cari)){
                    JOptionPane.showMessageDialog(null, "Makanan dengan harga "+cari+" adalah "+makanan[i][j+1]);
                }
                System.out.print(makanan[i][j]+"");
            }
            System.out.println(" ");
            }

        
                String cari1= JOptionPane.showInputDialog(null,"Cari Harga berdasarkan makanan");
        for (int i=0; i<makanan.length; i++){
            for (int j=0; j<makanan[0].length; j++){
                if(makanan[i][j].equals(cari1)){
                    JOptionPane.showMessageDialog(null, "Makanan "+cari1+" dengan harga "+makanan[i][j-1]);
                }
                System.out.print(makanan[i][j]+"");
            }
            System.out.println(" ");
            }
        }
}


