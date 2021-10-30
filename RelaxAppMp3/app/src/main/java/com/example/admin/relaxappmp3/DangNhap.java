package com.example.admin.relaxappmp3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DangNhap extends AppCompatActivity {
    Button btnDangKy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);
        AnhXa();

        btnDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iten = new Intent(DangNhap.this,DangKyActivity.class);
                startActivity(iten);
            }
        });
    }
    public void AnhXa(){
        btnDangKy = (Button) findViewById(R.id.btnDangKy);
    }
}
