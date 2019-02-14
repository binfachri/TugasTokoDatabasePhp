package com.blogspot.kaisarjepang.databasetoko;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity{


    private Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment = new TokoFragment();
        showFragment(fragment);
    }

        private void showFragment(Fragment fragment) {
           getSupportFragmentManager().beginTransaction().replace(R.id.main_container, fragment).commit();
        }


}





