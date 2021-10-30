package com.example.admin.relaxappmp3;

/**
 * Created by ADMIN on 02/10/2021.
 */

public class BHnoibat {
    private int hinh ;
    private String tenbaihat ;
    private String tencasi;
    private int soluotxem ;

    private int fileBH;

    public BHnoibat(int hinh, String tenbaihat, String tencasi, int soluotxem, int fileBH) {
        this.hinh = hinh;
        this.tenbaihat = tenbaihat;
        this.tencasi = tencasi;
        this.soluotxem = soluotxem;
        this.fileBH = fileBH;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getTenbaihat() {
        return tenbaihat;
    }

    public void setTenbaihat(String tenbaihat) {
        this.tenbaihat = tenbaihat;
    }

    public String getTencasi() {
        return tencasi;
    }

    public void setTencasi(String tencasi) {
        this.tencasi = tencasi;
    }

    public int getSoluotxem() {
        return soluotxem;
    }

    public void setSoluotxem(int soluotxem) {
        this.soluotxem = soluotxem;
    }

    public int getFileBH() {
        return fileBH;
    }

    public void setFileBH(int fileBH) {
        this.fileBH = fileBH;
    }
}
