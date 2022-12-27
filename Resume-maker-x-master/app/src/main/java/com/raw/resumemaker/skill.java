package com.raw.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class skill extends AppCompatActivity {

    String company_name, job, description, year, course, school, grade, eduction_year, name, email, phon, address, skill1, skill2, skill3, skill4;
    EditText edskill1, edskill2, edskill3, edskill4;
    Button reset, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill);

        edskill1 = findViewById(R.id.edskill1);
        edskill2 = findViewById(R.id.edskill2);
        edskill3 = findViewById(R.id.edskill3);
        edskill4 = findViewById(R.id.edskill4);
        reset = findViewById(R.id.reset);
        next = findViewById(R.id.next);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edskill1.setText("");
                edskill2.setText("");
                edskill3.setText("");
                edskill4.setText("");
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
                company_name = getIntent().getStringExtra("company_name");
                job = getIntent().getStringExtra("job");
                description = getIntent().getStringExtra("description");
                year = getIntent().getStringExtra("year");

                skill1 = edskill1.getText().toString();
                skill2 = edskill2.getText().toString();
                skill3 = edskill3.getText().toString();
                skill4 = edskill4.getText().toString();

                Intent intent = new Intent(skill.this, workprofile.class);

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
                intent.putExtra("skill1", skill1);
                intent.putExtra("skill2", skill2);
                intent.putExtra("skill3", skill3);
                intent.putExtra("skill4", skill4);

                startActivity(intent);

            }
        });

    }
}