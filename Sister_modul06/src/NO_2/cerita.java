/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NO_2;

/**
 *
 * @author Faizin
 */
public class cerita extends Thread{
    static int dokter, suster, pasien;

    public void run() {
        
        System.out.println("Disuatu rumah sakit terdapat 1 dokter, 2 perawat dan 1 kasir");
        
        for (pasien = 0; pasien < 10; pasien++) {
            System.out.println("Pasien ke " + (pasien + 1) + " datang dan di periksa oleh Dokter");
        }

        for (pasien = 0; pasien < 10; pasien++) {
            if ((pasien +1) % 5 == 0) {
                System.out.println("");
                System.out.println("Suster merawat 5 pasien");
                for (int j = (pasien + 1); j > pasien - 4; j--) {
                    System.out.println("Pasien " + j + " membayar ke kasir");
                }
                System.out.println("");
            }

        }
    }

    public static void main(String[] args) {
        Thread t = new cerita();
        t.start();
    }
}
