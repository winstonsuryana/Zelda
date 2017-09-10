package com.example.dylanodekirk.zeldaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class UpgradesActivity extends AppCompatActivity {


    ListAdapater mListAdapter;
    ListView mItemListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upgrades);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //list of items
        ArrayList<Item> itemList = new ArrayList<Item>();

        //create items to be passed to list
        Item item1 = new Item("Wallet", R.mipmap.wallet);
        Item item2 = new Item("Big Wallet", R.mipmap.bigwallet);
        Item item3 = new Item("Giant Wallet", R.mipmap.giantwallet);
        Item item4 = new Item("Colossal Wallet", R.mipmap.colossalwallet);
        Item item5 = new Item("Quiver", R.mipmap.quiver);
        Item item6 = new Item("Big Quiver", R.mipmap.bigquiver);
        Item item7 = new Item("Giant Quiver", R.mipmap.giantquiver);
        Item item8 = new Item("Giant Bomb Bag", R.mipmap.giantbombbag);

        //add each item to the list
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);
        itemList.add(item7);
        itemList.add(item8);

        mListAdapter = new ListAdapater(UpgradesActivity.this, itemList);
        mItemListView = (ListView) findViewById(R.id.upgradesListView);
        mItemListView.setAdapter(mListAdapter);


        mItemListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                Item item = (Item) parent.getItemAtPosition(position);
                Intent i = new Intent(UpgradesActivity.this, DisplayInformationActivity.class);

                i.putExtra("itemName", item.getItemName());
                i.putExtra("itemPicture", item.getImageSource());
                i.putExtra("description", item.itemdescription);


                startActivity(i);
            }

        });



    }

}
