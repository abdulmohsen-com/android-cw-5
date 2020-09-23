package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Next extends AppCompatActivity {
    private TextView Name;
    private TextView Age;
    private Button Back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Name = (TextView)findViewById(R.id.tvName);
        Age = (TextView)findViewById(R.id.tvAge);
        Back = (Button) findViewById(R.id.back);
        Bundle airport = getIntent().getExtras();
        String age = airport.getString("Age");
        String name = airport.getString("Name");
        Name.setText("اسمك: " +name);
        Age.setText( "عمرك: " + age);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Next.this , MainActivity.class);
                startActivity(intent);
            }
        });

    }
}