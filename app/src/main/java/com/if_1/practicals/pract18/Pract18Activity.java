package com.if_1.practicals.pract18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.if_1.practicals.R;

public class Pract18Activity extends AppCompatActivity {


    Button btn_Navigation , btn_Dialer ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pract18);

        setTitle("Practical 18");

        btn_Navigation = findViewById(R.id.btn_pract18_Navigation);
        btn_Dialer = findViewById(R.id.btn_pract18_Dialer);

        btn_Navigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW , Uri.parse("https://www.google.com/"));
                startActivity(intent);
            }
        });

        btn_Dialer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                startActivity(intent);
            }
        });


    }
}