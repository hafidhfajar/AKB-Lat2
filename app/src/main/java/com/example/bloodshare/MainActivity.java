/**
    Nama    :   Hafidh Fajar A
    Kelas   :   AKB-4
    NIM     :   10117131
    Update Pengerjaan :
        - Rabu, 15 April 2020   : -Membuat layout welcome,register,almost,verify
        - Kamis, 16 April 2020  : -Membuat layout Home
                                  -Membuat fungsi pindah activity
                                  -Membuat fungsi validasi username,checkbox
                                  -Mencoba Membuat valisadi Spinner blood tyoe
        -Jum'at, 17 April 2020  : -Masih Mencoba Membuat Validasi Spinner
                                  -Mencoba parsing value ke menu home (gagal :( )
                                  -Finishing
                                  -Upload ke github
 */


package com.example.bloodshare;

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
    public void pindahregister(View view) {
        Intent i = new Intent(MainActivity.this, Register.class); //MainActivity adalah aktivity awal ,praktikum1Activity activity yang akan di tuju
        startActivity(i);
    }
}
