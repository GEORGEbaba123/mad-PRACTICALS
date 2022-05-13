package com.if_1.practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.if_1.practicals.pract13.Pract13Activity;
import com.if_1.practicals.pract14.Pract14Activity;
import com.if_1.practicals.pract15.Pract15Activity;
import com.if_1.practicals.pract16.Pract16Activity;
import com.if_1.practicals.pract17.Pract17Activity;
import com.if_1.practicals.pract18.Pract18Activity;
import com.if_1.practicals.pract19.Pract19Activity;
import com.if_1.practicals.pract20.Pract20Activity;
import com.if_1.practicals.pract21.Pract21Activity;
import com.if_1.practicals.pract22.Pract22Activity;
import com.if_1.practicals.pract5.LinearLayoutActivity;
import com.if_1.practicals.pract6.FrameLayoutActivity;

public class MainActivity extends AppCompatActivity {

    Button button5 , button6 , button7, button8 , button9 ,button10 ,button11 ,
            button12,  button13 , button14  , button15 , button16 , button17 , button18,
            button19 , button20 , button21 , button22 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initiate();

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this
                        , LinearLayoutActivity.class));

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this
                        , FrameLayoutActivity.class));
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this
                        , Pract13Activity.class));
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this
                        , Pract14Activity.class));

            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this
                        , Pract15Activity.class));
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this
                        , Pract16Activity.class));

            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                startActivity(new Intent(MainActivity.this , Pract17Activity.class));

            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this , Pract18Activity.class));
            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this , Pract19Activity.class));
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this , Pract20Activity.class));
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this , Pract21Activity.class));
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this , Pract22Activity.class));
            }
        });
    }


    private void initiate (){

        button5 = findViewById(R.id.btn_pract5);
        button6 = findViewById(R.id.btn_pract6);
        button7 = findViewById(R.id.btn_pract7);
        button8 = findViewById(R.id.btn_pract8);
        button9 = findViewById(R.id.btn_pract9);
        button10 = findViewById(R.id.btn_pract10);
        button11 = findViewById(R.id.btn_pract11);
        button12 = findViewById(R.id.btn_pract12);
        button13 = findViewById(R.id.btn_pract13);
        button14 = findViewById(R.id.btn_pract14);
        button15 = findViewById(R.id.btn_pract15);
        button16 = findViewById(R.id.btn_pract16);
        button17 = findViewById(R.id.btn_pract17);
        button18 = findViewById(R.id.btn_pract18);
        button19 = findViewById(R.id.btn_pract19);
        button20 = findViewById(R.id.btn_pract20);
        button21 = findViewById(R.id.btn_pract21);
        button22 = findViewById(R.id.btn_pract22);

    }
}