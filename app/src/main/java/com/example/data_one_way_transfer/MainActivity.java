package com.example.data_one_way_transfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText username,passwd;
    private Button transfer;
    private ImageView run;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        username = findViewById(R.id.username);
        passwd = findViewById(R.id.passwd);
        transfer = findViewById(R.id.transfer);
        run = findViewById(R.id.run);

        transfer.setOnClickListener(this);
    }



    private void startGif() {
        Glide.with(this).load(R.drawable.leng).into(run);
    }


    @Override
    public void onClick(View v) {
        startGif();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                endGif();
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                intent.putExtra("001",username.getText().toString());
                intent.putExtra("002",passwd.getText().toString());
                startActivity(intent);
                username.setText("");
                passwd.setText("");
            }
        },3000);
    }

    private void endGif() {
        Glide.with(this).clear(run);
    }
}





