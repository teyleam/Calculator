package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    //1: Khai bao cac view de khai thac
    TextInputEditText mTxtInputEdtNumber1, mTxtInputEdtNumber2;
    TextView mBvResult;
    Button mBtnSum, mBtnSub, mBtnMul, mBtnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //2: Anh xa
        mTxtInputEdtNumber1 = findViewById(R.id.textInputNumber1);
        mTxtInputEdtNumber2 = findViewById(R.id.textInputNumber2);
        mBvResult = findViewById(R.id.result);
        mBtnSum = findViewById(R.id.sum);
        mBtnSub = findViewById(R.id.sub);
        mBtnMul = findViewById(R.id.mul);
        mBtnDiv = findViewById(R.id.div);


        mBtnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Click button sum",Toast.LENGTH_SHORT).show();
            }
        });
    }
}