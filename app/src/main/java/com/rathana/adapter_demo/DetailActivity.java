package com.rathana.adapter_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView tvCountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvCountry=findViewById(R.id.country);
        if(getIntent()!=null){
            String country=getIntent().getStringExtra("country");
            tvCountry.setText(country);
        }
    }
}
