import java.util.*;

public class Packages{
    protected ArrayList<String> namapaket = new ArrayList<String>();
    protected ArrayList<String> jeniskendaraan = new ArrayList<String>();
    protected ArrayList<String> destinasi = new ArrayList<String>();
    protected ArrayList<Integer> price = new ArrayList<Integer>();
    protected ArrayList<Integer> jumlahtiket = new ArrayList<Integer>();
    
    Packages(String pakett, String jenisken, String dest, int harga, int jumlah){
        this.namapaket.add(pakett);
        this.jeniskendaraan.add(jenisken);
        this.destinasi.add(dest);
        this.price.add(harga);
        this.jumlahtiket.add(jumlah);
    }
    
    void set_data(String pakett,String jenisken,String dest,int harga,int jumlah){
        this.namapaket.add(pakett);
        this.jeniskendaraan.add(jenisken);
        this.destinasi.add(dest);
        this.price.add(harga);
        this.jumlahtiket.add(jumlah);
    }
    
    void print_data(){
        System.out.println(" |No.\t || Package Name || Transportation || Destination || Price || Ticket Amount");
        System.out.println("=========================================================================================");
        for(int i=0;i<namapaket.size();i++){
            System.out.println((i+1) + namapaket.get(i) + jeniskendaraan.get(i) + destinasi.get(i) + price.get(i) + jumlahtiket.get(i));
        }
       System.out.println("=========================================================================================");
    }
    
} 
