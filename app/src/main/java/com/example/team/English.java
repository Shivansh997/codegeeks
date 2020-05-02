package com.example.team;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class English extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> english = new ArrayList<Word>();
        english.add(new Word("NCERT Books", "https://www.ncertbooks.guru/ncert-class-12-english-book/"));
        english.add(new Word("SuccessCDs", "https://www.successcds.net/cce-cbse/class-xii/english/"));
        english.add(new Word("Vedantu", "https://www.vedantu.com/ncert-books/ncert-books-class-12-english-vistas"));


        WordAdapter adapter = new WordAdapter(this, english);
        ListView listview = findViewById(R.id.list);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = english.get(position);
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(word.getmLink())));

            }
        });
    }
}
