package com.example.admin.relaxappmp3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DangKyActivity extends AppCompatActivity {
    Button btnDangNhap;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky);

        anhxa();
        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iten = new Intent(DangKyActivity.this,DangNhap.class);
                startActivity(iten);
            }
        });

    }
    public void anhxa() {
        btnDangNhap = (Button) findViewById(R.id.btnDangNhap);
    }
}
