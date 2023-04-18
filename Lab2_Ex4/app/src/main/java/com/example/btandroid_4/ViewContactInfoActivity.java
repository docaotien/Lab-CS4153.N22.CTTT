package com.example.btandroid_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ViewContactInfoActivity extends AppCompatActivity {

    TextView txtNameValue;
    TextView txtEMailValue;
    TextView txtProjectValue;

    Button finishBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_contact_info);
        Intent intent =getIntent();

        txtNameValue =(TextView)findViewById(R.id.textNameValue);
        txtEMailValue =(TextView)findViewById(R.id.textEmailValue);
        txtProjectValue =(TextView)findViewById(R.id.textProjectValue);

        finishBtn=(Button) findViewById(R.id.finish);
        finishBtn.setOnClickListener(mClickListener);


        txtNameValue.setText(intent.getStringExtra("nameKey")); ;
        txtEMailValue.setText(intent.getStringExtra("emailKey")) ;
        txtProjectValue.setText(intent.getStringExtra("projectKey"));
    }

    private View.OnClickListener mClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finish();
        }
    };
}