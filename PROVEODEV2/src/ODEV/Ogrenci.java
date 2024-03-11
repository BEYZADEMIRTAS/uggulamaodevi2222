package ODEV;

public class Ogrenci {
    private String Ad;
    private String Bolum;
    private int GirisYili;
    private String ogrNo;
    private double Gano;
    private int bolumKodu=109;
    private int girissirasi=1;

    public Ogrenci(String Ad, String Bolum,String ogrNo,int GirisYili,double Gano){
        this.Ad=Ad;
        this.Bolum=Bolum;
        this.ogrNo=ogrNo;
        this.GirisYili=GirisYili;
        this.Gano=Gano;
    }
    public Ogrenci(String Ad, String Bolum,String ogrNo,double Gano){
        this.Ad=Ad;
        this.Bolum=Bolum;
        this.ogrNo=ogrNo;
        this.Gano=Gano;
    }
    public Ogrenci(int GirisYili){
        this.Ad=null;
        this.Bolum=null;
        this.ogrNo=null;
        this.GirisYili=GirisYili;
        this.Gano=0;
    }
    public Ogrenci(String Ad,String Bolum,int GirisYili){
        this.Ad=Ad;
        this.Bolum=Bolum;
        this.ogrNo=null;
        this.GirisYili=GirisYili;
        this.Gano=0;
    }
    public Ogrenci(String Ad, String Bolum,int GirisYili,double Gano){
        this.Ad=Ad;
        this.Bolum=Bolum;
        this.GirisYili=GirisYili;
        this.Gano=Gano;

    }
    public Ogrenci(String ogrNo){
        this(null,null,ogrNo,0,0);
    }
    public Ogrenci(){
        this(null,null,null,0,0);
    }

    public String getAd() {
        return Ad;
    }

    public void setAd(String ad) {
        Ad = ad;
    }

    public String getBolum() {
        return Bolum;
    }

    public void setBolum(String bolum) {
        Bolum = bolum;
    }

    public int getGirisYili() {
        return GirisYili;
    }

    public void setGirisYili(int girisYili) {
        GirisYili = girisYili;
    }

    public String getOgrNo() {
        if(ogrNo==null){
            ogrenciNoOlustur();
        }
        return ogrNo;
    }

    public void setOgrNo(String ogrNo) {
        this.ogrNo = ogrNo;
    }

    public double getGano() {
        return Gano;
    }

    public void setGano(double gano) {
        Gano = gano;
    }

    public int getBolumKodu() {
        return bolumKodu;
    }

    public void setBolumKodu(int bolumKodu) {
        this.bolumKodu = bolumKodu;
    }

    public int getGirissirasi() {
        return girissirasi;
    }

    public void setGirissirasi(int girissirasi) {
        this.girissirasi = girissirasi;
    }

    public String ogrenciNoOlustur() {
        ogrNo = String.format("%04d%03d%03d", GirisYili, bolumKodu, girissirasi);
            return ogrNo;

    }
        public double ortalama(){
            if(Gano<0 && 4<Gano){
                throw new IllegalArgumentException("Gano bulunamadi");
            }
            return Gano;
        }
        public double harcHesapla(int dersSayisi){
        return dersSayisi*120;
        }
        public double harcHesapla(int dersSayisi,double uzatilanYil){
        double harc=dersSayisi*120;
        return harc+(uzatilanYil*100);
        }
}