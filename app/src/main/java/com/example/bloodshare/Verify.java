package com.example.bloodshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Verify extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
    }
    public void pindah(View view) {
        Intent i = new Intent(Verify.this, Home.class);
        startActivity(i);
    }
}
