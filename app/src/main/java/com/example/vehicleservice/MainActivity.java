package com.example.vehicleservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txt1,txt2;
    Button btnsign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = findViewById(R.id.txtuser);
        txt2 = findViewById(R.id.txtpass);
        btnsign = findViewById(R.id.btnsign);

    }
        public void add(View view) {
            String user=txt1.getText().toString();
            String  pass=txt2.getText().toString();

            if(user.equals("ahmed")&&pass.equals("556")){
                Intent cs = new Intent(this, Services.class);
                startActivity(cs);
            }else{
                Toast.makeText(this,"Eroor",Toast.LENGTH_LONG).show();
            }
        }

}