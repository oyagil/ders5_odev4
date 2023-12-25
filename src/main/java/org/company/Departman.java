package org.company;
import java.util.ArrayList;
import java.util.List;
class Departman {
    private String ad;
    private List<Calisan> calisanlar;

    public Departman(String ad) {
        this.ad = ad;
        this.calisanlar = new ArrayList<>();
    }

    public void calisanEkle(Calisan calisan) {
        calisanlar.add(calisan);
    }

    public List<Calisan> getCalisanlar() {
        return calisanlar;
    }

    @Override
    public String toString() {
        return "Departman{ad='" + ad + "', calisanlar=" + calisanlar + '}';
    }
}