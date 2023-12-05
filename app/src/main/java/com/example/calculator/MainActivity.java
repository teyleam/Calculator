package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.logging.Logger;

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
                //Thong bao
                //Toast.makeText(MainActivity.this, "Click button sum",Toast.LENGTH_SHORT).show();

                //Kiem tra gia tri trong system => System.out
                //Log.d("BBB","Hello");
                //Lay gia tri tra ve string
                String textNumber1 = mTxtInputEdtNumber1.getText().toString();
                String textNumber2 = mTxtInputEdtNumber2.getText().toString();

                //Kiem tra gia tri
                if (textNumber1.isEmpty()||textNumber2.isEmpty()){
                    Toast.makeText(MainActivity.this,"Invalid input",Toast.LENGTH_SHORT).show();
                    return;
                }

                //Chuyen doi tu string sang int
                int number1 = Integer.parseInt(textNumber1);
                int number2 = Integer.parseInt(textNumber2);

                int result = number1 + number2;
                mBvResult.setText("Result: " + result);
                }

        });


        mBtnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String textNumber1 = mTxtInputEdtNumber1.getText().toString();
                String textNumber2 = mTxtInputEdtNumber2.getText().toString();

                if(textNumber1.isEmpty()||textNumber2.isEmpty()){
                    Toast.makeText(MainActivity.this,"Invalid input",Toast.LENGTH_SHORT).show();
                    return;
                }

                int number1 = Integer.parseInt(textNumber1);
                int number2 = Integer.parseInt(textNumber2);

                int result = number1 - number2;
                mBvResult.setText("Result: " +result);
            }

        });
        mBtnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textNumber1 = mTxtInputEdtNumber1.getText().toString();
                String textNumber2 = mTxtInputEdtNumber2.getText().toString();

                if(textNumber1.isEmpty()||textNumber2.isEmpty()){
                    Toast.makeText(MainActivity.this,"Invalid input", Toast.LENGTH_SHORT).show();
                    return;
                }
                int number1 = Integer.parseInt(textNumber1);
                int number2 = Integer.parseInt(textNumber2);
                int result = number1 * number2;

                mBvResult.setText("Result: " + result);
            }
        });

        mBtnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textNumber1 = mTxtInputEdtNumber1.getText().toString();
                String textNumber2 = mTxtInputEdtNumber2.getText().toString();

                if(textNumber1.isEmpty()||textNumber2.isEmpty()){
                    Toast.makeText(MainActivity.this,"Invalid",Toast.LENGTH_SHORT).show();
                    return;
                }
                int number1 = Integer.parseInt(textNumber1);
                int number2 = Integer.parseInt(textNumber2);

                int result = number1 / number2;
                mBvResult.setText("Result: " + result);
            }
        });
    }
}