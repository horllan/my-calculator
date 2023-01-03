package com.example.cpe302_calculator;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnClr, btnAdd, btnMinus, btnDel, btnMul, btnM_Minus, btnM_Add, btnM_R, btnM_C;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize all the button by setting them to the respective resource id
        initializeBtn();

    }

    private void initializeBtn() {
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnAdd = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnDiv);
        btnClr = findViewById(R.id.btnClr);
        btnDel = findViewById(R.id.btnDel);
        btnMul = findViewById(R.id.btnMul);
        btnM_C = findViewById(R.id.btnM_C);
        btnM_Minus = findViewById(R.id.btnM_Minus);
        btnM_R = findViewById(R.id.btnM_R);
        btnM_R = findViewById(R.id.btnM_Plus);
        btnM_Add = findViewById(R.id.btnM_R);
    }
    private void addListerner(Button btn){
        btn.setOnClickListener((it)->{
            //
        });
    }

    private double addOperation(double... values) {
        double temp = 0;
        for (int i = 0; i < values.length; i++) {
            temp += values[i];
        }
        return temp;
    }

    private double substractOperation(double... values) {
        double temp = 0;
        for (int i = 0; i < values.length; i++) {
            temp -= values[i];
        }
        return temp;
    }

    private double multiplyOperation(double... values) {
        double temp = 0;
        for (int i = 0; i < values.length; i++) {
            temp *= values[i];
        }
        return temp;
    }

    private double divideOperation(double... values) {
        double temp = 0;
        for (int i = 0; i < values.length; i++) {
            temp /= values[i];
        }
        return temp;
    }
}