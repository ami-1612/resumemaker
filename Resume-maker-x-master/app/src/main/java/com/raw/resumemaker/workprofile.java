package com.raw.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class workprofile extends AppCompatActivity {

    String company_name,job,description,year,course,school,grade,eduction_year,name,email,phon,address,skill1,skill2,skill3,skill4,github,linkdin;
    EditText edgithub,edlinkdin;
    Button reset,next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workprofile);

            edgithub = findViewById(R.id.edgithub);
            edlinkdin = findViewById(R.id.edlinkdin);
            reset = findViewById(R.id.reset);
            next = findViewById(R.id.next);

            reset.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    edgithub.setText("");
                    edlinkdin.setText("");
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
                    skill1 = getIntent().getStringExtra("skill1");
                    skill2 = getIntent().getStringExtra("skill2");
                    skill3 = getIntent().getStringExtra("skill3");
                    skill4 = getIntent().getStringExtra("skill4");

                    github = edgithub.getText().toString();
                    linkdin = edlinkdin.getText().toString();

                    Intent intent = new Intent(workprofile.this,objective.class);

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
                    intent.putExtra("github", github);
                    intent.putExtra("linkdin", linkdin);

                    startActivity(intent);

                }
            });

    }
}