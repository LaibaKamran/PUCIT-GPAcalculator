package com.gpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Spinner creditSpinner = findViewById(R.id.credit_spinner);
        creditSpinner.setEnabled(true);

        Button calculateButton = findViewById(R.id.button5);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double gpa = calculateGPA();
                DecimalFormat df = new DecimalFormat("#.##");
                df.setRoundingMode(RoundingMode.HALF_UP);
                String formattedGPA = df.format(gpa);
                Toast.makeText(MainActivity2.this, "Your GPA is: " + formattedGPA, Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void goBack(View view) {
        finish();
    }

    private double calculateGPA() {
        double totalGradePoints = 0;
        double totalCreditHours = 0;

        Spinner grade1Spinner = findViewById(R.id.grade_spinner);
        String selectedGrade1 = grade1Spinner.getSelectedItem().toString();
        Spinner creditHour1Spinner = findViewById(R.id.credit_spinner);
        double selectedCreditHour1 = Double.parseDouble(creditHour1Spinner.getSelectedItem().toString());
        Spinner grade2Spinner = findViewById(R.id.grade_spinner2);
        String selectedGrade2 = grade2Spinner.getSelectedItem().toString();
        Spinner creditHour2Spinner = findViewById(R.id.credit_spinner2);
        double selectedCreditHour2 = Double.parseDouble(creditHour2Spinner.getSelectedItem().toString());
        Spinner grade3Spinner = findViewById(R.id.grade_spinner3);
        String selectedGrade3 = grade3Spinner.getSelectedItem().toString();
        Spinner creditHour3Spinner = findViewById(R.id.credit_spinner3);
        double selectedCreditHour3 = Double.parseDouble(creditHour3Spinner.getSelectedItem().toString());
        Spinner grade4Spinner = findViewById(R.id.grade_spinner4);
        String selectedGrade4 = grade4Spinner.getSelectedItem().toString();
        Spinner creditHour4Spinner = findViewById(R.id.credit_spinner4);
        double selectedCreditHour4 = Double.parseDouble(creditHour4Spinner.getSelectedItem().toString());
        Spinner grade5Spinner = findViewById(R.id.grade_spinner5);
        String selectedGrade5 = grade5Spinner.getSelectedItem().toString();
        Spinner creditHour5Spinner = findViewById(R.id.credit_spinner5);
        double selectedCreditHour5 = Double.parseDouble(creditHour5Spinner.getSelectedItem().toString());
        Spinner grade6Spinner = findViewById(R.id.grade_spinner6);
        String selectedGrade6 = grade6Spinner.getSelectedItem().toString();
        Spinner creditHour6Spinner = findViewById(R.id.credit_spinner6);
        double selectedCreditHour6 = Double.parseDouble(creditHour6Spinner.getSelectedItem().toString());
        Spinner grade7Spinner = findViewById(R.id.grade_spinner7);
        String selectedGrade7 = grade7Spinner.getSelectedItem().toString();
        Spinner creditHour7Spinner = findViewById(R.id.credit_spinner7);
        double selectedCreditHour7 = Double.parseDouble(creditHour7Spinner.getSelectedItem().toString());



        totalGradePoints += getGradePoints(selectedGrade1) * selectedCreditHour1 ;
        totalCreditHours += selectedCreditHour1;
        totalGradePoints += getGradePoints(selectedGrade2) * selectedCreditHour2 ;
        totalCreditHours += selectedCreditHour2;
        totalGradePoints += getGradePoints(selectedGrade3) * selectedCreditHour3 ;
        totalCreditHours += selectedCreditHour3;
        totalGradePoints += getGradePoints(selectedGrade4) * selectedCreditHour4 ;
        totalCreditHours += selectedCreditHour4;
        totalGradePoints += getGradePoints(selectedGrade5) * selectedCreditHour5 ;
        totalCreditHours += selectedCreditHour5;
        totalGradePoints += getGradePoints(selectedGrade6) * selectedCreditHour6 ;
        totalCreditHours += selectedCreditHour6;
        totalGradePoints += getGradePoints(selectedGrade7) * selectedCreditHour7 ;
        totalCreditHours += selectedCreditHour7;

        if (totalCreditHours == 0) {
            return 0;
        }

        return totalGradePoints / totalCreditHours;
    }

    private double getGradePoints(String grade) {
        switch (grade) {
            case "A":
                return 4.0;
            case "A-":
                return 3.7;
            case "B+":
                return 3.3;
            case "B":
                return 3.0;
            case "B-":
                return 2.7;
            case "C+":
                return 2.3;
            case "C":
                return 2.0;
            case "C-":
                return 1.7;
            case "D":
                return 1.0;
            case "F":
                return 0.0;
            default:
                return 0;
        }
    }


}