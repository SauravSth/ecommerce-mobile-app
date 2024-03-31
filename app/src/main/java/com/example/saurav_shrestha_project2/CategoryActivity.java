package com.example.saurav_shrestha_project2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class CategoryActivity extends AppCompatActivity {
    RecyclerView recyclerView_Category;
    ArrayList<Category_RecyclerView_List> categoryList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        recyclerView_Category = findViewById(R.id.recyclerView_Category);
        recyclerView_Category.setHasFixedSize(true);
        recyclerView_Category.setLayoutManager(new GridLayoutManager(this, 2));

        categoryList = new ArrayList<Category_RecyclerView_List>();
        categoryList.add(new Category_RecyclerView_List(R.drawable.headphone, "Headphones"));
        categoryList.add(new Category_RecyclerView_List(R.drawable.keyboard, "Keyboard"));
        categoryList.add(new Category_RecyclerView_List(R.drawable.monitor, "Monitor"));
        categoryList.add(new Category_RecyclerView_List(R.drawable.mouse, "Mouse"));
        categoryList.add(new Category_RecyclerView_List(R.drawable.mousepad, "Mouse pad"));
        categoryList.add(new Category_RecyclerView_List(R.drawable.laptop, "Laptop"));

        RecyclerView_Adapter rvAdapter = new RecyclerView_Adapter(categoryList, this);
        recyclerView_Category.setAdapter(rvAdapter);
    }
}