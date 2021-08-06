package com.example.tugasapk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;


public class listkota extends AppCompatActivity {

    private String[] kota = {"AMBON","BALIKPAPAN","BANDA ACEH","BANDAR LAMPUNG","BANDUNG",
            "BANJAR","BANJARBARU","BANJARMASIN","BATAM","BATU"};

    //ArrayList digunakan Untuk menampung Data KOTA
    private ArrayList<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listkota);
        ListView listView = findViewById(R.id.list);
        data = new ArrayList<>();
        getData();
        ArrayAdapter adapter = new ArrayAdapter<>(this, R.layout.untuklist, data);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String kotanya = data.get(position);
                Toast.makeText(getApplicationContext(), "kota yang anda pilih adalah  "+kotanya, Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void getData(){
        //Memasukan Semua Data kota kedalam ArrayList
        Collections.addAll(data, kota);
    }




    //beda
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.pilihan, menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.calulator){
            startActivity(new Intent(this, calculator.class));
        } else if (item.getItemId() == R.id.inputnama) {
            startActivity(new Intent(this, inputnama.class));
        } else if (item.getItemId() == R.id.listkota) {
            startActivity(new Intent(this, listkota.class));
        }

        return true;
    }
}