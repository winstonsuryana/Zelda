package com.example.dylanodekirk.zeldaapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by dylanodekirk on 9/9/17.
 */

public class ListAdapater extends ArrayAdapter<Item> {

    public ListAdapater(Context context, ArrayList<Item> itemName) {
        super(context, R.layout.card_view_row, itemName);

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater myInflater = LayoutInflater.from(getContext());
        View customView = myInflater.inflate(R.layout.card_view_row, parent, false);

        Item item = getItem(position);
        TextView textDescription = (TextView) customView.findViewById(R.id.textDescription);
        ImageView imageView = (ImageView) customView.findViewById(R.id.imageView);




        textDescription.setText(item.getItemName());
        imageView.setImageResource(item.getImageSource());
        return customView;
    }

}
