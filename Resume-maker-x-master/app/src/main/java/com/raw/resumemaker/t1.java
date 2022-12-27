package com.raw.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class t1 extends AppCompatActivity {

    TextView tvname, tvaddress, tvemail, tvphon, tvcourse, tvschool, tvgrade, tvyear, tvcomapany, tvjob, tvdescription, tvjobyear, tvskill1, tvskill2, tvskill3, tvskill4, tvgithub, tvlinkdin, tvobjective, tvcomapanyname, tvcomapanylink;
    String company_name, job, description, year, course, school, grade, eduction_year, name, email, phon, address, skill1, skill2, skill3, skill4, github, linkdin, objective, companayname, companaylink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t1);

        tvname = findViewById(R.id.tvname);
        tvemail = findViewById(R.id.tvemail);
        tvphon = findViewById(R.id.tvphon);
        tvaddress = findViewById(R.id.tvaddress);
        tvcourse = findViewById(R.id.tvcourse);
        tvschool = findViewById(R.id.tvschool);
        tvgrade = findViewById(R.id.tvgrade);
        tvyear = findViewById(R.id.tvyear);
        tvcomapany = findViewById(R.id.tvcompany);
        tvjob = findViewById(R.id.tvjob);
        tvdescription = findViewById(R.id.tvdescription);
        tvjobyear = findViewById(R.id.tvjobyear);
        tvskill1 = findViewById(R.id.tvskill1);
        tvskill2 = findViewById(R.id.tvskill2);
        tvskill3 = findViewById(R.id.tvskill3);
        tvskill4 = findViewById(R.id.tvskill4);
        tvgithub = findViewById(R.id.tvgithub);
        tvlinkdin = findViewById(R.id.tvlinkdin);
        tvobjective = findViewById(R.id.tvobjective);
        tvcomapanyname = findViewById(R.id.tvcompanyname);
        tvcomapanylink = findViewById(R.id.tvcompanylink);

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
        github = getIntent().getStringExtra("github");
        linkdin = getIntent().getStringExtra("linkdin");
        objective = getIntent().getStringExtra("objective");
        companayname = getIntent().getStringExtra("companayname");
        companaylink = getIntent().getStringExtra("companaylink");

        tvname.setText("" + name);
        tvemail.setText("" + email);
        tvphon.setText("" + phon);
        tvaddress.setText("" + address);
        tvcourse.setText("" + course);
        tvschool.setText("" + school);
        tvgrade.setText("" + grade);
        tvyear.setText("" + eduction_year);
        tvcomapany.setText("" + company_name);
        tvjob.setText("" + job);
        tvdescription.setText("" + description);
        tvjobyear.setText("" + year);
        tvskill1.setText("" + skill1);
        tvskill2.setText("" + skill2);
        tvskill3.setText("" + skill3);
        tvskill4.setText("" + skill4);
        tvgithub.setText("" + github);
        tvlinkdin.setText("" + linkdin);
        tvobjective.setText("" + objective);
        tvcomapanyname.setText("" + companayname);
        tvcomapanylink.setText("" + companaylink);

    }
}