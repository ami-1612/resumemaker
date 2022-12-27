package com.raw.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class personal extends AppCompatActivity {

    String name, email, phon, address;
    EditText edname, edemail, edphon, edaddress;
    Button reset, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);

        edname = findViewById(R.id.edname);
        edemail = findViewById(R.id.edemail);
        edphon = findViewById(R.id.edphon);
        edaddress = findViewById(R.id.edaddress);
        reset = findViewById(R.id.reset);
        next = findViewById(R.id.next);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edname.setText("");
                edemail.setText("");
                edphon.setText("");
                edaddress.setText("");
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name = edname.getText().toString();
                email = edemail.getText().toString();
                phon = edphon.getText().toString();
                address = edaddress.getText().toString();

                Intent intent = new Intent(personal.this, eduction.class);
                intent.putExtra("name", name);
                intent.putExtra("email", email);
                intent.putExtra("phon", phon);
                intent.putExtra("address", address);
                startActivity(intent);

            }
        });
    }
    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(personal.this);
        builder.setMessage("Do you want to exit back in home page?");
        builder.setTitle("Alert !");
        builder.setCancelable(false);
        AlertDialog.Builder builder1 = builder.setPositiveButton("Yes", (DialogInterface.OnClickListener) (dialog, which) -> {
            Toast.makeText(personal.this, "yes clicked", Toast.LENGTH_SHORT).show();
            finish();
        });
        builder.setNegativeButton("No", (DialogInterface.OnClickListener) (dialog, which) -> {
            Toast.makeText(personal.this, "No clicked", Toast.LENGTH_SHORT).show();
            dialog.cancel();
        });
        builder.setNeutralButton("cancle", (DialogInterface.OnClickListener) (dialog, which) -> {
            Toast.makeText(personal.this, "Cancle clicked", Toast.LENGTH_SHORT).show();
            dialog.cancel();
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}