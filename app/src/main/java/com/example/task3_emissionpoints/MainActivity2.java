package com.example.task3_emissionpoints;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn1=findViewById(R.id.Halqiyah);
        btn2=findViewById(R.id.Lahatiyah);
        btn3=findViewById(R.id.Tarfiyah);
        btn4=findViewById(R.id.Nit_eeyah);
        btn5=findViewById(R.id.Lisaveyah);
        btn6=findViewById(R.id.Ghunna);
        btn7=findViewById(R.id.Shajariyah);
        btn8=findViewById(R.id.prac);


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.Halqiyah:
                intent = new Intent(MainActivity2.this, Halqiyah.class);
                startActivity(intent);
                break;
            case R.id.Lahatiyah:
                intent = new Intent(MainActivity2.this,Lahatiyah.class);
                startActivity(intent);
                break;
            case R.id.Tarfiyah:
                intent = new Intent(MainActivity2.this,Tarfiyah.class);
                startActivity(intent);
                break;
            case R.id.Nit_eeyah:
                intent = new Intent(MainActivity2.this,Nit_eeyah.class);
                startActivity(intent);
                break;
            case R.id.Lisaveyah:
                intent = new Intent(MainActivity2.this,Lisaveyah.class);
                startActivity(intent);
                break;
            case R.id.Ghunna:
                intent = new Intent(MainActivity2.this,Ghunna.class);
                startActivity(intent);
                break;
            case R.id.Shajariyah:
                intent = new Intent(MainActivity2.this,Shajariyah.class);
                startActivity(intent);
                break;
            case R.id.prac:
                intent = new Intent(MainActivity2.this,Practise.class);
                startActivity(intent);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }
    }
}