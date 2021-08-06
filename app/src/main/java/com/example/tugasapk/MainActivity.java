package com.example.tugasapk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tombol = (Button) findViewById(R.id.inp);
        Button tombol1= (Button) findViewById(R.id.cal);
        Button tombol2= (Button) findViewById(R.id.lis);
        //tombol input nama
        tombol.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputnama.class);
                startActivity(intent);
            }
        });

        //tombol calculator
        tombol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, calculator.class);
                startActivity(intent);
            }
        });

        //tombol list kota
        tombol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, listkota.class);
                startActivity(intent);
            }
        });

    }
}