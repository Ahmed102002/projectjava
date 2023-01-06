package com.example.vehicleservice;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class repair extends AppCompatActivity {
    Button btn;
    EditText txttype,txtnumber,txtphone,txtData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repair);
        btn=findViewById(R.id.btnsubmit);
        txttype=findViewById(R.id.txtcartype);
        txtnumber=findViewById(R.id.txtnumber);
        txtphone=findViewById(R.id.editTextPhone);
        txtData=findViewById(R.id.editTextDate);
        txttype=findViewById(R.id.txtcartype);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String type=txttype.getText().toString();
                String number=txtnumber.getText().toString();
                String phone=txtphone.getText().toString();
                String data=txtData.getText().toString();

                AlertDialog.Builder malert = new AlertDialog.Builder(repair.this);
                malert.setTitle("title");
                malert.setMessage("Your msg");
                malert.setCancelable(false);

                malert.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Missed", Toast.LENGTH_LONG).show();
                    }
                });

                malert.setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "done", Toast.LENGTH_LONG).show();
                    }
                });

                malert.show();
            }
        });
    }
}