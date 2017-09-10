package com.example.dylanodekirk.zeldaapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class QuestActivity extends AppCompatActivity {

    ListAdapater mListAdapter;
    ListView mItemListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //list of items
        ArrayList<Item> itemList = new ArrayList<Item>();

        //create items to be passed to list
        Item item1 = new Item("Vessel of Light", R.mipmap.vesseloflight);
        Item item2 = new Item("Auru's Memo", R.mipmap.aurusmemo);
        Item item3 = new Item("Ashei's Sketch", R.mipmap.asheissketch);
        Item item4 = new Item("Ordon Pumpkim", R.mipmap.ordonpumpkin);
        Item item5 = new Item("Ordon Goat Cheese", R.mipmap.ordongoatcheese);
        Item item6 = new Item("Renado's Letter", R.mipmap.renadosletter);
        Item item7 = new Item("Invoice", R.mipmap.invoice);
        Item item8 = new Item("Wooden Statue", R.mipmap.woodenstatue);
        Item item9 = new Item("Ilia's Charm", R.mipmap.iliascharm);
        Item item10 = new Item("Ancient Sky Book", R.mipmap.ancientskybook);

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
        itemList.add(item10);

        mListAdapter = new ListAdapater(QuestActivity.this, itemList);
        mItemListView = (ListView) findViewById(R.id.questActivityListView);
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
