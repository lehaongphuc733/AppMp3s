package com.example.admin.relaxappmp3;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by ADMIN on 04/10/2021.
 */

public class ListBH implements Serializable {

    private ArrayList<BHnoibat> arrayBH;
    private int position ;




    public ArrayList<BHnoibat> getArrayBH() {
        return arrayBH;
    }

    public void setArrayBH(ArrayList<BHnoibat> arrayBH) {
        this.arrayBH = arrayBH;
    }

    public ListBH(ArrayList<BHnoibat> arrayBH, int position) {
        this.arrayBH = arrayBH;
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
