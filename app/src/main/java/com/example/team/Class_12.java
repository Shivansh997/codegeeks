package com.example.team;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Class_12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> schoolclass=new ArrayList<Word>();
        schoolclass.add(new Word("English",1));
        schoolclass.add(new Word("Hindi",2));
        schoolclass.add(new Word("Physics",3));
        schoolclass.add(new Word("Chemistry",4));
        schoolclass.add(new Word("Maths",5));
        schoolclass.add(new Word("Biology",6));
        schoolclass.add(new Word("Accounts",7));
        schoolclass.add(new Word("Economics",8));
        schoolclass.add(new Word("Business",9));

        WordAdapter adapter=new WordAdapter(this,schoolclass);
        ListView listview=findViewById(R.id.list);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word=schoolclass.get(position);
                int n=word.getmNumber();
                if(n==1) {
                    Intent intent = new Intent(Class_12.this, English.class);
                    startActivity(intent);
                }
                else if(n==2)
                        Toast.makeText(Class_12.this,"Hindi clicked",Toast.LENGTH_SHORT).show();
                if(n==3)
                    Toast.makeText(Class_12.this,"Physics clicked",Toast.LENGTH_SHORT).show();
                if(n==4)
                    Toast.makeText(Class_12.this,"Chemistry clicked",Toast.LENGTH_SHORT).show();
                if(n==5)
                    Toast.makeText(Class_12.this,"Maths clicked",Toast.LENGTH_SHORT).show();
                if(n==6)
                    Toast.makeText(Class_12.this,"Biology clicked",Toast.LENGTH_SHORT).show();

                if(n==7)
                    Toast.makeText(Class_12.this,"Accounts clicked",Toast.LENGTH_SHORT).show();
                if(n==8)
                    Toast.makeText(Class_12.this,"Economics clicked",Toast.LENGTH_SHORT).show();
                if(n==9)
                    Toast.makeText(Class_12.this,"Business clicked",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
