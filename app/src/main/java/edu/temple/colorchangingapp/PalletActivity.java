package edu.temple.colorchangingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class PalletActivity extends AppCompatActivity {
    GridView gridView;
    String[] colors = {"Blue","Red","Yellow","Grey","Aqua","Fuchsia","Teal","Green","Cyan","Magenta","Maroon"};

    public static final String COLOR_KEY = "colorkey";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Pallet Activity");

        gridView = findViewById(R.id.gridView);
        gridView.setNumColumns(3);

        gridView.setAdapter(new ColorAdapter(this, colors));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                PalletActivity.this.startActivity(new Intent(PalletActivity.this, CanvasActivity.class).putExtra(COLOR_KEY, parent.getItemAtPosition(position).toString()));
            }
        });
    }

}