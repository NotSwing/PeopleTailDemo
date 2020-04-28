package com.example.peopletailwireframes;

import android.text.Layout;
import android.widget.ArrayAdapter;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class challenge_Shelf_Adapter extends ArrayAdapter<String> {

    private final Activity context;
    private final ArrayList<String> months;
    private final ArrayList<ArrayList<Integer>> imageIDs;
    private final ArrayList<ArrayList<String>> titles;
    private final ArrayList<ArrayList<String>> dates;

    public challenge_Shelf_Adapter(Activity context, ArrayList<String>months, ArrayList<ArrayList<Integer>> imageIDs, ArrayList<ArrayList<String>> titles, ArrayList<ArrayList<String>> dates){
        super(context, R.layout.challenge_shelf, months);
        this.context = context;
        this.months = months;
        this.imageIDs = imageIDs;
        this.titles=titles;
        this.dates=dates;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View rowView = inflater.inflate(R.layout.challenge_shelf, null, true);

        TextView monthDisplay = rowView.findViewById(R.id.monthBox);
        monthDisplay.setText(months.get(position));

        RecyclerView list1 = rowView.findViewById(R.id.recycleBox);
        challengeListAdapter adapter = new challengeListAdapter(context, titles.get(position), dates.get(position), imageIDs.get(position));
        list1.setAdapter(adapter);

        return rowView;
    }

}
