import java.util.*;
public class UklMudah1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int jarak = 10;
    int harga1= 4250;   
    int harga2 = 6000; 
    int harga3= 50000;
    int volume = 100;

    System.out.println("masukan berat paket: ");
    int BeratPaket = input.nextInt();
    System.out.println("masukan jarak tempuh: ");
    int JarakPaket = input.nextInt();


    System.out.println("masukan tinggi barang: ");
    int t = input.nextInt();
    System.out.println("masukan lebar barang: ");
    int l = input.nextInt();
    System.out.println("masukan panjang barang: ");
    int p = input.nextInt();

    int vBarang = p*l*t;

    if(JarakPaket <= jarak){
        int hasil = harga1* BeratPaket;
        System.out.println("");
        if(vBarang > volume){
            int ongkos = hasil + harga3;
            System.out.println("total biaya Rp. " +ongkos);
        }else{
            System.out.println("total biaya Rp. " +hasil);
        }
    }else if(JarakPaket > jarak){
        int hasil2 = harga2* BeratPaket;
        if(vBarang > volume){
            int hasilFinal = hasil2 + harga3;
            System.out.println("total biaya Rp. " +hasilFinal);
        }else{
            System.out.println("total biaya Rp. " +hasil2);
        }
    }

}
}