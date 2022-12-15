package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ListView myListView = (ListView)findViewById(R.id.myListView);
//
//        ArrayList<String> myfamily = new ArrayList<String>();
//
//        myfamily.add("Anusha");
//        myfamily.add("Ansh");
//        myfamily.add("Bachuo");
//
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myfamily);
//
//        myListView.setAdapter(arrayAdapter);
//
//        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
//                //parent.setVisibility(View.GONE);
//                Log.i("Person Tapped", myfamily.get(i));
//            }
//        });
        ListView myListView = (ListView)findViewById(R.id.myListView);

        ArrayList<String> myfriends = new ArrayList<String>(asList("Kajal", "Meemansa", "khushi", "Venna", "Sanya"));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myfriends);
        myListView.setAdapter(arrayAdapter);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText("Hello" + myfriends.get(i), Toast.LENGTH_LONG).show();
            }
        });
    }
}