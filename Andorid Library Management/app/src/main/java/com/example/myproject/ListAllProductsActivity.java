package com.example.myproject;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myproject.Adapters.ListAdapter;
import com.example.myproject.Entity.LibraryPOJO;

import java.util.ArrayList;

public class ListAllProductsActivity extends AppCompatActivity {

    ListView listView;
    Context context;
    ArrayList arrayList;
    ArrayList<LibraryPOJO> libraryList = new ArrayList<>();
    DbManager dbManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_all_products);

        listView = (ListView) findViewById(R.id.list_ItemsView);

        dbManager = new DbManager(ListAllProductsActivity.this);

        libraryList = dbManager.getAllBooks();

        ListAdapter listAdapter = new ListAdapter(ListAllProductsActivity.this, R.id.gone, libraryList);
        listView.setAdapter(listAdapter);
    }
    @Override
    public void onBackPressed() {
        return;
    }
}
