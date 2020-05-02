package com.example.team;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class CollegeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

       final ArrayList<Word> branch=new ArrayList<>();
        branch.add(new Word("Computer Science Engineering",1));
        branch.add(new Word("Mechanical Engineering",2));
        branch.add(new Word("Civil Engineering",3));
        branch.add(new Word("Electonics & Communication Engineering",4));
        branch.add(new Word("Electrical Engineering",5));

        WordAdapter adapter=new WordAdapter(this,branch);
        ListView listview=findViewById(R.id.list);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = branch.get(position);
                int n = word.getmNumber();
                if (n == 1) {
                    Intent intent = new Intent(CollegeActivity.this, CSE.class);
                    startActivity(intent);
                }
                else if(n==2){
                    Toast.makeText(CollegeActivity.this,"Mechanical Engineering Clicked",Toast.LENGTH_SHORT).show();
                }
                else if(n==3){
                    Toast.makeText(CollegeActivity.this,"Civil Engineering Clicked",Toast.LENGTH_SHORT).show();
                }
                else if(n==4){
                    Toast.makeText(CollegeActivity.this,"Electonics & Communication Engineering Clicked",Toast.LENGTH_SHORT).show();
                }
                else if(n==5){
                    Toast.makeText(CollegeActivity.this,"Electrical Engineering Clicked",Toast.LENGTH_SHORT).show();
                }

            }
        });
        }
    }
