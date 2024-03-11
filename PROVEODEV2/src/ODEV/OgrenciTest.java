package ODEV;

import org.w3c.dom.ls.LSOutput;

public class OgrenciTest {
    public static void main(String[] args) {
        System.out.println("ogrencilerin bilgileri");
        Ogrenci ogrenci1=new Ogrenci(1973);
        System.out.println("OGR-1"+ogrenci1.getAd()+"  "+ogrenci1.getBolum()+"  "+ogrenci1.getOgrNo()+"  "+ogrenci1.getGano());

    Ogrenci ogrenci2=new Ogrenci("Gokhan","makina muh",1985);
        System.out.println("OGR-2"+ogrenci2.getAd()+"  "+ogrenci2.getBolum()+"  "+ogrenci2.getOgrNo()+"  "+ogrenci2.getGano());

        Ogrenci ogrenci3=new Ogrenci("Ayse","Makina muh",1985);
        System.out.println("OGR-2"+ogrenci3.getAd()+"  "+ogrenci3.getBolum()+"  "+ogrenci3.getOgrNo()+"  "+ogrenci3.getGano());

        Ogrenci ogrenci4=new Ogrenci("Elif","Elektrik Elektronik Muh",2020,1.98);
        System.out.println("OGR-2"+ogrenci4.getAd()+"  "+ogrenci4.getBolum()+"  "+ogrenci4.getOgrNo()+"  "+ogrenci4.getGano());

        Ogrenci ogrenciislem=new Ogrenci("Ayse","Makina muh",1985);
        int dersSayisi=4;
        double uzatrilanYil=0;
        double harc=ogrenciislem.harcHesapla(dersSayisi,uzatrilanYil);
        System.out.println("3.ogrencinin odeyecegi harc:"+harc);

        Ogrenci ogrenciIslem1=new Ogrenci("Elif","Elektrik-elektronik Müh",2020);
        int dersSayisi1=6;
        double uzatilanYil1=2;
        double harc1=ogrenciislem.harcHesapla(dersSayisi1,uzatilanYil1);
        System.out.println("4. öğrencinin ödeyeceği harç: "+harc1);

    }

}
