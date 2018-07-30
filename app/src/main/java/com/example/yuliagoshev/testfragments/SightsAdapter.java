package com.example.yuliagoshev.testfragments;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SightsAdapter extends ArrayAdapter<Palaces> {
    private int mColorResourceId;


    public SightsAdapter(Context context, ArrayList<Palaces> names, int ColorResourceId) {
        super(context, 0,names);
        mColorResourceId=ColorResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link Word} object located at this position in the list
        Palaces currentName = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView nameSights = (TextView) listItemView.findViewById(R.id.text_view);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        nameSights.setText(currentName.getNamesSights());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
        // Check if an image is provided for this word or not
        imageView.setImageResource(currentName.getImageResourceId());

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
