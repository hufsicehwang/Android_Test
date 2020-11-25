package com.example.androidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et_id;
    Button btn_id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_id = findViewById(R.id.et_id);
        btn_id = findViewById(R.id.btn_id);

        btn_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               et_id.setText("성공 적으로 바뀌었습니다.");
            }
        });
    }
}