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
public class Example2 {

    
    public static void main(String[] args) {
        
        /*
        Deklarasi array dan pengisian indek array dilaksanakan dalam satu proses. Sehingga lebih efisien
        */
        
        String mobil[] = {"Toyota", "Honda", "Suzuki"} ;
        
        /*
        untuk pemanggilan nilai array, cukup kita manfaatkan perulangan, agar semua nilai satu persatu secara otomatis terpanggil
        tanpa harus kita panggil secara manual satu per satu
        */
        for(int a = 0 ; a < mobil.length; a++)
        {
            System.out.print(mobil[a] + " ");
        }
        
    }
    
}
    

