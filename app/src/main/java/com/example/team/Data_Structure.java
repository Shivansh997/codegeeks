package com.example.team;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Data_Structure extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> cse = new ArrayList<Word>();
        cse.add(new Word("GeeksforGeeks", "https://www.geeksforgeeks.org/overview-of-data-structures-set-1-linear-data-structures/"));
        cse.add(new Word("TutorialsPoint", "https://www.tutorialspoint.com/data_structures_algorithms/data_structures_basics.htm"));
        cse.add(new Word("Studytonight","https://www.studytonight.com/data-structures/introduction-to-data-structures"));
        cse.add(new Word("Stackoverflow","https://stackoverflow.com/questions/2301555/learning-algorithms-and-data-structures-fundamentals"))
;
        WordAdapter adapter = new WordAdapter(this, cse);
        ListView listview = findViewById(R.id.list);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = cse.get(position);
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse(word.getmLink())));

            }
        });
    }
}
