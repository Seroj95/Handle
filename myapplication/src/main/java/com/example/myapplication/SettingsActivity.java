package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SettingsActivity extends AppCompatActivity implements View.OnClickListener {
private   EditText redEditText;
   private EditText blueEditText;
    private EditText grennEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        redEditText= findViewById(R.id.red_edit_text);
        blueEditText= findViewById(R.id.blue_edit_text);
        grennEditText= findViewById(R.id.green_edit_text);
       findViewById(R.id.botton).setOnClickListener(this);
        SharedPreferences preferences = getPreferences(MODE_PRIVATE);

       int red= preferences.getInt("red",0);
       int green= preferences.getInt("green",0);
       int blue= preferences.getInt("blue",0);


       redEditText.setText(String.valueOf(red));
      grennEditText.setText(String.valueOf(green));
      blueEditText.setText(String.valueOf(blue));
    }

    @Override
    public void onClick(View v) {
        final SharedPreferences preferences = getPreferences(MODE_PRIVATE);
        final SharedPreferences.Editor edit = preferences.edit();
        final int red = Integer.parseInt(redEditText.getText().toString());
        final int green = Integer.parseInt(grennEditText.getText().toString());
        final int blue = Integer.parseInt(blueEditText.getText().toString());
        edit.putInt("red", red);
        edit.putInt("green", green);
        edit.putInt("blue", blue);
        edit.commit();

        final Intent intent = new Intent();
        intent.putExtra("nor", Color.rgb(red, green, blue));
        setResult(RESULT_OK, intent);
        finish();
    }
}
