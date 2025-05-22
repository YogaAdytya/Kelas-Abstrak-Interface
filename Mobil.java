public class Mobil extends Kendaraan implements Bergerak {
    private int jumlahPintu;
    
    public Mobil(String merk, int tahunProduksi, int jumlahPintu) {
        super(merk, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
    }
    
    @Override
    public void info() {
        System.out.println("Mobil " + merk + " tahun " + tahunProduksi + 
                         " dengan " + jumlahPintu + " pintu");
    }
    
    @Override
    public void maju() {
        System.out.println("Mobil bergerak maju");
    }
    
    @Override
    public void berhenti() {
        System.out.println("Mobil berhenti");
    }
}