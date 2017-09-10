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
        Item item1 = new Item("Ball and Chain", R.mipmap.ballandchain,
                "The ball and chain is a weapon in snowpeak ruins obtained after beating the living statue that holds a mace." +
                        " It is needed to beat the boss Blizzeta. However, it slows you down when walking with it.");

        Item item2 = new Item("Bombs", R.mipmap.bombbag,
                "Bombs can be found in many places, notably purchased at Barnes Bomb Shop. They can be placed on the ground or thrown a short distance." +
                        " The explosion will hurt enemies and destroy certain types of rock. Bombs can also be combined with arrows to make \"bomb-arrows.\" These are specifically for combat." +
                        " They can be shot at enemies as a ranged attack. The bomb-arrows explode on impact. The bomb bag is obtained after Goron Mines and is upgradable.");

        Item item3 = new Item("Bombling", R.mipmap.bombling,
                "The Bomblings are a type of bomb that allow you to send the bomb to places you can reach, " +
                        "pretty useful for out of reach places, and enemies alike.");

        Item item4 = new Item("Water Bomb", R.mipmap.waterbomb,
                "Water Bombs can be purchased from Barnes in Kakariko Village after Link receives a letter from Barnes regarding a new type of bomb. " +
                        "They can also be purchased from a Zora next to the temple at the bottom of Lake Hylia. " +
                        "Only fifteen can fit in one of Link's Bomb Bags. Water Bombs can also be combined with the Hero's Bow to create Bomb Arrows that explode upon contact.");

        Item item5 = new Item("Bottle", R.mipmap.bottle,
                "Bottles are used to hold various items in the Legend of Zelda Twilight Princess. Some of the uses include:\n" +
                        "-Lantern Oil\n" +
                        "-Captured Fairies\n" +
                        "-Milk\n" +
                        "-Soup\n" +
                        "-Potions");

        Item item6 = new Item("Clawshot", R.mipmap.clawshot,
                "The Clawshot is an upgraded version of the Hookshot from other Zelda games. Link can aim the Clawshot, fire the claw " +
                        "(which can attach to certain surfaces and items), and grapple through the air, pulled toward his destination by the Clawshot's chain. " +
                        "The Clawshot can also lower your vertical distance from a surface that is horizontal to you and your clawshot.");

        Item item7 = new Item("Double Clawshot", R.mipmap.doubleclawshot,
                "As the name suggests, the Double Clawshot is a pair of Clawshots. When you fire your clawshot Clawshot to an area where you do not use your hands to hold on to a suface, " +
                        "you can fire the second Clawshot to get to another area, similar to Spider-Man's web swinging. Obtained by beating the mini-boss of City in the Sky ");

        Item item8 = new Item("Coral Earring", R.mipmap.coralearring,
                "Prince Ralis will give Link the Coral Earring in the graveyard. It's made of precious coral and looks just like a fish hook -- " +
                        "and is actually the best possible lure you could use to catch a reekfish.");

        Item item9 = new Item("Dominion Rod", R.mipmap.dominionrod,
                "The Dominion Rod is a staff with the power of moving inanimate objects such as Owl Statues, or Temple Statues." +
                        "It is important to mention that after you use it in the Temple of Time," +
                        " it will lose its power and you´ll have to do some errands in order to restore it to normal.");

        Item item10 = new Item("Fishing Rod", R.mipmap.fishingrod,
                "The fishing rod is first learned about from Colin early in the game. After you help out around Ordon Village," +
                        " Rusl will give you the rod. It is used to catch fish from sources of water.");

        Item item11 = new Item("Slingshot", R.mipmap.slingshot,
                "The Slingshot is a basic item you get in the Ordon Village shop for 30 rupees.");

        Item item12 = new Item("Gale Boomerang", R.mipmap.galeboomerang,
                "Found in the Forest Temple after beating the mini-boss Ook, the Gale Boomerang enables Link to do a variety of things from a distance, such as:\n" +
                        "-Stun multiple enemies\n" +
                        "-Flip multiple switches or spin windmills\n" +
                        "-Bring out monsters hiding under floor tiles");

        Item item13 = new Item("Lantern", R.mipmap.lantern,
                "Obtained in the Faron province from Coro, the lantern oil salesman, the Lantern can be used to light the way through dark areas, if Link has the lantern oil to fuel it. " +
                        "The Lantern can be hung from Link's belt, allowing him to hold a different item while still providing light, and can also be used to burn away certain objects.");

        Item item14 = new Item("Hawkeye", R.mipmap.hawkeye,
                "The Hawkeye is a mask from The Legend of Zelda: Twilight Princess. The Hawkeye, shaped like the face of a hawk, acts like a pair of binoculars when used by itself," +
                        " but when used in conjunction with the Hero's Bow, the Hawkeye acts as a scope, turning the Bow into a potent and long-ranged sniping weapon. " +
                        "This combination cannot be used in conjunction with Bomb Arrows. " +
                        "The combined bow/Hawkeye is effective at dispatching Bulblin archers mounted atop towers, and is very useful when Link has to protect the Hidden Village.");

        Item item15 = new Item("Hero's Bow", R.mipmap.herosbow,
                "Link's sword can't always do the trick, due to distance, so when Link needs a weapon to get enemies too far away, he uses the Hero's Bow." +
                        " The Hero's Bow is earned after defeating the Goron soldier Mini Boss." +
                        " At first the bow's quiver can only hold 30 arrows. Later on, Link can get his quiver upgraded to hold 60 and then 100 arrows. ");

        Item item16 = new Item("Horse Call", R.mipmap.horsecall,
                "When you reach the Hidden Village, you will be asked to take out 20 goblins. Kill them all and go to the old woman that exits the house. " +
                        "She will give you Ilia's Charm. Go to Ilia in Kakariko Village and show her the charm by setting it and pressing B. " +
                        "You will be shown a short video clip of her regaining her memory, she will reward you with the Horse Call.");

        Item item17 = new Item("Iron Boots", R.mipmap.ironboots,
                "The Iron Boots are, as they are called, boots made out iron. These boots will make you sink if you are in water, weigh you down when on land," +
                        " and prevent you from being knocked over from obstacles such as hot air vents or water currents. " +
                        "The boots' soles will be attracted to magnetic surfaces, allowing Link to defy gravity. You will obtain these After the Forest Temple.");

        Item item18 = new Item("Spinner", R.mipmap.spinner,
                "The spinner is an item that will be able to help you cross quicksand and thick snow. The spinner can also ride rails." +
                        " You can get the spinner by beating the mini-boss at Arbiter's Grounds.");

        Item item19 = new Item("Ooccoo", R.mipmap.ooccoo);

        Item item20 = new Item("Ooccoo Jr.", R.mipmap.ooccoojr);



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
