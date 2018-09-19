package com.kb.list;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;


public class LoginActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener, View.OnClickListener{

    public static final String USER = "com.kb.list.USER" ;
    private EditText firstName;
    private EditText lastName;
    private SeekBar mySeekbar;
    private TextView age;
    private Button register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form);

        this.firstName = findViewById(R.id.firstName);
        this.lastName = findViewById(R.id.lastName);
        this.mySeekbar = findViewById(R.id.mySeekbar);
        this.age = findViewById(R.id.age);
        this.register = findViewById(R.id.register);
        this.mySeekbar.setOnSeekBarChangeListener(this);
        this.register.setOnClickListener(this);

    }

    @Override
    public void onClick(View view){
        Intent intent = new Intent(this, DashboardActivity.class);
        intent.putExtra(USER, new User(firstName.getText().toString(), lastName.getText().toString(),age.getText().toString()));
        startActivity(intent);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        if(seekBar == this.mySeekbar){
            this.age.setText(i + " ans");
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }


}
