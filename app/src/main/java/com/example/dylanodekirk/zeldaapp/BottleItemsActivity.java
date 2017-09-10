package com.example.dylanodekirk.zeldaapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class BottleItemsActivity extends AppCompatActivity {

    ListAdapater mListAdapter;
    ListView mItemListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottle_items);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ArrayList<Item> itemList = new ArrayList<Item>();

        //create items to be passed to list
        Item item1 = new Item("Red Potion", R.mipmap.redpotion);
        Item item2 = new Item("Blue Potion", R.mipmap.bluepotion);
        Item item3 = new Item("Milk", R.mipmap.milk);
        Item item4 = new Item("Hot Springwater", R.mipmap.hotspringwater);
        Item item5 = new Item("Lantern Oil", R.mipmap.lanternoil);
        Item item6 = new Item("Fairy", R.mipmap.fairy);
        Item item7 = new Item("Great Fairy's Tears", R.mipmap.greatfairystears);
        Item item8 = new Item("Nasty Soup", R.mipmap.nastysoup);
        Item item9 = new Item("Simple Soup", R.mipmap.simplesoup);
        Item item10 = new Item("Good Soup", R.mipmap.goodsoup);
        Item item11 = new Item("Superb Soup", R.mipmap.superbsoup);
        Item item12 = new Item("Bee Larva", R.mipmap.beelarva);
        Item item13 = new Item("Worm", R.mipmap.worm);



        //add each item to the list
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item6);
        itemList.add(item7);
        itemList.add(item8);
        itemList.add(item9);
        itemList.add(item10);
        itemList.add(item11);
        itemList.add(item12);
        itemList.add(item13);
        

        mListAdapter = new ListAdapater(BottleItemsActivity.this, itemList);
        mItemListView = (ListView) findViewById(R.id.BottleItemsListView);
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
