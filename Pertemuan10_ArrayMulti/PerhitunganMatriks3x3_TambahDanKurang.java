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
public class PerhitunganMatriks3x3_TambahDanKurang {
    public static void main(String[] args) {
        int matriksA[][]= {{7,9,5},{1,5,0},{4,1,2}};
        int matriksB[][]= {{5,7,3},{0,4,6},{3,4,5}};
        int matriksC[][]= new int [matriksA.length][matriksA[0].length];
        
        System.out.println("Matriks A");
        for (int i =0; i<matriksA.length;i++){
            for(int j=0; j<matriksA[i].length; j++){
                System.out.print(matriksA[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("Matriks B");
        for (int k =0; k <matriksB.length;k++){
            for(int l=0; l<matriksB[k].length; l++){
                System.out.print(matriksB[k][l]+ " ");
            }
            System.out.println();
    }
            System.out.println();
            System.out.println("Hasil Pengurangan");
            System.out.println();
            for (int m=0; m<matriksC.length;m++){
              for(int n=0; n<matriksC[0].length; n++){
                  matriksC[m][n]= matriksA[m][n]-matriksB[m][n];
                  System.out.print(matriksC[m][n]+"\t");
              }
                System.out.println();
    }
            System.out.println();
            System.out.println("Hasil Pejumlahan");
            System.out.println();
            for (int m=0; m<matriksC.length; m++){
                for(int n=0;n<matriksC[0].length; n++){
                    matriksC[m][n]= matriksA[m][n]+matriksB[m][n];
                    System.out.print(matriksC[m][n]+"\t");
                }
                System.out.println();
    }

    }
    
}
