package com.example.androidtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerViewEx extends AppCompatActivity {
    private ArrayList<Maindata> arrayList;
    private MainAdapter mainAdapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_ex);

        recyclerView = (RecyclerView) findViewById(R.id.rv);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        arrayList = new ArrayList<>();
        mainAdapter = new MainAdapter(arrayList);
        recyclerView.setAdapter(mainAdapter);
        for(int i = 0;i<10;i++){
            Maindata mainData = new Maindata(R.mipmap.ic_launcher, "홍드로이드", "리사이클러뷰"+i);
            arrayList.add(mainData);
        }
    }
}