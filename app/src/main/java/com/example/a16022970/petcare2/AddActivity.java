package com.example.a16022970.petcare2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {

    EditText etName, etBreed;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

     etName = (EditText)findViewById(R.id.editText);
     etBreed = (EditText)findViewById(R.id.editText2);

     btnAdd = (Button) findViewById(R.id.btnAdd);

     btnAdd.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
         //add to database and add to the list in main activity
             Intent intent = new Intent(AddActivity.this,MainActivity.class);
             intent.putExtra("name",etName.getText().toString());
             intent.putExtra("breed",etBreed.getText().toString());
             startActivity(intent);

         }
     });

    }



}
