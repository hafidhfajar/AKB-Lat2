package com.example.bloodshare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        /**TextView nama1 = (TextView) findViewById(R.id.textView13);
        TextView nama2 = (TextView) findViewById(R.id.textView14);

        Bundle b = getIntent().getExtras();

        String get_nama = b.getString("parse_nama");
        nama1.setText(" "+get_nama);
       nama2.setText(" "+get_nama);*/
    }
}
