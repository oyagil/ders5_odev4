package org.company;
import java.util.ArrayList;
import java.util.List;
class Sirket {
    private List<Departman> departmanlar;

    public Sirket() {
        this.departmanlar = new ArrayList<>();
    }

    public void departmanEkle(Departman departman) {
        departmanlar.add(departman);
    }

    public List<Departman> getDepartmanlar() {
        return departmanlar;
    }

    public static void main(String[] args) {
        Sirket sirket = new Sirket();

        Departman insanKaynaklari = new Departman("İnsan Kaynakları");
        insanKaynaklari.calisanEkle(new Calisan("Ahmet Yılmaz", 28));
        insanKaynaklari.calisanEkle(new Calisan("Ayşe Demir", 35));

        Departman yazilim = new Departman("Yazılım");
        yazilim.calisanEkle(new Calisan("Mehmet Kaya", 32));
        yazilim.calisanEkle(new Calisan("Elif Can", 28));

        sirket.departmanEkle(insanKaynaklari);
        sirket.departmanEkle(yazilim);

        // Şirket bilgileri
        System.out.println("Şirket Departmanları ve Çalışanları:");
        for (Departman departman : sirket.getDepartmanlar()) {
            System.out.println(departman);
        }
    }
}
