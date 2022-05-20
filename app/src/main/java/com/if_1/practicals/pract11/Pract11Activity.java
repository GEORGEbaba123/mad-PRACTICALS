package com.if_1.practicals.pract11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.if_1.practicals.R;

public class Pract11Activity extends AppCompatActivity {

    CheckBox    checkBoxBurger , checkBoxPizza , checkBoxCoffee ;
    Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pract11);

        checkBoxBurger= findViewById(R.id.chk_burger_pract11);
        checkBoxPizza= findViewById(R.id.chk_pizza_pract11);
        checkBoxCoffee= findViewById(R.id.chk_coffee_pract11);
        buttonSubmit= findViewById(R.id.btn_submit_pract11);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tAmount = 0 ;

                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Item Selected :");

                if (checkBoxPizza.isChecked()){
                    stringBuilder.append("\n Pizza");
                    tAmount += 100 ;
                }

                if (checkBoxBurger.isChecked()){
                    stringBuilder.append("\n Burger");
                    tAmount += 50 ;
                }

                if (checkBoxCoffee.isChecked()){

                    stringBuilder.append("\n Coffee");
                    tAmount += 60 ;

                }

                stringBuilder.append("\n Total Amount : " + tAmount + "RS");

                Toast.makeText(Pract11Activity.this,
                        stringBuilder.toString(),
                        Toast.LENGTH_LONG).show();

            }
        });


    }
}