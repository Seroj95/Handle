package com.example.nareglist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ListView;

import com.example.nareglist.adapter.PanelAdapter;
import com.example.nareglist.model.ListItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private List<ListItem> textList;
    LayoutInflater layoutInflater;
    PanelAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        textList = new ArrayList<>();
        textList.add(new ListItem(R.drawable.real, "Real Madrid", "Spain"));
        textList.add(new ListItem(R.drawable.ars, "Arsenal", "England"));
        textList.add(new ListItem(R.drawable.psg, "PSG", "PSG"));
        adapter = new PanelAdapter(this, R.layout.list_item, textList);
        layoutInflater = getLayoutInflater();
        listView.setAdapter(adapter);
    }
}
