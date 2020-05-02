package com.example.team;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SchoolActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

       final ArrayList<Word> schoolclass=new ArrayList<Word>();
        schoolclass.add(new Word("12th Class",1));
        schoolclass.add(new Word("11th Class",2));
        schoolclass.add(new Word("10th Class",3));
        schoolclass.add(new Word("9th Class",4));
        schoolclass.add(new Word("8th Class",5));
        schoolclass.add(new Word("7th Class",6));
        schoolclass.add(new Word("6th Class",7));

        WordAdapter adapter=new WordAdapter(this,schoolclass);
        ListView listview=findViewById(R.id.list);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word=schoolclass.get(position);
                int n=word.getmNumber();
                if(n==1) {
                    Intent intent = new Intent(SchoolActivity.this, Class_12.class);
                    startActivity(intent);
                }
                else if(n==2){
                    Toast.makeText(SchoolActivity.this,"11th Class Clicked",Toast.LENGTH_SHORT).show();
                }
                else if(n==3){
                    Toast.makeText(SchoolActivity.this,"10th Class Clicked",Toast.LENGTH_SHORT).show();
                }
                else if(n==4){
                    Toast.makeText(SchoolActivity.this,"9th Class Clicked",Toast.LENGTH_SHORT).show();
                }
                else if(n==5){
                    Toast.makeText(SchoolActivity.this,"8th Class Clicked",Toast.LENGTH_SHORT).show();
                }
                else if(n==6){
                    Toast.makeText(SchoolActivity.this,"7th Class Clicked",Toast.LENGTH_SHORT).show();
                }
                else if(n==7){
                    Toast.makeText(SchoolActivity.this,"6th Class Clicked",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
