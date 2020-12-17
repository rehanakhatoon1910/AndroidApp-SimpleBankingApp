package com.exaple.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AccountDetails extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_details);

        TextView txt2=findViewById(R.id.textView5);
        TextView  txt3=findViewById(R.id.textView7);
        TextView  txt4=findViewById(R.id.textView9);
        Button btn1=findViewById(R.id.button);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnintent = new Intent(AccountDetails.this,ReceiverList.class);
                startActivity(btnintent);
            }
        });


        String name = getIntent().getStringExtra("username");
        String email= getIntent().getStringExtra("email");
        String balance= getIntent().getStringExtra("balance");


        txt2.setText(name);
        txt3.setText(email);
        txt4.setText(balance);


}
}
