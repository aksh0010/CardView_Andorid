package com.example.recyclerviewexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class  MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;
        public MyViewHolder(@NonNull View itemView){
            super(itemView);

            imageView = itemView.findViewById(R.id.image_view);
            textView= itemView.findViewById(R.id.tv_card);

        }

    }

}