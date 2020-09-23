package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.PriorityQueue;

public class MainActivity extends AppCompatActivity {
   private Button Next;
   private EditText Name;
   private EditText Age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Age = (EditText)findViewById(R.id.age);
        Name = (EditText)findViewById(R.id.name);
        Next = (Button)findViewById(R.id.nextPage);
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , Next.class);
                intent.putExtra("Age", Age.getText().toString());
                intent.putExtra("Name", Name.getText().toString());
                startActivity(intent);
            }
        });
    }
}