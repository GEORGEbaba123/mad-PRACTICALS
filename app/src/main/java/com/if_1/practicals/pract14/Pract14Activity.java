package com.if_1.practicals.pract14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.if_1.practicals.R;

public class Pract14Activity extends AppCompatActivity {

    ListView listView ;
    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pract14);

        listView = findViewById(R.id.pract14_listView);

        ArrayAdapter adapter = new ArrayAdapter<String>(
                this,
                R.layout.pract_14_list_item,
                mobileArray);

        listView.setAdapter(adapter);


    }
}