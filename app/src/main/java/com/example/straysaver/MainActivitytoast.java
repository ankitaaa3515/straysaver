package com.example.straysaver;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.os.Bundle;

import com.google.firebase.Firebase;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import kotlinx.coroutines.Delay;

public class MainActivitytoast extends AppCompatActivity {

  BottomNavigationView bottomNavigationView;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main_activitytoast);


    bottomNavigationView = findViewById(R.id.bottom_navigation);

   bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
     @Override
     public boolean onNavigationItemSelected(@NonNull MenuItem item) {



        int id = item.getItemId();

        if (id == R.id.home){

         loadfrag(new fragmenthome(),true);

        } else if (id == R.id.donate) {
          loadfrag(new fragmentdonation(),false);

        } else if (id == R.id.adoption) {
          loadfrag(new fragmentadoption(),false);

        } else if (id == R.id.about) {
          loadfrag(new fragmentabout(),false);


        } else if (id == R.id.profile) {
          loadfrag(new fragmentprofile(), false);
        }


        return true;
      }

    });

     bottomNavigationView.setSelectedItemId(R.id.home);
  }



  public void loadfrag(Fragment fragment,boolean flag){
    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    if (flag)
    fragmentTransaction.add(R.id.container,fragment);
    else
      fragmentTransaction.replace(R.id.container,fragment);
    fragmentTransaction.commit();

  }

}





