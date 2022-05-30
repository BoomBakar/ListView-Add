package com.example.listviewadd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> Friends = new ArrayList<String>();
    ListView Lv;
    Button bt;
    TextView editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Friends.add("Adil");
        Friends.add("Anns");
        Friends.add("Usman");
        Friends.add("Ahmad");
        Friends.add("Saad");

        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, Friends);
        Lv = findViewById(R.id.listview);
        Lv.setAdapter(adapter);
        bt =  findViewById(R.id.add);
        editText = findViewById(R.id.edit);
        Lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                editText.setText("You selected " + Friends.get(i));
            }
        });
    }
}