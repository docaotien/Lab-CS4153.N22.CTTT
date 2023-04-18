package com.example.btandroid_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtName;
    TextView txtEmail;
    TextView txtProject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName = findViewById(R.id.textName);
        txtEmail = findViewById(R.id.textEmail);
        txtProject = findViewById(R.id.textProject);
    }

    public void onClick(View view) {
        Intent iGetContactInfo = new Intent(getApplicationContext(), ViewContactInfoActivity.class);
        iGetContactInfo.putExtra("nameKey", txtName.getText().toString());
        iGetContactInfo.putExtra("emailKey", txtEmail.getText().toString());
        iGetContactInfo.putExtra("projectKey", txtProject.getText().toString());
        startActivity(iGetContactInfo);
    }
}