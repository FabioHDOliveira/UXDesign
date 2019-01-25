package com.example.a300275262.fragdemo;


import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements TopFragment.OnFragmentInteractionListener, BottomFragment.OnFragmentInteractionListener {

    ArrayList<String> myItems = new ArrayList<String>(Arrays.asList("Necklace", "Ear Rings", "Bracelet"));
    ArrayList<Integer> myImages = new ArrayList<Integer>(Arrays.asList(R.drawable.necklace, R.drawable.earrings, R.drawable.bracelet));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        TopFragment myTopFrag = new TopFragment();
        //fragment_top.xml
        ft.add(R.id.topFragFrame, myTopFrag.newInstance(myItems));
        ft.commit();
    }

    @Override
    public void onFragmentInteraction(int index) {
        Toast.makeText(this, "Clicked on index " + index, Toast.LENGTH_SHORT).show();
        //what to do when top frag interactions occurs
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        BottomFragment bottomFrag = new BottomFragment();
        ft.add(R.id.bottomFragFrame, bottomFrag.newInstance(myImages.get(index)));
        ft.commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
