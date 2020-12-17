package com.exaple.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class programAdapter extends RecyclerView.Adapter<programAdapter.ViewHolder> {



    private final  ArrayList<User> userList;
    private RecyclerViewClickListener listener;

    public programAdapter(ArrayList<User> userList, RecyclerViewClickListener listener){
        this.listener=listener;
        this.userList = userList;

    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView txt1,txt2,txt4;



        public ViewHolder(final View itemView) {
            super(itemView);
            txt1= itemView.findViewById(R.id.cust_Name);
            txt2= itemView.findViewById(R.id.cust_Email);
            txt4= itemView.findViewById(R.id.balance);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            listener.onClick(itemView, getAbsoluteAdapterPosition());
        }
    }


    @NonNull
    @Override
    public programAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder,final int position) {
        String name=userList.get(position).getUsername();
        holder.txt1.setText(name);

        String email=userList.get(position).getEmail();
        holder.txt2.setText(email);


        String balance=userList.get(position).getBalance();
        holder.txt4.setText(balance);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public interface RecyclerViewClickListener{
        void onClick(View v, int position);
    }
}
