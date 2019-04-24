package com.example.aishuqing.chat04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager=getFragmentManager();
        //¿ªÆôÒ»¸öÐÂÊÂÎñ
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        PrefFragment preFragment=new PrefFragment();
        transaction.add(R.id.layout1,preFragment);
        transaction.commit();

    }
}
