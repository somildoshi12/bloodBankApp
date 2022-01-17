package com.example.bloodbankapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity4 extends AppCompatActivity {

    Button btn_login;
    EditText user,pass;
    Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        if(Build.VERSION.SDK_INT >= 21) {
            window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.black));
        }

        user = findViewById(R.id.editTextTextPersonName);
        pass = findViewById(R.id.editTextTextPersonName2);

        btn_login = findViewById(R.id.button4);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user0 = user.getText().toString();
                String pass0 = pass.getText().toString();

                if(user0.equals("nidhishah") && pass0.equals("partner")){

                    Intent intent = new Intent(MainActivity4.this,MainActivity5.class);
                    startActivity(intent);
                }
                else{
                    //Toast.makeText(MainActivity4.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(MainActivity4.this,MainActivity6.class);
                    startActivity(intent);
                }
            }
        });
    }
}