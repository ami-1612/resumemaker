package com.raw.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homeactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button create, exit;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeactivity);

        create = findViewById(R.id.create);
        exit = findViewById(R.id.exit);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homeactivity.this, personal.class);
                startActivity(intent);
            }
        });
    }
}