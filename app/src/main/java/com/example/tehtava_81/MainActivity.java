package com.example.tehtava_81;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> bottles;
    int money=0;
    int sodaBottles=5;

    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottles = new ArrayList<>();
        bottles.add("Pepsi Max");
        bottles.add("Pepsi Max");
        bottles.add("Pepsi Max");
        bottles.add("Pepsi Max");
        bottles.add("Pepsi Max");

        Button addmoney = findViewById(R.id.addmoney);
        Button retMoney = findViewById(R.id.retmoney);
        Button buy = findViewById(R.id.buy);
        text = (TextView) findViewById(R.id.textScreen);

        addmoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                money += 1;
                text.setText("Klink! Added more money!");
            }
        });
        retMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(money==0){
                    text.setText("Klink klink!! All money gone!");
                }
                else if (money>0){
                    text.setText("Klink klink. Money came out!");
                }
            }
        });
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(money<1){
                    text.setText("Add money first!");
                }
                else if(sodaBottles<1){
                    text.setText("Out of stock");
                }
                else{
                    money -= 1;
                    sodaBottles -= 1;
                    text.setText("KACHUNK! "+bottles.get(0)+ " came out of the dispenser!");


                }
            }
        });
    }
}