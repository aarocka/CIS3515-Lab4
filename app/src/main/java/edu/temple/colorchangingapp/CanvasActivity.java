package edu.temple.colorchangingapp;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CanvasActivity extends AppCompatActivity {
    @Override
    protected void onCreate(/*@Nullable*/ Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_canvas);

        String color = getIntent().getStringExtra(PalletActivity.COLOR_KEY);

        ((TextView) findViewById(R.id.colorDisplayTextView)).setText(color);

        findViewById(R.id.container).setBackgroundColor(Color.parseColor(color));

    }
}
