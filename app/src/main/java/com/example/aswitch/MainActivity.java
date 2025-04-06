package com.example.aswitch;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btn;
    Switch sw;
    ToggleButton tg;

    TextView txt;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn = (Button) findViewById(R.id.btn);
        sw = (Switch) findViewById(R.id.sw);
        tg = (ToggleButton) findViewById(R.id.tg);
        txt = (TextView) findViewById(R.id.txt);
        layout = findViewById(R.id.main);

    }

    public void onPush(View view) {

    }
}