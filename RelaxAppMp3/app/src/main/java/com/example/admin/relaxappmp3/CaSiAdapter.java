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

public class CaSiAdapter extends BaseAdapter {
    private Context context2;
    private int layout2;
    private List<CaSi> listCaSi;

    public CaSiAdapter(Context context2, int layout2, List<CaSi> listCaSi) {
        this.context2 = context2;
        this.layout2 = layout2;
        this.listCaSi = listCaSi;
    }

    @Override
    public int getCount() {
        return listCaSi.size();
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
        LayoutInflater inflater = (LayoutInflater) context2.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout2,null);

        ImageView imgHinhcasi = (ImageView) view.findViewById(R.id.imgHinhcasi);
        TextView txtTencasi = (TextView) view.findViewById(R.id.txtTencasi);
        TextView txtMota = (TextView) view.findViewById(R.id.txtMota);
        TextView txtSoluongthich= (TextView) view.findViewById(R.id.txtSoLuotThich);
        CaSi casi =listCaSi.get(i);

        imgHinhcasi.setImageResource(casi.getHinhcasi());
        txtTencasi.setText(casi.getTencasi());
        txtMota.setText(casi.getMota());
        String s = "Số lượt xem: " ;
        txtSoluongthich.setText(s+String.valueOf(casi.getSoLuongThich()));
        return view;
    }
}
