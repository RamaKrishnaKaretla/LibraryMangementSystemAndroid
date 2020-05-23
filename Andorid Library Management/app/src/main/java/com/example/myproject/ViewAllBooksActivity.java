package com.example.myproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ViewAllBooksActivity extends AppCompatActivity {


    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all_books);
        btn = findViewById(R.id.update_button);

    }

    public void updateBtnOnClick(View view) {
        Intent intent = new Intent(this,UpdateBookDetailActivity.class);
        startActivity(intent);
    }

    public void deleteBtnOnClick(View view) {
        startActivity(new Intent(this, DeleteBookRecordActivity.class));
        //Toast.makeText(this, "delete functionality", Toast.LENGTH_SHORT).show();
    }
}
