/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulg10115557latihan20targetsaldotabungan;

/**
 *
 * @author 10115557 / rayan / PBO Ulg / pertemuan 2 / latihan 20
 */
public class PBOULG10115557Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldoAwal = 3500000;
        int bunga = 8;
        int jmlBunga;
        int saldoTarget = 6000000 ;
        
      
       int i = 1;
        while (saldoAwal <= saldoTarget) {
            jmlBunga = saldoAwal*bunga/100;
            saldoAwal += jmlBunga;
            
            String mataUang = String.format("Rp.%,3d",saldoAwal).replaceAll(","
            +"",".");       
            System.out.printf("Saldo dibulan ke-"+i+" %s%n",mataUang);
            i++;
        }
    } 
}
