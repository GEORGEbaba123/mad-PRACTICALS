package com.if_1.practicals.pract15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.if_1.practicals.R;
import com.if_1.practicals.pract16.Pract16Activity;

public class Pract15Activity extends AppCompatActivity {

    Button button ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pract15);


        setTitle("Practical 16");

        button = findViewById(R.id.btn_pract15_Toast);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Pract15Activity.this, "Toast Message", Toast.LENGTH_LONG).show();

            }
        });
    }
}