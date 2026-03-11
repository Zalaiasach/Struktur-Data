public class App {
    public static void main(String[] args) throws Exception {
        Handphone HPBaru1=new HPFlagship("Samsung", "S26 Ultra");
        HPBaru1.CekHarga(20000000);
        Handphone HPBaru2=new HPMidRange("Oppo", "Reno 14");
        HPBaru2.CekHarga(5000000);
        Handphone HPLama=new HPEntryLevel("Xiaomi", "Redmi 14c");
        HPLama.CekHarga(1500000);

        HPBaru1.displayInfo();
        System.out.println("Harganya= "+HPBaru1.DapatHarga());
        HPBaru1.CekHP();
        System.out.println("");
        HPBaru2.displayInfo();
        System.out.println("Harganya= "+HPBaru2.DapatHarga());
        HPBaru2.CekHP();
        System.out.println("");
        HPLama.displayInfo();
        System.out.println("Harganya= "+HPLama.DapatHarga());
        HPLama.CekHP();
    }
}

abstract class Handphone{
    protected  String Brand;
    protected  String Type;
    private int Harga;
    
    public Handphone(String B, String T){
        this.Brand=B;
        this.Type=T;
    }

    public void CekHarga(int Harga){
        this.Harga=Harga;
    }

    public int DapatHarga(){
        return Harga;
    }

    abstract void CekHP();

    public void displayInfo(){
        System.out.println("Brand: "+Brand);
        System.out.println("Type: "+Type);
    }
}

class HPFlagship extends Handphone{
    public HPFlagship(String Brand, String Type){
        super(Brand,Type);
    }

    @Override
    void CekHP(){
        System.out.println("Bisa buat main Game");
    }
}

class HPEntryLevel extends Handphone{
    public HPEntryLevel (String Brand, String Type){
        super(Brand,Type);
    }

    @Override
    void CekHP(){
        System.out.println("Kalau butuh saja");
    }
}

class HPMidRange extends Handphone{
    public HPMidRange (String Brand,String Type){
        super (Brand,Type);
    }

    @Override
    void CekHP(){
        System.out.println("Kalau ada uang lebih");
    }
}