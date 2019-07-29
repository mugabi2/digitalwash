package com.example.samuelhimself.digitalwash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loginPage(View v){
        Intent intkukps=new Intent(MainActivity.this,login.class);
        startActivity(intkukps);
    }
}
