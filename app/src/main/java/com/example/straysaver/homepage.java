package com.example.straysaver;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class homepage extends AppCompatActivity {

       CardView cardView,cardView1,cardView2,cardView3,cardView4,cardView5;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_homepage);
            cardView=findViewById(R.id.cardView7);
            cardView1=findViewById(R.id.cardView6);
            cardView2=findViewById(R.id.cardView5);
            cardView3=findViewById(R.id.cardView4);
            cardView4=findViewById(R.id.cardView3);
            cardView5=findViewById(R.id.cardView2);


            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(homepage.this, barry.class);
                    startActivity(intent);
                }
            });

            cardView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1=new Intent(homepage.this, Glenn.class);
                    startActivity(intent1);
                }
            });

            cardView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent2=new Intent(homepage.this, jasmine.class);
                    startActivity(intent2);
                }
            });


            cardView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent3=new Intent(homepage.this, ramen.class);
                    startActivity(intent3);
                }
            });


            cardView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent4=new Intent(homepage.this, Swasea.class);
                    startActivity(intent4);
                }
            });


            cardView5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent5=new Intent(homepage.this, Cherry.class);
                    startActivity(intent5);
                }
            });











        }
    }
