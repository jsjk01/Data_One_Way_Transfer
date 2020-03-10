package com.example.data_one_way_transfer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        TextView transfer2 = findViewById(R.id.transfer2);
        Button back = findViewById(R.id.back);
        transfer2.setText("用户名：" + getIntent().getStringExtra("001") + "\n" + "密    码：" + getIntent().getStringExtra("002"));
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
