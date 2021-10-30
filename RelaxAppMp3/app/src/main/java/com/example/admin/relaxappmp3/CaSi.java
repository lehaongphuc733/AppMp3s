package com.example.admin.relaxappmp3;

/**
 * Created by ADMIN on 23/10/2021.
 */

public class CaSi {
    private int hinhcasi;
    private String tencasi;
    private String mota;
    private int SoLuongThich;

    public CaSi(int hinhcasi, String tencasi, String mota, int soLuongThich) {
        this.hinhcasi = hinhcasi;
        this.tencasi = tencasi;
        this.mota = mota;
        SoLuongThich = soLuongThich;
    }

    public int getHinhcasi() {
        return hinhcasi;
    }

    public void setHinhcasi(int hinhcasi) {
        this.hinhcasi = hinhcasi;
    }

    public String getTencasi() {
        return tencasi;
    }

    public void setTencasi(String tencasi) {
        this.tencasi = tencasi;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getSoLuongThich() {
        return SoLuongThich;
    }

    public void setSoLuongThich(int soLuongThich) {
        SoLuongThich = soLuongThich;
    }
}
