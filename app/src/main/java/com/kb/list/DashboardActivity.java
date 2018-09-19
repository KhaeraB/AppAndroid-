package com.kb.list;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.io.Serializable;

public class DashboardActivity extends AppCompatActivity {
    public TextView firstNTv;
    public TextView lastNTv;
    public TextView ageTv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);


        firstNTv = findViewById(R.id.firstName);
        Intent intent = getIntent();
        User parcelableExtra =  intent.getParcelableExtra(LoginActivity.USER);
        String firstName = parcelableExtra.getFirstName();
        firstNTv.setText(getString(R.string.HelloYou, firstName));

        lastNTv = findViewById(R.id.lastName);
        String lastName =  parcelableExtra.getLastName();
        lastNTv.setText(lastName);

        ageTv = findViewById(R.id.age);
        String age = parcelableExtra.getAge();
        ageTv.setText(age);

    }
}
