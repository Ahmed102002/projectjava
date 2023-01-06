package com.example.vehicleservice;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class new_car extends AppCompatActivity {
    ImageView mg,mc,nisian,cet,golf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_car);
    mg=findViewById(R.id.imageView2);
    mc=findViewById(R.id.imageView3);
    nisian=findViewById(R.id.imageView4);
    cet=findViewById(R.id.imageView5);
        mg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder malert = new AlertDialog.Builder(new_car.this);
                malert.setTitle("title");
                malert.setMessage("MG موديل 2018 سبورت سعرها 5000000\n");
                malert.setCancelable(false);

                malert.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "done", Toast.LENGTH_LONG).show();
                    }
                });

                malert.setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Select other", Toast.LENGTH_LONG).show();
                    }
                });malert.show();
            }
        });
        mc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder malert = new AlertDialog.Builder(new_car.this);
                malert.setTitle("title");
                malert.setMessage("Benz 2017 سعرها 7000000\n");
                malert.setCancelable(false);

                malert.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "done", Toast.LENGTH_LONG).show();
                    }
                });

                malert.setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Select other", Toast.LENGTH_LONG).show();
                    }
                });malert.show();
            }
        });
        cet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder malert = new AlertDialog.Builder(new_car.this);
                malert.setTitle("title");
                malert.setMessage("Golf 2015 سعرها 300000");
                malert.setCancelable(false);

                malert.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "done", Toast.LENGTH_LONG).show();
                    }
                });

                malert.setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Select other", Toast.LENGTH_LONG).show();
                    }
                });malert.show();
            }
        });
        nisian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder malert = new AlertDialog.Builder(new_car.this);
                malert.setTitle("title");
                malert.setMessage("Citroen 2018 سعرها 800000");
                malert.setCancelable(false);

                malert.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "done", Toast.LENGTH_LONG).show();
                    }
                });

                malert.setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Select other", Toast.LENGTH_LONG).show();
                    }
                });malert.show();
            }
        });

    }
}