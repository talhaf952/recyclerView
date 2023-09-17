package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=findViewById(R.id.recyclerView);

        List<Item> items=new ArrayList<Item>();
        items.add(new Item("Rana","rana@gmail.com",R.drawable.a));
        items.add(new Item("Muhammad","muhammad@gmail.com",R.drawable.b));
        items.add(new Item("Talha","talha@gmail.com",R.drawable.c));
        items.add(new Item("Farooq","farooq@gmail.com",R.drawable.d));
        items.add(new Item("Saddique","saddique@gmail.com",R.drawable.e));
        items.add(new Item("Abdul Rehman","abdulrehman@gmail.com",R.drawable.f));
        items.add(new Item("Rana","rana@gmail.com",R.drawable.a));
        items.add(new Item("Muhammad","muhammad@gmail.com",R.drawable.b));
        items.add(new Item("Talha","talha@gmail.com",R.drawable.c));
        items.add(new Item("Farooq","farooq@gmail.com",R.drawable.d));
        items.add(new Item("Saddique","saddique@gmail.com",R.drawable.e));
        items.add(new Item("Abdul Rehman","abdulrehman@gmail.com",R.drawable.f));
        items.add(new Item("Rana","rana@gmail.com",R.drawable.a));
        items.add(new Item("Muhammad","muhammad@gmail.com",R.drawable.b));
        items.add(new Item("Talha","talha@gmail.com",R.drawable.c));
        items.add(new Item("Farooq","farooq@gmail.com",R.drawable.d));
        items.add(new Item("Saddique","saddique@gmail.com",R.drawable.e));
        items.add(new Item("Abdul Rehman","abdulrehman@gmail.com",R.drawable.f));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}