package com.example.convertionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText amountET;
    private RadioButton dollartotakaRB, takatodollarRB;
    private Button convertBtn;
    private TextView resultTV;
    private String amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amountET = findViewById(R.id.amountET);
        dollartotakaRB = findViewById(R.id.dollartotakaRB);
        takatodollarRB = findViewById(R.id.takatodollarRB);
        convertBtn = findViewById(R.id.convertBtn);
        resultTV = findViewById(R.id.resultTV);

        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                amount = amountET.getText().toString();

                if(amount.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Enter amount", Toast.LENGTH_SHORT).show();
                }
                else {

                    if (dollartotakaRB.isChecked()) {
                        double totalAmount = Double.valueOf(amount);
                        double result = totalAmount * 80;
                        resultTV.setText(String.valueOf(result));
                    } else {
                        double totalAmount = Double.valueOf(amount);
                        double result = totalAmount / 80;
                        resultTV.setText(String.valueOf(result));
                    }
                }

            }
        });
    }
}
