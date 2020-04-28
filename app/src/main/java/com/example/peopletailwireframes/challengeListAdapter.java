/*


This as all me (Andrew) working on trying to get the inflator set up for the ChallengesPage.
My IDE shows no errors but I cannot test the page because the project is not finished, aswell my computer is likely not strong enough.


 */
//Begining test

package com.example.peopletailwireframes;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class challengeListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final Activity context;
    private final ArrayList<String> itemTitle;
    private final ArrayList<String> dueDate;
    private final ArrayList<Integer> imgID;

    ArrayList<String> list = new ArrayList<>();

    public challengeListAdapter(Activity context, ArrayList<String> itemTitle, ArrayList<String> dueDate, ArrayList<Integer> imgID) { // you can pass other parameters in constructor
        this.context = context;
        this.itemTitle = itemTitle;
        this.dueDate = dueDate;
        this.imgID = imgID;
    }

    private class CustomAdapterItemView extends RecyclerView.ViewHolder {
        final TextView textView;

        CustomAdapterItemView(final View itemView) {
            super(itemView);
            textView = (TextView) itemView;
        }

        void bind(int position) {
            textView.setText("");
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CustomAdapterItemView(LayoutInflater.from(context).inflate(R.layout.challenges, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((CustomAdapterItemView) holder).bind(position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.challenges, null, true);

        ImageView imageView = rowView.findViewById(R.id.challengeImg);
        imageView.setImageResource(imgID.get(position));

        TextView txtTitle = rowView.findViewById(R.id.challengeName);
        txtTitle.setText(itemTitle.get(position));

        TextView extraTxt = rowView.findViewById(R.id.challengeDate);
        extraTxt.setText("Description " + dueDate.get(position));

        return rowView;
    }
}
//End test
