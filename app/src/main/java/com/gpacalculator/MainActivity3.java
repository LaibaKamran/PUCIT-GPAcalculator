package com.gpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button calculateButton = findViewById(R.id.button6);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double cgpa = calculateCGPA();
                DecimalFormat df = new DecimalFormat("#.##");
                df.setRoundingMode(RoundingMode.HALF_UP);
                String formattedGPA = df.format(cgpa);
                Toast.makeText(MainActivity3.this, "Your CGPA is: " + formattedGPA, Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void goBack(View view) {
        finish();
    }

    private double calculateCGPA(){

        double total_Gpa;

        EditText editText = findViewById(R.id.editTextNumber4);
        double total_sem = Double.parseDouble(editText.getText().toString());


        EditText editText1 = findViewById(R.id.gpa1);
        String inputString = editText1.getText().toString();

        double s_gpa1;
        if (TextUtils.isEmpty(inputString)) {
            s_gpa1 = 0.0;
        } else {
            s_gpa1 = Double.parseDouble(inputString);
        }

        EditText editText2 = findViewById(R.id.gpa2);
        String inputString2 = editText2.getText().toString();

        double s_gpa2;
        if (TextUtils.isEmpty(inputString2)) {
            s_gpa2 = 0.0;
        } else {
            s_gpa2 = Double.parseDouble(inputString2);
        }
        EditText editText3 = findViewById(R.id.gpa3);
        String inputString3 = editText3.getText().toString();

        double s_gpa3;
        if (TextUtils.isEmpty(inputString3)) {
            s_gpa3 = 0.0;
        } else {
            s_gpa3 = Double.parseDouble(inputString3);
        }
        EditText editText4 = findViewById(R.id.gpa4);
        String inputString4 = editText4.getText().toString();

        double s_gpa4;
        if (TextUtils.isEmpty(inputString4)) {
            s_gpa4 = 0.0;
        } else {
            s_gpa4 = Double.parseDouble(inputString4);
        }
        EditText editText5 = findViewById(R.id.gpa5);
        String inputString5 = editText5.getText().toString();

        double s_gpa5;
        if (TextUtils.isEmpty(inputString5)) {
            s_gpa5 = 0.0;
        } else {
            s_gpa5 = Double.parseDouble(inputString5);
        }
        EditText editText6 = findViewById(R.id.gpa6);
        String inputString6 = editText6.getText().toString();

        double s_gpa6;
        if (TextUtils.isEmpty(inputString6)) {
            s_gpa6 = 0.0;
        } else {
            s_gpa6 = Double.parseDouble(inputString6);
        }
        EditText editText7 = findViewById(R.id.gpa7);
        String inputString7 = editText7.getText().toString();

        double s_gpa7;
        if (TextUtils.isEmpty(inputString7)) {
            s_gpa7 = 0.0;
        } else {
            s_gpa7 = Double.parseDouble(inputString7);
        }
        EditText editText8 = findViewById(R.id.gpa8);
        String inputString8 = editText8.getText().toString();

        double s_gpa8;
        if (TextUtils.isEmpty(inputString8)) {
            s_gpa8 = 0.0;
        } else {
            s_gpa8 = Double.parseDouble(inputString8);
        }

        total_Gpa = s_gpa1+s_gpa2+s_gpa3+s_gpa4+s_gpa5+s_gpa6+s_gpa7+s_gpa8;

        if (total_Gpa == 0) {
            return 0;
        }

        return total_Gpa / total_sem;
    }

}