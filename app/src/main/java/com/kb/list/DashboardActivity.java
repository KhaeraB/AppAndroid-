package com.kb.list;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.io.Serializable;

public class DashboardActivity extends AppCompatActivity implements Serializable{
    public TextView firstNTv;
    public TextView lastNTv;
    public TextView ageTv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);


        firstNTv = findViewById(R.id.firstName);
        Intent intent = getIntent();
        String firstName = intent.getStringExtra(LoginActivity.FIRSTNAME);
        firstNTv.setText(getString(R.string.HelloYou, firstName));

        lastNTv = findViewById(R.id.lastName);
        String lastName =  intent.getStringExtra(LoginActivity.LASTNAME);
        lastNTv.setText(lastName);

        ageTv = findViewById(R.id.age);
        String age =  intent.getStringExtra(LoginActivity.AGE);
        ageTv.setText(age);

    }
}
