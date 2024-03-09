package com.example.recyclerviewexample;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    ArrayList<MyDataSet> datalist;

    public MyAdapter(ArrayList<MyDataSet> data){
        this.datalist =data;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout,parent,false);
    return  new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {

        MyDataSet data =datalist.get(position);
        holder.imageView.setImageResource(data.getImage());
        holder.textView.setText(data.getText());
        holder.buttonView.setText(data.getButton());
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class  MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;
        Button buttonView;
        public MyViewHolder(@NonNull View itemView){
            super(itemView);

            imageView = itemView.findViewById(R.id.image_view);
            textView= itemView.findViewById(R.id.tv_card);
            buttonView = itemView.findViewById(R.id.tv_button);

            buttonView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String buttonText = buttonView.getText().toString();
                    int newColor = Color.WHITE;

                    // Determine the new color based on the current button text
                    switch (buttonText) {
                        case "Red":
                            newColor = Color.RED;
                            break;
                        case "Yellow":
                            newColor = Color.YELLOW;
                            break;
                        case "Black":
                            newColor = Color.BLACK;
                            break;
                        case "White":
                            newColor = Color.WHITE;
                            break;
                    }

                    // Set the text color of the textView
                    textView.setTextColor(newColor);
                    // Toggle the button text
                    if (newColor == Color.WHITE) {
                        // If the new color is white, set the button text to the previous color
                        buttonView.setText(buttonText);
                    } else {
                        // If the new color is not white, set the button text to white
                        buttonView.setText("White");
                    }
                }





//
//
//                    String which_button = buttonView.getText().toString();
//                    if(which_button.equals("Red")){
//                        if (buttonView.getText().equals("Red")){
//
//                            textView.setTextColor(Color.RED);
//                            buttonView.setText("White");
//                        }
//                        else if(buttonView.getText().equals("White")) {
//                            textView.setTextColor(Color.WHITE);
//                            buttonView.setText("Red");
//                        }
//
//                    }
//                    if(which_button.equals("Yellow")){
//                        if (buttonView.getText().equals("Yellow")){
//
//                            textView.setTextColor(Color.YELLOW);
//                            buttonView.setText("White");
//                        }
//                        else if(buttonView.getText().equals("White")) {
//                            textView.setTextColor(Color.WHITE);
//                            buttonView.setText("Yellow");
//                        }
//
//                    }    if(which_button.equals("Black")){
//                        if (buttonView.getText().equals("Black")){
//
//                            textView.setTextColor(Color.BLACK);
//                            buttonView.setText("White");
//                        }
//                        else if(buttonView.getText().equals("White")) {
//                            textView.setTextColor(Color.WHITE);
//                            buttonView.setText("Black");
//                        }
//
//                    }
//
//
//
//
//                }
            });

            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(textView.getText().equals("Card1")){
                        textView.setText("Text1");
                    } else if (textView.getText().equals("Card2")) {
                        textView.setText("Text2");
                    }else if(textView.getText().equals("Card3")){
                        textView.setText("Text3");
                    }

                }
            });

        }


    }

}