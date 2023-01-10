public class paket{
    protected ArrayList<String> namapaket = new ArrayList<String>();
    protected ArrayList<String> jeniskendaraan = new ArrayList<String>();
    protected ArrayList<String> destinasi = new ArrayList<String>();
    protected ArrayList<Integer> price = new ArrayList<Integer>();
    protected ArrayList<Integer> jumlahtiket = new ArrayList<Integer>();
    
    paket(String pakett,String jenisken,String dest,int harga,int jumlah){
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
    
}
