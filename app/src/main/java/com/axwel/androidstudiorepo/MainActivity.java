package com.axwel.androidstudiorepo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.tvTextView);
        textView.setText(R.string.text1);

        EditText editText = findViewById(R.id.etEditText);
        editText.setBackgroundColor(R.color.color1);

        Button button = findViewById(R.id.btnButton);
        button.setText(R.string.go_to_second_screen);
        button.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, SecondActivity.class)));
    }
}