package com.example.tugasapk;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class inputnama extends AppCompatActivity {

    EditText TextNama;
    TextView Hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inputnama);
        //Panggil Variabel Berdasarkan id

        TextNama=(EditText)findViewById(R.id.nama);
        Hasil=(TextView)findViewById(R.id.textView2);
    }

    //Buat Method TampilNama Sesuai Dengan property Onclick pada button

    public void tampilkan(View v){
        Hasil.setText("Nama Anda: "+TextNama.getText());
    }


///// udh beda
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.pilihan, menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.calulator) {
            startActivity(new Intent(this, calculator.class));
        } else if (item.getItemId() == R.id.inputnama) {
            startActivity(new Intent(this, inputnama.class));
        } else if (item.getItemId() == R.id.listkota) {
            startActivity(new Intent(this, listkota.class));
        }
        return true;
    }
}