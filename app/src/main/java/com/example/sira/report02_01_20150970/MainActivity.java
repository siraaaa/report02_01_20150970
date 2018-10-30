package com.example.sira.report02_01_20150970;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

// 과제02
// 작성일: 2018.10.30
// 작성자: 01분반 20150970 김시라
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v){
        Intent intent = null;
        switch (v.getId()){
            case R.id.btnMap:
                intent = new Intent(this, MapsActivity.class);
                break;
        }
        if (intent != null) startActivity(intent);
    }
}
