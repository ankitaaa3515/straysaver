package com.example.straysaver;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class fragmenthome extends Fragment {


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {

            View view = inflater.inflate(R.layout.fragment_fragmenthome, container, false);


            CardView cardView = (CardView) view.findViewById(R.id.cardView7);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i;

                    startActivity(i=new Intent(getActivity(), barry.class));
                }
            });



            CardView cardView1 = (CardView) view.findViewById(R.id.cardView6);
            cardView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i;

                    startActivity(i=new Intent(getActivity(), Glenn.class));
                }
            });


            CardView cardView2= (CardView) view.findViewById(R.id.cardView5);
            cardView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i;

                    startActivity(i=new Intent(getActivity(), jasmine.class));
                }
            });

            CardView cardView3= (CardView) view.findViewById(R.id.cardView4);
            cardView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i;

                    startActivity(i=new Intent(getActivity(), ramen.class));
                }
            });

            CardView cardView4= (CardView) view.findViewById(R.id.cardView3);
            cardView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i;

                    startActivity(i=new Intent(getActivity(), Swasea.class));
                }
            });


            CardView cardView5= (CardView) view.findViewById(R.id.cardView2);
            cardView5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i;

                    startActivity(i=new Intent(getActivity(), Cherry.class));
                }
            });


            return view;


        }}