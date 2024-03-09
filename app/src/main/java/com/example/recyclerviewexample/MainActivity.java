package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    RecyclerView recylerView;
    ArrayList<MyDataSet> dataSets= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recylerView = findViewById(R.id.recyler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recylerView.setLayoutManager(linearLayoutManager);

        dataSets.add(new MyDataSet("Card1",R.drawable.ic_launcher_background,"Red"));
        dataSets.add(new MyDataSet("Card2",R.drawable.ic_launcher_background,"Yellow"));
        dataSets.add(new MyDataSet("Card3",R.drawable.ic_launcher_background,"Black"));

        MyAdapter myAdapter = new MyAdapter(dataSets);
        recylerView.setAdapter(myAdapter);
    }
}