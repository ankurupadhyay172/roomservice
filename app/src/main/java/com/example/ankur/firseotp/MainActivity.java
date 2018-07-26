package com.example.ankur.firseotp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
        Button send,place;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send = (Button)findViewById(R.id.send);
        place =(Button)findViewById(R.id.place);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent map = new Intent(MainActivity.this,MapsActivity.class);
                startActivity(map);
            }
        });

        place.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent autocomplete = new Intent(MainActivity.this,autocomplete.class);
                startActivity(autocomplete);
            }
        });
    }
}
