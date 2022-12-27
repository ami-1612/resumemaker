package com.raw.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class experiencce extends AppCompatActivity {

    String company_name, job, description, year, course, school, grade, eduction_year, name, email, phon, address;
    EditText edcompany_name, edjob, eddescription, edyear;
    Button reset, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiencce);

        edcompany_name = findViewById(R.id.edcompany_name);
        edjob = findViewById(R.id.edjob);
        eddescription = findViewById(R.id.eddescription);
        edyear = findViewById(R.id.edyear);
        reset = findViewById(R.id.reset);
        next = findViewById(R.id.next);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edcompany_name.setText("");
                edjob.setText("");
                eddescription.setText("");
                edyear.setText("");
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                name = getIntent().getStringExtra("name");
                email = getIntent().getStringExtra("email");
                phon = getIntent().getStringExtra("phon");
                address = getIntent().getStringExtra("address");
                course = getIntent().getStringExtra("course");
                school = getIntent().getStringExtra("school");
                grade = getIntent().getStringExtra("grade");
                eduction_year = getIntent().getStringExtra("eduction_year");

                company_name = edcompany_name.getText().toString();
                job = edjob.getText().toString();
                description = eddescription.getText().toString();
                year = edyear.getText().toString();

                Intent intent = new Intent(experiencce.this, skill.class);

                intent.putExtra("name", name);
                intent.putExtra("email", email);
                intent.putExtra("phon", phon);
                intent.putExtra("address", address);
                intent.putExtra("course", course);
                intent.putExtra("school", school);
                intent.putExtra("grade", grade);
                intent.putExtra("eduction_year", eduction_year);
                intent.putExtra("company_name", company_name);
                intent.putExtra("job", job);
                intent.putExtra("description", description);
                intent.putExtra("year", year);

                startActivity(intent);

            }
        });

    }
}