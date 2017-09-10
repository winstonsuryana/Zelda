package com.example.dylanodekirk.zeldaapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;



public class DungeonItemsActivity extends AppCompatActivity {

    ListAdapater mListAdapter;
    ListView mItemListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dungeon_items);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //list of items
        ArrayList<Item> itemList = new ArrayList<Item>();

        //create items to be passed to list
        Item item1 = new Item("Compass", R.mipmap.compass);
        Item item2 = new Item("Dungeon Map", R.mipmap.dungeonmap);
        Item item3 = new Item("Small Key", R.mipmap.smallkey);
        Item item4 = new Item("Boss Key", R.mipmap.bosskey);
        Item item5 = new Item("Bedroom Key", R.mipmap.bedroomkey);
        Item item6 = new Item("Key Shard 1", R.mipmap.keyshard);
        Item item7 = new Item("Key Shard 2", R.mipmap.keyshardtwo);
        Item item8 = new Item("Key Shard 3", R.mipmap.keyshardthree);
        Item item9 = new Item("Big Key", R.mipmap.bigkey);

        //add each item to the list
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);
        itemList.add(item7);
        itemList.add(item8);
        itemList.add(item9);

        mListAdapter = new ListAdapater(DungeonItemsActivity.this, itemList);
        mItemListView = (ListView) findViewById(R.id.DungeonItemsListView);
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
