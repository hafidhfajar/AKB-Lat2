package com.example.bloodshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

public class Register extends AppCompatActivity {



    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText username = (EditText) findViewById(R.id.editText3);
        ImageButton submit = (ImageButton) findViewById(R.id.imageButton2);
        final Spinner spnamen = (Spinner) findViewById(R.id.sp_name);
        final CheckBox cek = (CheckBox) findViewById(R.id.checkBox);

        submit.setOnClickListener(new View.OnClickListener() {

                                        @Override
                                        public void onClick(View v) {

                                            //lempar value


                                            if (username.getText().toString().length() == 0) {
                                                //jika belum di isi / masih kosong
                                                username.setError("Username is Required");
                                            }
                                            /**else if (blood1.equals("Blood Type")) {
                                                Toast.makeText(getApplicationContext(), "Blood Type is Required",
                                                        Toast.LENGTH_LONG).show();
                                            }*/
                                            else if(!cek.isChecked()){
                                                Toast.makeText(getApplicationContext(), "You Must Agree with the terms and conditions",
                                                        Toast.LENGTH_LONG).show();
                                            }else
                                                {
                                                  /**  String var_nama = username.getText().toString();

                                                    Bundle b = new Bundle();
                                                    b.putString("parse_nama", var_nama);
                                                    i.putExtras(b);*/
                                                    Intent i = new Intent(Register.this, Almost.class);
                                                    startActivity(i);

                                            }
                                        }
                                    });



    }
}
        