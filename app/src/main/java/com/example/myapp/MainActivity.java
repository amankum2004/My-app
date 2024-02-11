package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

CardView cardview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nextBtn;

        EditText edtweight, edtheightft,edtheightin,edtheightcm;
        Button btncalculate;
        TextView txtresult;
        LinearLayout llmain;

//        cardview = findViewById(R.id.cardview);
//        cardview.setRadius(5.0f);
//        cardview.getCardElevation();
//        cardview.setUseCompatPadding(true);
        nextBtn = findViewById(R.id.nextBtn);

        edtweight = findViewById(R.id.edtWeight);
//        edtheightft = findViewById(R.id.edtHeight1);
//        edtheightin = findViewById(R.id.edtHeight2);
        edtheightcm = findViewById(R.id.edtHeight3);
        btncalculate = findViewById(R.id.btn);
        txtresult = findViewById(R.id.rst);
        llmain = findViewById(R.id.llmain);

        btncalculate.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                double wt = Integer.parseInt(edtweight.getText().toString());
//                int ft = Integer.parseInt(edtheightft.getText().toString());
//                int in = Integer.parseInt(edtheightin.getText().toString());
                double cm = Integer.parseInt(edtheightcm.getText().toString());

//                int totalin = ft*12 + in;
//                double totalcm = in*2.53 ;
                double totalm = cm/100;

                double bmi = wt/(totalm*totalm) ;

                if (18.5<bmi && bmi<24.9){
                    String cat1 = "You are Healthy";
                    txtresult.setText("BMI: "+bmi + "\n" + "Category: "+cat1);
                    llmain.setBackgroundColor(getResources().getColor(R.color.H));
                } else if (bmi<18.5) {
                    String cat2 = "You are Underweight";
                    txtresult.setText("BMI: "+bmi + "\n" +"Category: "+cat2);
                    llmain.setBackgroundColor(getResources().getColor(R.color.UW));
                }else if (25 < bmi && bmi < 29.9){
                    String cat3 = "You are Overweight";
                    txtresult.setText("BMI: "+bmi + "\n" + "Category: "+cat3);
                    llmain.setBackgroundColor(getResources().getColor(R.color.OW));
                }else {
                    String cat4 = "You are in Obese category";
                    txtresult.setText("BMI: " +bmi + "\n" + "Category: "+cat4);
                    llmain.setBackgroundColor(getResources().getColor(R.color.H));
                }
            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNext;
                iNext = new Intent(MainActivity.this, services.class);
//                iNext.putExtra("title","Home");
                startActivity(iNext);
            }
        });



    }
}