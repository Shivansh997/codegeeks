package com.example.team;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class CSE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> cse=new ArrayList<Word>();
        cse.add(new Word("Data Structure",1));
        cse.add(new Word("Analysis and Design of Algorithms",2));
        cse.add(new Word("Discrete Structure",3));
        cse.add(new Word("Digital System",4));
        cse.add(new Word("Operating System",5));
        cse.add(new Word("Databases",6));
        cse.add(new Word("Computer system and Architecture",7));
        cse.add(new Word("Compiler Design",8));
        cse.add(new Word("Computer Network",9));

        WordAdapter adapter=new WordAdapter(this,cse);
        ListView listview=findViewById(R.id.list);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = cse.get(position);
                int n = word.getmNumber();
               Toast toast = null;
                if (n == 1) {
                    Intent intent = new Intent(CSE.this, Data_Structure.class);
                    startActivity(intent);
                } else if (n == 2)
                {
                    if (toast != null) {
                    toast.cancel();
                }
                toast = Toast.makeText(CSE.this, "Analysis And Design of Algorithm content", Toast.LENGTH_SHORT);
                toast.show();
            }
                else if(n==3)
                    Toast.makeText(CSE.this,"Discrete Structure content",Toast.LENGTH_SHORT).show();
                else if(n==4)
                    Toast.makeText(CSE.this,"Digital System content",Toast.LENGTH_SHORT).show();
                else if(n==5)
                    Toast.makeText(CSE.this,"Operating System content",Toast.LENGTH_SHORT).show();
                else if(n==6)
                    Toast.makeText(CSE.this,"Databases content",Toast.LENGTH_SHORT).show();
                else if(n==7)
                    Toast.makeText(CSE.this,"Computer system and Architecture content",Toast.LENGTH_SHORT).show();
                else if(n==8)
                    Toast.makeText(CSE.this,"Compiler Design content",Toast.LENGTH_SHORT).show();
                else if(n==9)
                    Toast.makeText(CSE.this,"Computer Network content",Toast.LENGTH_SHORT).show();
            }
        });
    }

}
