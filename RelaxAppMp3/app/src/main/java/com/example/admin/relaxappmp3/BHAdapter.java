package com.example.admin.relaxappmp3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ADMIN on 23/10/2021.
 */

public class BHAdapter extends BaseAdapter {
    private Context context1;
    private int layout1;
    private List<BH> listBH1;


    public BHAdapter(Context context1, int layout1, List<BH> listBH1) {
        this.context1 = context1;
        this.layout1 = layout1;
        this.listBH1 = listBH1;
    }

    @Override
    public int getCount() {
        return listBH1.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context1.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout1,null);
        
        ImageView imgHinh = (ImageView) view.findViewById(R.id.imgHinh);
        TextView txtBH = (TextView) view.findViewById(R.id.txtTenbaihat);
        TextView txtcasi  = (TextView) view.findViewById(R.id.txtTencasi);
        TextView txtsoluotxem = (TextView) view.findViewById(R.id.txtSoluotxem);
        BH bh = listBH1.get(i);

        imgHinh.setImageResource(bh.getHinh());
        txtBH.setText(bh.getTenbaihat());
        txtcasi.setText(bh.getTencasi());
        TextView txtNumber = (TextView) view.findViewById(R.id.txtNumber);
        String s = "Số lượt xem: " ;
        txtsoluotxem.setText(s+String.valueOf(bh.getSoluotxem()));
        return view;
    }
}
