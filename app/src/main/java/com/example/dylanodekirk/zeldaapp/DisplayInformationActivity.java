package com.example.dylanodekirk.zeldaapp;

import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayInformationActivity extends AppCompatActivity {

    String TAG = "DisplayInformation";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_information);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Toolbar toolbarDetails = (Toolbar) findViewById(R.id.toolbarDetails);
        ImageView imagedetails = (ImageView) findViewById(R.id.imagedetails);
        TextView descriptionTextView  = (TextView) findViewById(R.id.itemTextDescription);


        Bundle extras = getIntent().getExtras();
        String itemName = extras.getString("itemName");
        int imageSource = extras.getInt("itemPicture");
        String desc = extras.getString("description");

        Log.d(TAG, "onCreate: " + itemName + imageSource);
        toolbarDetails.setTitle(itemName);
        imagedetails.setImageResource(imageSource);
        if(! (desc.compareTo("") == 0)){
            descriptionTextView.setText(desc);
        }


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
