package com.pab.recycle_view;

public class Kontak {
    private String nama, telepon, link_gambar;

    public Kontak(String nama, String telepon, String link_gambar){
        this.nama = nama;
        this.telepon = telepon;
        this.link_gambar = link_gambar;
    }

    //buatlah setter dan getter dari masing-masing variable
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getLink_gambar() {
        return link_gambar;
    }

    public void setLink_gambar(String link_gambar) {
        this.link_gambar = link_gambar;
    }
}
