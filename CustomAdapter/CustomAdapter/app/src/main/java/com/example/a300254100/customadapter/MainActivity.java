package com.example.a300254100.customadapter;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //List<Integer> AllPicList = new ArrayList<>(Arrays.asList(R.drawable.bigshort,R.drawable.gameofthrones,R.drawable.starwars));
    //
    List<String> AllItemList = new ArrayList<>();
    List<Integer> AllPicList = new ArrayList<>();
    List<String> AllDirList = new ArrayList<>();

    List<String> MovieList = new ArrayList<>();
    List<Integer> MoviePicList = new ArrayList<>();
    List<String> MovieDirList = new ArrayList<>();

    List<String> TvList = new ArrayList<>();
    List<Integer> TvPicList = new ArrayList<>();
    List<String> TvDirList = new ArrayList<>();

    private void addAllitems(){
        AllItemList.add("Big Short");
        AllItemList.add("Game of Thrones");
        AllItemList.add("Star Wars");

        AllPicList.add(R.drawable.bigshort);
        AllPicList.add(R.drawable.gameofthrones);
        AllPicList.add(R.drawable.starwars);

        AllDirList.add("Adam McKay");
        AllDirList.add("Alan Taylor");
        AllDirList.add("Rian Johnson");

        MovieList.add("Big Short");
        MovieList.add("Star Wars");
        MoviePicList.add(R.drawable.bigshort);
        MoviePicList.add(R.drawable.starwars);
        MovieDirList.add("Adam McKay");
        MovieDirList.add("Rian Johnson");

        TvList.add("Game of Thrones");
        TvPicList.add(R.drawable.gameofthrones);
        TvDirList.add("Alan Taylor");

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Instantiate
        final TabLayout myTabLayout = (TabLayout) findViewById(R.id.tabLayout);
        final RecyclerView myRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        //Create a layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //Put layout manager into recycler view
        myRecyclerView.setLayoutManager(layoutManager);
        //Create Data

        addAllitems();
        //Create Adapter Instance
        final MyCustomAdapter myAdapter = new MyCustomAdapter(AllItemList,AllPicList,AllDirList);
        myRecyclerView.setAdapter(myAdapter);
        //Set Adapter to Recycler View
        myTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (myTabLayout.getSelectedTabPosition()){
                    case 0:
                        //change data the adapter
                        Toast.makeText(MainActivity.this,"Clicked on All items",Toast.LENGTH_LONG);
                        myAdapter.changeItemList(AllItemList,AllPicList,AllDirList);
                        break;
                    case 1:
                        //change data to movies
                        Toast.makeText(MainActivity.this,"Clicked on Movie Items",Toast.LENGTH_LONG);
                        myAdapter.changeItemList(MovieList,MoviePicList,MovieDirList);
                        break;
                    case 2:
                        //change data to shows
                        Toast.makeText(MainActivity.this,"Clicked on Tv Items",Toast.LENGTH_LONG);
                        myAdapter.changeItemList(TvList,TvPicList,TvDirList);
                        break;
                }
                //notify that data has changed on the adapter
                myAdapter.notifyDataSetChanged();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                switch (myTabLayout.getSelectedTabPosition()){
                    case 0:
                        Toast.makeText(MainActivity.this,"Clicked on All items",Toast.LENGTH_LONG);
                        myAdapter.changeItemList(AllItemList,AllPicList,AllDirList);
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this,"Clicked on Movie Items",Toast.LENGTH_LONG);
                        myAdapter.changeItemList(MovieList,MoviePicList,MovieDirList);
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this,"Clicked on Tv Items",Toast.LENGTH_LONG);
                        myAdapter.changeItemList(TvList,TvPicList,TvDirList);
                        break;
                }
                //notify that data has changed on the adapter
                myAdapter.notifyDataSetChanged();
            }
        });



    }
}
