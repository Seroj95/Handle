package com.example.nareglist.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.nareglist.R;
import com.example.nareglist.model.ListItem;

import java.util.List;

public class PanelAdapter extends ArrayAdapter<ListItem> {
    final Context context;
    final int resource;
    final List<ListItem> listItems;

    public PanelAdapter(Context context, int resource
            , List<ListItem> listItems) {
        super(context, resource, listItems);
        this.context = context;
        this.resource = resource;
        this.listItems = listItems;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(resource, null);
        ImageView imageView = view.findViewById(R.id.imageView);
        TextView textViewName = view.findViewById(R.id.textName);
        TextView textViewDescreption = view.findViewById(R.id.textDescreption);

        ListItem listItem = listItems.get(position);

        imageView.setImageDrawable(context.getResources().getDrawable(listItem.getImageId()));
        textViewName.setText(listItem.getName());
        textViewDescreption.setText(listItem.getDescreption());
        Button button = view.findViewById(R.id.bottomPosition);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "hertakan hamar  " + position, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}

