package com.example.straysaver;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.Firebase;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import android.widget.Button;
import android.widget.ImageView;


public class fragmentprofile extends Fragment {
    FirebaseAuth auth;
    Button button;

    FirebaseUser user;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_fragmentprofile, container, false);
        auth = FirebaseAuth.getInstance();
        user = auth.getCurrentUser();
        if (user == null) {
            Intent intent = new Intent(getActivity(), login.class);
            startActivity(intent);
            finish();
        } else {
        }





        Button button = (Button) view.findViewById(R.id.edit_profile_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;

                startActivity(i = new Intent(getActivity(), login.class));

                FirebaseAuth.getInstance().signOut();
                startActivity(i);
                finish();
            }

            private void finish() {
            }
        });
        return view;
    }

    private void finish() {
    }


}
