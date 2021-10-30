package com.example.admin.relaxappmp3;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by ADMIN on 23/10/2021.
 */

public class ListBH1 implements Serializable{
    private ArrayList<BH> arrayBH;
    private int position ;

    public ListBH1(ArrayList<BH> arrayBH, int position) {
        this.arrayBH = arrayBH;
        this.position = position;
    }

    public ArrayList<BH> getArrayBH() {
        return arrayBH;
    }

    public void setArrayBH(ArrayList<BH> arrayBH) {
        this.arrayBH = arrayBH;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
