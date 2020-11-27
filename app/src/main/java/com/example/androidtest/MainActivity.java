package com.example.androidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et_id;
    Button btn_id;
    String str;
    Button btn_move;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_id = findViewById(R.id.et_id);
        btn_id = findViewById(R.id.btn_id);
        btn_move = findViewById(R.id.btn_move);
        btn_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_id.setText("성공적으로 바뀌었습니다.");
            }
        });


        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = et_id.getText().toString();  // text를 뽑아 str = et_id해준다
                Intent intent = new Intent(MainActivity.this, SubActivity.class);  // intent객체를 만들어 이렇게 넘어간다 설정
                intent.putExtra("hint", str); // intent 객체를 이용해서 데이터를 넘겨준다
                startActivity(intent);
            }
        });
    }
}