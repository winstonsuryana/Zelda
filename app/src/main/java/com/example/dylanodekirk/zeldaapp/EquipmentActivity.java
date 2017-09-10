package com.example.dylanodekirk.zeldaapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.ByteArrayOutputStream;
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
        Item item1 = new Item("Wooden Sword", R.mipmap.e9,
                "The wooden sword is given to you by Rusl. This item is used in a short tutorial at the beginning of the game" +
                        " teaching the player how to fight as Link shows the children how to use a sword. " +
                        "After this Talo takes it, so it's never used on anything other than bucket-headed practice dummies.");

        Item item2 = new Item("Ordon Sword", R.mipmap.e7,
                "he Ordon Sword is obtained in Ordon Village the first time you are a wolf. It is in Rusl's house after you get the shield.");

        Item item3 = new Item("Master Sword", R.mipmap.e5,
                "Before you get the Master Sword you must have saved Midna after Lakebed Temple," +
                        "spoken to Zelda, and returned to Faron Woods. It is obtained by defeating the Skull Kid for the first time in the Sacred Grove." +
                        "This sword can be upgraded into the Light Sword, which can repel fog, deliver light to some sacred orbs, and kill Twilight with a single blow.");

        Item item4 = new Item("Ordon Sheild", R.mipmap.e6,
                "The Ordon Shield is the first shield you will get in the game. It is found in Jaggle's house in Ordon Village. " +
                        "It is susceptible to fire and can be destroyed. There is only one Ordon Shield, but it can be replaced by the Hylian Shield or Wooden Shield");

        Item item5 = new Item("Wooden Sheild", R.mipmap.e8,
                "The Wooden Shield can be purchased from either the Malo Mart in Kakariko Village or the Goron Shop on Death Mountain. " +
                        "It is identical to the Ordon Shield except in appearance and can only be purchased if the Ordon Shield has been destroyed by fire.");

        Item item6 = new Item("Hylian Shield", R.mipmap.e4,
                "The Hylian Sheild can be purchased at the Malo Mart in Kakariko Village for 200 Rupees. Unlike the Ordon Shield and Wooden Shield, the Hylian Shield is impervious to fire," +
                        " and can also deflect magical attacks. It is very useful to have before you enter the goron mines.");

        Item item7 = new Item("Hero's Clothes", R.mipmap.e2,
                " Link's traditional green tunic, this armor provides a little bit of defense compared to the Ordonian Outfit or Wolf Form. " +
                        "Link gets this outfit from Faron after restoring light to the Faron Province. " +
                        "These clothes are the same ones that the Link from Ocarina of Time and Majora's Mask wore.");

        Item item8 = new Item("Zora Armor", R.mipmap.e1,
                "Link will get this outfit at the end of the escort mission before heading to Lakebed Temple. Refer to the After Goron Mines section for help and where you can find it." +
                        " This armor will enable you to swim, dive and breathe underwater just like a Zora. However, you will be more vulnerable to fire and ice attacks while wearing it.");

        Item item9 = new Item("Magic Armor", R.mipmap.e3,
                "This armor is magical, and not only because of the rate at which it depletes your rupees. " +
                        "That's right, this armor runs on money, and while it may not be cheap, it'll keep you well protected." +
                        "So how do you get this armor, you may ask? Begin by donating 1,000 rupees to the elder Goron in Malo Mart in Kakariko Village. " +
                        "Afterward, provide them with 2,000 more so they can open a store in Castle Town. Visit the shop in the southwest corner of Castle Town Square and purchase the armor for 598 rupees." +
                        "Alternatively, after donating 1,000 rupees, go to the goron elder in FRONT, not inside, the Malo Mart, and he will give you a mission," +
                        " and you have to deliver a barrel of hot spring water to the Goron on the bridge at the west side of the Castle Town." +
                        "I suggest you trailing near the south edge of the field, because it attracts the least number of Leevers " +
                        "(flower enemies that pop up from the ground) Bulblins, and Kargarocs." +
                        "Once you bring it to the Goron, he asks you to throw it on him. Do so, and he will restart the Spring Water business (buy one and drink it immediately to regain all health), " +
                        "give you a heart piece, and then, " + "most importantly, reduces the 2,000 rupee fee to a mere 200! Afterwards, buy the armor to save exactly 1,202 rupees.");


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


        mItemListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                Item item = (Item) parent.getItemAtPosition(position);
                Intent i = new Intent(EquipmentActivity.this, DisplayInformationActivity.class);

                i.putExtra("itemName", item.getItemName());
                i.putExtra("itemPicture", item.getImageSource());
                i.putExtra("description", item.itemdescription);


                startActivity(i);
            }

        });







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
