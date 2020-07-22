/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan10_ArrayMulti;

/**
 *
 * @author WINDOWS 8
 */
public class Array2Dimensi {
    public static void main(String[] args) {
        int matriks[][]={{1,2},{3,4}};
        for (int a=0; a<matriks.length; a++){
            for(int b=0; b<matriks.length; b++){
                System.out.print(matriks[a][b]+" ");
            }
            System.out.println("    ");
        }
    }
    
}
