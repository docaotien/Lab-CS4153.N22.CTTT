package com.example.btandroid_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView im= (ImageView) findViewById(R.id.img);
        registerForContextMenu(im);
    }

    @Override
    public  boolean onCreateOptionsMenu(Menu menu){
        MenuInflater im=getMenuInflater();
        im.inflate(R.menu.option_menu,menu);
        return  true;
    }
    @Override
    public  boolean onContextItemSelected(MenuItem item){
        Toast.makeText(MainActivity.this,item.getTitle(),Toast.LENGTH_SHORT).show();
        return true;
    }


}