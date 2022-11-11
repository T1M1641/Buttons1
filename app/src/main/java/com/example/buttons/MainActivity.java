package com.example.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Enter(View view) {
        TextView text = findViewById(R.id.text1);
        text.setText("Поменяли текст");
        Toast t = Toast.makeText(this, "Урааа!!!", Toast.LENGTH_LONG);
        t.show();
        View btn2 = findViewById(R.id.btn2);
        btn2.setVisibility(View.INVISIBLE);
    }
}