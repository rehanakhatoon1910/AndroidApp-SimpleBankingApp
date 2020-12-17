package com.exaple.myapplication;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MoneyTransfer extends AppCompatActivity {

    TextView textView13;
    EditText editTextNumber;
    Button btn2;
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.money_transfer);
        textView13=findViewById(R.id.textView13);
        editTextNumber=findViewById(R.id.editTextNumber);
        btn2=findViewById(R.id.button2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Transaction Successful",Toast.LENGTH_LONG).show();
            }
        });

    }
}
