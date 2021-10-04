package com.vincent.buttonlistner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    public void onClick(View view) {
    switch (view.getId()){

        case R.id.btn:

            Toast.makeText(this, "Hello Button Clicked", Toast.LENGTH_SHORT).show();
            break;
        default:
            break;
    }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("hej", "Activity created! ");


        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(this);
        /*btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Hello");
            }
        });*/
    }


}