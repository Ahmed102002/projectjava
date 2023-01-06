package com.example.vehicleservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Services extends AppCompatActivity {
    ImageButton btnEdit,btnrepair,btnnew;

    // btnrepair = findViewById(R.id.btnEdit);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
        btnEdit=findViewById(R.id.btnEdit);
        btnrepair=findViewById(R.id.btnrepair);
        btnnew=findViewById(R.id.btnnew);
        btnnew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),new_car.class);
                startActivity(i);
            }
        });
        btnrepair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),repair.class);
                startActivity(i);
            }

        });


        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Edit.class);
                startActivity(i);
            }
        });
    }
}