package com.example.dylanodekirk.zeldaapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class EquipmentActivity extends AppCompatActivity {

    ListAdapater mListAdapter;
    ListView mItemListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipment);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


//Start copy

        //list of items
        ArrayList<Item> itemList = new ArrayList<Item>();

        //create items to be passed to list
        Item item1 = new Item("Wooden Sword", R.mipmap.e9);
        Item item2 = new Item("Ordon Sword", R.mipmap.e7);
        Item item3 = new Item("Master Sword", R.mipmap.e5);
        Item item4 = new Item("Ordon Sheild", R.mipmap.e6);
        Item item5 = new Item("Wooden Sheild", R.mipmap.e8);
        Item item6 = new Item("Hylian Shield", R.mipmap.e4);
        Item item7 = new Item("Hero's Clothes", R.mipmap.e2);
        Item item8 = new Item("Zora Armor", R.mipmap.e1);
        Item item9 = new Item("Magic Armor", R.mipmap.e3);

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

        mListAdapter = new ListAdapater(EquipmentActivity.this, itemList);
        mItemListView = (ListView) findViewById(R.id.EquipmentListView);
        mItemListView.setAdapter(mListAdapter);

//end copy





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
