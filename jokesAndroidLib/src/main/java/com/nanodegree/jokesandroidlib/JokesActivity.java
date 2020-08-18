package com.nanodegree.jokesandroidlib;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class JokesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);

        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().add(R.id.container,new JokesActivityFragment()).commit();
        }
    }
}
