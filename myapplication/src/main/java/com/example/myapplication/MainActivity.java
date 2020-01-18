package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//private EditText nameEditText;
//   private EditText surname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
findViewById(R.id.open_settings).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivityForResult(new Intent(this,SettingsActivity.class),0);

    }
//public void opentTetris(){
//    startActivityForResult(new Intent(this,SettingsActivity.class),1);
//    }
//}
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode==0){
       int color= data.getIntExtra("nor", Color.YELLOW);
        findViewById(R.id.linearLayout).setBackgroundColor(color);
    }
}
