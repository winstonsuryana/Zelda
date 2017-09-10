package com.example.dylanodekirk.zeldaapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class CollectableActivity extends AppCompatActivity {

    ListAdapater mListAdapter;
    ListView mItemListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collectable);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ArrayList<Item> itemList = new ArrayList<Item>();

        //create items to be passed to list
        Item item1 = new Item("Arrows", R.mipmap.arrows);
        Item item2 = new Item("Poe Souls", R.mipmap.poesouls);
        Item item3 = new Item("Pumpkin Seeds", R.mipmap.pumpkinseeds);
        Item item4 = new Item("Heart Container", R.mipmap.heartcontainer);
        Item item5 = new Item("Piece of Heart", R.mipmap.pieceofheart);

        //add each item to the list
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);



        mListAdapter = new ListAdapater(CollectableActivity.this, itemList);
        mItemListView = (ListView) findViewById(R.id.CollectableListView);
        mItemListView.setAdapter(mListAdapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
