package com.example.firstaplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.firstaplication.delta1;
import com.example.firstaplication.delta2;
import com.example.firstaplication.delta3;
import com.example.firstaplication.delta4;
import com.example.firstaplication.delta5;
import com.example.firstaplication.delta6;

public class MainActivity extends AppCompatActivity {

    ImageView ivMyacount, ivbrokenelectronik, ivinprogres, ivgoodelectronik, ivinfo, ivpay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivMyacount = findViewById(R.id.iv_Myacount);
        ivMyacount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, delta1.class);
                startActivity(intent);
            }
        });

        ivbrokenelectronik = findViewById(R.id.iv_brokenelectronik);
        ivbrokenelectronik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, delta2.class);
                startActivity(intent);
            }
        });

        ivinprogres = findViewById(R.id.iv_inprogres);
        ivinprogres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, delta3.class);
                startActivity(intent);
            }
        });

        ivgoodelectronik = findViewById(R.id.iv_goodelectronik);
        ivgoodelectronik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, delta4.class);
                startActivity(intent);
            }
        });

        ivinfo = findViewById(R.id.iv_info);
        ivinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, delta5.class);
                startActivity(intent);
            }
        });

        ivpay = findViewById(R.id.iv_pay);
        ivpay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, delta6.class);
                startActivity(intent);
            }
        });

    }
}