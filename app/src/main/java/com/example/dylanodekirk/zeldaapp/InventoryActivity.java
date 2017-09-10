package com.example.dylanodekirk.zeldaapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class InventoryActivity extends AppCompatActivity {

    ListAdapater mListAdapter;
    ListView mItemListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //list of items
        ArrayList<Item> itemList = new ArrayList<Item>();

        //create items to be passed to list
        Item item1 = new Item("Ball and Chain", R.mipmap.ballandchain);
        Item item2 = new Item("Bomb Bag", R.mipmap.bombbag);
        Item item3 = new Item("Bombling", R.mipmap.bombling);
        Item item4 = new Item("Water Bomb", R.mipmap.waterbomb);
        Item item5 = new Item("Bottle", R.mipmap.bottle);
        Item item6 = new Item("Clawshot", R.mipmap.clawshot);
        Item item7 = new Item("Double Clawshot", R.mipmap.doubleclawshot);
        Item item8 = new Item("Coral Earring", R.mipmap.coralearring);
        Item item9 = new Item("Dominion Rod", R.mipmap.dominionrod);
        Item item10 = new Item("Fishing Rod", R.mipmap.fishingrod);
        Item item11 = new Item("Slingshot", R.mipmap.slingshot);
        Item item12 = new Item("Gale Boomerang", R.mipmap.galeboomerang);
        Item item13 = new Item("Lantern", R.mipmap.lantern);
        Item item14 = new Item("Hawkeye", R.mipmap.hawkeye);
        Item item15 = new Item("Hero's Bow", R.mipmap.herosbow);
        Item item16 = new Item("Horse Call", R.mipmap.horsecall);
        Item item17 = new Item("Iron Boots", R.mipmap.ironboots);
        Item item18 = new Item("Spinner", R.mipmap.spinner);
        Item item19 = new Item("Ooccoo", R.mipmap.ooccoo);
        Item item20 = new Item("Ooccoo Jr.", R.mipmap.ooccoojr);
        Item item21 = new Item("Ghost Lantern", R.mipmap.ghostlantern);


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
        itemList.add(item11);
        itemList.add(item12);
        itemList.add(item13);
        itemList.add(item14);
        itemList.add(item15);
        itemList.add(item16);
        itemList.add(item17);
        itemList.add(item18);
        itemList.add(item19);
        itemList.add(item20);
        itemList.add(item21);


        mListAdapter = new ListAdapater(InventoryActivity.this, itemList);
        mItemListView = (ListView) findViewById(R.id.inventoryListView);
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
