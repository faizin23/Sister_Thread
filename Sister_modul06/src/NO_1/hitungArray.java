/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NO_1;

/**
 *
 * @author Faizin
 */
public class hitungArray {
    static int tampung1 = 0;
    static int tampung2 = 0;
    static int tampung3 = 0;
    int akhir;
    
    public void getAkhir(int akhir){
        this.akhir = akhir;
    }
    
    public int setAkhir (){
        return akhir;
    }
    
    public void hitung() {
        MainThreads mt = new MainThreads();
        hitungArray ha = new hitungArray();
        
        int akhir = 0;
        
        tampung1 = mt.arr1.length;
        tampung2 = mt.arr2.length;
        tampung3 = mt.arr3.length;
        
        if(tampung1 > tampung2 && tampung1 > tampung3){
            akhir = tampung1;
        }else if(tampung2 > tampung1 && tampung2 > tampung3){
            akhir = tampung2;
        }else if(tampung3 > tampung2 && tampung3 > tampung1) {
            akhir = tampung3;
        }else{
            akhir = mt.arr1.length;
        }
//        return akhir;
        ha.getAkhir(akhir);
    }
}
