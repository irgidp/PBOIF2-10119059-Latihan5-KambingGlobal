/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi program untuk menampilkan jumlah kambingglobal
 */
package pboif2.pkg10119059.latihan5.kambingglobal;

public class KambingGlobal {
    int jumlahKambing = 88;

    //Method untuk menampilkan jumlah kambing
    public void getjumlahKambing(){
     System.out.println("Jumlah kambing: " + jumlahKambing);
    }

    public void tambahKambing(){
     jumlahKambing = jumlahKambing + 5;
     System.out.println("Jumlah kambing setelah di tambah: " + jumlahKambing);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KambingGlobal kambingSusu = new KambingGlobal();

        //Menampilkan jumlah kambing yang ada saat program pertama kali berjalan
        kambingSusu.getjumlahKambing();

        //Menambah 1 kambing
        kambingSusu.tambahKambing();

        //Menampilkan jumlah kambing yang ada
        kambingSusu.getjumlahKambing();
    }
}
    
    
