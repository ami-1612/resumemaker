package com.raw.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class eduction extends AppCompatActivity {

    String name, email, phon, address, course, school, grade, eduction_year;
    EditText edcourse, edschool, edgrade, edyear;
    Button reset, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eduction);

        edcourse = findViewById(R.id.edcourse);
        edschool = findViewById(R.id.edschool);
        edgrade = findViewById(R.id.edgrade);
        edyear = findViewById(R.id.edyear);
        reset = findViewById(R.id.reset);
        next = findViewById(R.id.next);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edcourse.setText("");
                edschool.setText("");
                edgrade.setText("");
                edyear.setText("");
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                course = edcourse.getText().toString();
                school = edschool.getText().toString();
                grade = edgrade.getText().toString();
                eduction_year = edyear.getText().toString();


                name = getIntent().getStringExtra("name");
                email = getIntent().getStringExtra("email");
                phon = getIntent().getStringExtra("phon");
                address = getIntent().getStringExtra("address");

                Intent intent = new Intent(eduction.this, experiencce.class);


                intent.putExtra("name", name);
                intent.putExtra("email", email);
                intent.putExtra("phon", phon);
                intent.putExtra("address", address);
                intent.putExtra("course", course);
                intent.putExtra("school", school);
                intent.putExtra("grade", grade);
                intent.putExtra("eduction_year", eduction_year);

                startActivity(intent);

            }
        });

    }
}