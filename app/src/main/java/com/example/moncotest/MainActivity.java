package com.example.moncotest;

import android.content.ContentValues;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView token;
    private CallAPI callAPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        token = findViewById(R.id.id_textview_token);
        callAPI = new CallAPI(token);
    }

    @Override
    protected void onResume() {
        super.onResume();
        callAPI.execute("http://endor.ceisufro.cl:8080/api/auth/login");
    }
}


