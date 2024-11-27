package com.ute.kiemtracuoiky_duongxuanphu;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textThu = findViewById(R.id.text_thu);
        TextView textChi = findViewById(R.id.text_chi);

        textThu.setOnClickListener(v -> {
            textThu.setSelected(true);
            textChi.setSelected(false);
        });

        textChi.setOnClickListener(v -> {
            textChi.setSelected(true);
            textThu.setSelected(false);
        });

        Button button = findViewById(R.id.okButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToDashboard();
            }
        });
    }

    private void navigateToDashboard() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}