package com.example.team;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mNumber;
    public WordAdapter(@NonNull Context context, ArrayList<Word> words) {
        super(context, 0,words);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView=convertView;
        if(listItemView==null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord=getItem(position);
        TextView classTextView=listItemView.findViewById(R.id.class_text_view);
        classTextView.setText(currentWord.getmClass());


//        TextView link=listItemView.findViewById(R.id.link_text_view);
//        if(currentWord.hasLink()) {
//            link.setText(currentWord.getmLink());
//            link.setVisibility(View.VISIBLE);
//        }
//        else
//        {
//            link.setVisibility(View.GONE);
//        }

        return listItemView;
    }

}
