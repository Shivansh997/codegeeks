package com.example.team;

public class Word {
    private String mClass;
    private String mLink=null;
    private int mNumber;

    public Word(String Class,int number){
        mClass=Class;
        mNumber=number;
    }
    public Word(String Subject,String link){
        mClass=Subject;
        mLink=link;
    }

    public String getmClass(){
        return mClass;
    }
    public int getmNumber(){
        return mNumber;
    }
    public String getmLink(){ return mLink; }
}
