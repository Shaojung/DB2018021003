package com.example.student.db2018021003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> mydata;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mydata = new ArrayList<>();
        mydata.add("AA");
        mydata.add("Apple");
        mydata.add("橘子");
        mydata.add("西瓜");
        mydata.add("BB");
        mydata.add("CC");
        lv = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
        android.R.layout.simple_list_item_1, mydata);

        lv.setAdapter(adapter);

    }
}
