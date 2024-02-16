package com.example.recyclerviewexample;

public class MyDataSet {

    public String text;
    public  int image;


   public MyDataSet(String text, int image){

this.image=image;
this.text= text;

    }

    public int getImage() {
        return image;
    }

    public String getText() {
        return text;
    }
}
