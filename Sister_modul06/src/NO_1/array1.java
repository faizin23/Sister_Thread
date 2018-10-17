/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NO_1;

import static NO_1.hitungArray.tampung1;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.audio.AudioPlayer;

/**
 *
 * @author Faizin
 */
public class array1 extends Thread {

    MainThreads mt = new MainThreads();
    hitungArray ha = new hitungArray();

    int num;
    
    public array1(int angka){
        num = angka;
    }

    static int tampung1 = 0;
    static int tampung2 = 0;
    static int tampung3 = 0;

    public void run() {
        int akhir;

        if (tampung1 > tampung2 && tampung1 > tampung3) {
            akhir = tampung1;
        } else if (tampung2 > tampung1 && tampung2 > tampung3) {
            akhir = tampung2;
        } else if (tampung3 > tampung2 && tampung3 > tampung1) {
            akhir = tampung3;
        } else {
            akhir = mt.arr1.length;
        }

        int[] arrThreads = new int[akhir];

//            getAkhir(akhir);
//        for (int i = 0; i < akhir; i++) {
            arrThreads[num] = mt.arr1[num] + mt.arr2[num] + mt.arr3[num];
            System.out.println("Hasil : " + mt.arr1[num] + " + " + mt.arr2[num] + " + " + mt.arr3[num] + " = " + arrThreads[num] + " ");
//        }
        try {

            Thread.sleep(5000);
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        try {
            Thread t1 = new array1(2);
            
            t1.start();
            Thread.sleep(5000);
            
            Thread t2 = new array1(3);
            t2.start();
        } catch (InterruptedException ex) {
            Logger.getLogger(array1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
