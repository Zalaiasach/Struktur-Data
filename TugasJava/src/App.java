public class App {
    public static void main(String[] args) throws Exception {
        Dokter zifan = new Dokter("Zifan");
        Dokter dewa = new Dokter("Dewa");

        Pasien pBaru1 = new Pasien_BPJS(123912, "Riezal", "Panas", 129382910);
        Pasien pBaru2= new Pasien_Mandiri(122232, "Lile", "Kanker");

        dewa.periksa(pBaru2, 100000);
        pBaru2.cetak_invoice_pembayaran();

        zifan.periksa(pBaru1, 50000);
        pBaru1.cetak_invoice_pembayaran();
    }
}

abstract class Pasien{
    protected  int id;
    protected  String nama;
    protected  String keluhan;
    protected double biaya_obat;
    protected double biaya_Konsultasi = 100000;

    public Pasien(int id,String nama,String keluhan){
        this.id=id;
        this.nama=nama;
        this.keluhan=keluhan;
    }

    public void setBiayaObat(double biaya){
        this.biaya_obat=biaya;
    }

    public abstract void cetak_invoice_pembayaran();
}

class Pasien_BPJS extends  Pasien{
    private int ID_BPJS;

    public Pasien_BPJS(int id,String nama,String keluhan,int ID_BPJS){
        super(id,nama,keluhan);
        this.ID_BPJS=ID_BPJS;
    }

    @Override
    public void cetak_invoice_pembayaran(){
        System.out.println("==INVOICE PEMBAYARAN==");
        System.out.println("=Nama: "+nama);
        System.out.println("=ID BPJS: "+ID_BPJS);
        System.out.println("=Tercover BPJS");
        System.out.println("=======================");
    }
}

class Pasien_Mandiri extends Pasien{
    public Pasien_Mandiri(int id,String nama,String keluhan){
        super(id, nama, keluhan);
    }

    @Override
    public void cetak_invoice_pembayaran(){
        double total=biaya_obat+biaya_Konsultasi;
        System.out.println("==INVOICE PEMBAYARAN==");
        System.out.println("=Nama: "+nama);
        System.out.println("=Biaya Konsultasi: Rp"+biaya_Konsultasi);
        System.out.println("=Biaya Obat: Rp"+biaya_obat);
        System.out.println("=TOTAL: Rp"+total);
        System.out.println("=======================");
    }
}

 class Dokter {
    private String nama_dokter;

    public Dokter(String nama_dokter) {
        this.nama_dokter = nama_dokter;
    }

    public void periksa(Pasien p, double harga_obat) {
        System.out.println("Dokter " + nama_dokter + " memeriksa pasien " + p.nama);
        System.out.println("Hasil: Pasien menderita " + p.keluhan);
        p.setBiayaObat(harga_obat);
    }
 }