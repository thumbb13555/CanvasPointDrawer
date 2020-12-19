package com.jetec.canvaspointdrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btClear,btRed,btBlue,btGreen;
        MyCanvasView canvasView = findViewById(R.id.myCanvasView);
        btClear = findViewById(R.id.button_Clear);
        btGreen = findViewById(R.id.button_Green);
        btBlue = findViewById(R.id.button_Blue);
        btRed = findViewById(R.id.button_Red);

        btClear.setOnClickListener(v->{ canvasView.clear(); });
        btGreen.setOnClickListener(v -> {canvasView.setColor(Color.GREEN);});
        btBlue.setOnClickListener(v -> {canvasView.setColor(Color.BLUE);});
        btRed.setOnClickListener(v -> {canvasView.setColor(Color.RED);});

    }
}