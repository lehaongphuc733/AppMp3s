package com.example.admin.relaxappmp3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listBHnoibat;
    ListView listBH;
    ListView listCaSi;
    ArrayList<BHnoibat> arrayBH ;
    ArrayList<BH> arrayBH1;
    ArrayList<CaSi> arrayCaSi;
    BHnoibatAdapter adapter ;
    BHAdapter adapter1;
    CaSiAdapter adapter2;


    ImageButton imgMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhxa();


        adapter1 = new BHAdapter(this,R.layout.dong_bai_hat,arrayBH1);
        listBH.setAdapter(adapter1);


        adapter2 = new CaSiAdapter(this,R.layout.dong_ca_si,arrayCaSi);
        listCaSi.setAdapter(adapter2);



//        listBH.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Intent intent1 = new Intent(MainActivity.this,ListenmusicActivity.class);
//                intent1.putExtra("position1",i);
//                startActivity(intent1);
//            }
//        });

        listBHnoibat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,ListenmusicActivity.class);
//                String tenBH = arrayBH.get(i).getTenbaihat();
//                String tencasi = arrayBH.get(i).getTencasi();
//                int file = arrayBH.get(i).getFileBH();
//                arrayBH = new ArrayList<>();
////                arrayBH.;
//                arrayBH.add(new BHnoibat(R.drawable.item1,"Lạc Trôi","Sơn Tùng",1,R.raw.lactroi));
  //              Bundle bundle = new Bundle();
////                bundle.putSerializable("listBH",(Serializable) arrayBH);
                intent.putExtra("position",i);
////                ListBH listBH = new ListBH(arrayBH,i);
//                intent.putExtra("bundle",bundle);


//                intent.putExtra("listBH", (Serializable) listBH);
//                ArrayList<BHnoibat> s = new ArrayList<>();
//                s.add(new BHnoibat(R.drawable.item1,"Lạc Trôi","Sơn Tùng",1,R.raw.lactroi));
//                demo x = new demo(s,"xyz");
//                intent.putExtra("dulieu", (Serializable) x);
                startActivity(intent);
                //                Log.d("abc",x.s.get(0).getTenbaihat());
            }
        });




        adapter = new BHnoibatAdapter(this,R.layout.bhnoibat_layout,arrayBH);
        //adapter1 = new BH(this,R.layout.bhnoibat_layout,arrayBH1);
        listBHnoibat.setAdapter(adapter);
        //listBH.setAdapter(adapter1);


        imgMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMenu();
            }
        });
//        @Override
//        public boolean onOptionsItemSelected(MenuItem item) {
//            switch (item.)
//        }

    }



//    @Override
//    public boolean onCreateOptionMenu(Menu menu)
//    {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.menu_option,menu);
//        setMenuBackground();
//        return true;
//    }


//    protected void setMenuBackground(){
//        getLayoutInflater().setFactory(new Factory() {
//            public View onCreateView(String name, Context context, AttributeSet attrs) {
//                if(name.equalsIgnoreCase("com.android.internal.view.menu.IconMenuItemView")) {
//                    try {
//                        LayoutInflater f = getLayoutInflater();
//                        final View view = f.createView(name , null, attrs);
//                        new Handler().post(new Runnable() {
//                            public void run() {
//                                view.setBackgroundResource(R.color.androidcolor);
//                                ((TextView) view).setTextColor(Color.BLACK);
//                                ((TextView) view).setTextSize(18);
//                            }
//                        });
//                        return view;
//                    }
//                    catch (InflateException e) {}
//                    catch (ClassNotFoundException e) {}
//                }
//                return null;
//            }
//        });
//    }



    private void showMenu()
    {
        PopupMenu popupMenu = new PopupMenu(this,imgMenu);
        popupMenu.getMenuInflater().inflate(R.menu.menu_option,popupMenu.getMenu());

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.menuDangnhap:
                        Intent intent = new Intent(MainActivity.this,DangNhap.class);
                        startActivity(intent);
                        break;
                    case R.id.menuTimkiem:
                        Intent intent1 = new Intent(MainActivity.this,TimKiemActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.menuSuaThongTin:
                        Intent intent2 = new Intent(MainActivity.this,SuaThongTin.class);
                        startActivity(intent2);
                        break;
                }
                return false;
            }
        });
        popupMenu.show();
    }


//    @Override
//    public void onBackPressed() {
//        if()
//        super.onBackPressed();
//    }

    private void anhxa() {


        imgMenu = (ImageButton) findViewById(R.id.imgMenu);

        listBHnoibat = (ListView) findViewById(R.id.listBHnoibat);
        listBH = (ListView) findViewById(R.id.listBH);
        listCaSi = (ListView) findViewById(R.id.listCaSi);
        arrayBH = new ArrayList<>();
        arrayBH1 = new ArrayList<>();
        arrayCaSi = new ArrayList<>();


        arrayBH.add(new BHnoibat(R.drawable.item1,"Lạc Trôi","Sơn Tùng",1,R.raw.lactroi));
        arrayBH.add(new BHnoibat(R.drawable.item3,"Khuê Mộc Lan","Hương Ly",1,R.raw.khuemoclan));
        arrayBH.add(new BHnoibat(R.drawable.item4,"Rồi Tới Luôn","Nal",1,R.raw.roitoiluon));
        arrayBH.add(new BHnoibat(R.drawable.item4,"Rồi Tới Luôn","Nal",1,R.raw.roitoiluon));
        arrayBH.add(new BHnoibat(R.drawable.item4,"Rồi Tới Luôn","Nal",1,R.raw.roitoiluon));
        arrayBH.add(new BHnoibat(R.drawable.item4,"Rồi Tới Luôn","Nal",1,R.raw.roitoiluon));
        arrayBH.add(new BHnoibat(R.drawable.item4,"Rồi Tới Luôn","Nal",1,R.raw.roitoiluon));
        arrayBH.add(new BHnoibat(R.drawable.item4,"Rồi Tới Luôn","Nal",1,R.raw.roitoiluon));
        arrayBH.add(new BHnoibat(R.drawable.item4,"Rồi Tới Luôn","Nal",1,R.raw.roitoiluon));

        arrayBH1.add(new BH(R.drawable.item1,"Lạc Trôi","Sơn Tùng",1,R.raw.lactroi));
        arrayBH1.add(new BH(R.drawable.item4,"Rồi Tới Luôn","Nal",1,R.raw.roitoiluon));

        //arrayCaSi.add(new CaSi(R.drawable.,"Sơn Tùng","Sở hữu vóc dáng nam thần",20));
        //arrayCaSi.add(new CaSi(R.drawable.,"Sơn Tùng","Sở hữu vóc dáng nam thần",20));
        //arrayCaSi.add(new CaSi(R.drawable.,"Sơn Tùng","Sở hữu vóc dáng nam thần",20));
        //arrayCaSi.add(new CaSi(R.drawable.,"Sơn Tùng","Sở hữu vóc dáng nam thần",20));

    }

}
