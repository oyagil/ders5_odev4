package org.company;

class Calisan {
    private String ad;
    private int yas;

    public Calisan(String ad, int yas) {
        this.ad = ad;
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Calisan{ad='" + ad + "', yas=" + yas + '}';
    }
}