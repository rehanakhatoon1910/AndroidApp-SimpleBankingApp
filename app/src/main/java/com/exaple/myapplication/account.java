package com.exaple.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import java.util.ArrayList;

public class account extends AppCompatActivity {

    private ArrayList<User> userList;
     private  RecyclerView recyclerView;
     private programAdapter.RecyclerViewClickListener listener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        recyclerView = findViewById(R.id.accounts_recycler_view);
        userList = new ArrayList<>();

        setAdapter();
        setUserInfo();

    }

    private void setAdapter() {
        setOnClickListener();
        programAdapter adapter = new programAdapter(userList,listener);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private void setOnClickListener() {
        listener = new programAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {

                Intent intent= new Intent(account.this, AccountDetails.class);
                intent.putExtra("username",userList.get(position).getUsername());
                intent.putExtra("email",userList.get(position).getEmail());
                intent.putExtra("balance",userList.get(position).getBalance());
                startActivity(intent);
            }
        };
    }

    private void setUserInfo() {

        userList.add(new User("Rehana","rehana@gmail.com","Rs.100000"));
        userList.add(new User("Aslam","aslam@gmail.com","Rs.5254564"));
        userList.add(new User("Rehnuma","rehnuma@gmail.com","Rs.56789"));
        userList.add(new User("Sheren","sheren@gmail.com","Rs.99999"));
        userList.add(new User("Warren","warren@gmail.com","Rs.234567"));
        userList.add(new User("Mark","mark@gmail.com","Rs.754564"));
        userList.add(new User("Christine","christine@gmail.com","Rs.334567"));
        userList.add(new User("Joseph","joseph@gmail.com","Rs.54564"));
        userList.add(new User("Thor","thor@gmail.com","Rs.984564"));
        userList.add(new User("Stark","stark@gmail.com","Rs.88564"));
    }

}