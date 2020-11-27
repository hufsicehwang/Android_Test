package com.example.androidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    TextView tv_sub;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        tv_sub=findViewById(R.id.tv_sub);
        Intent intent = getIntent();  // 넘어온 값을 intent에서 받아준다
        str = intent.getStringExtra("hint"); // str에 넣어준다
        tv_sub.setText(str);            // tv_sub를 setText해준다
    }
}