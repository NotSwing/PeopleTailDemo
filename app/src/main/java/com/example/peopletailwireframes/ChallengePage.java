package com.example.peopletailwireframes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ChallengePage extends AppCompatActivity {

    // images of first list

    ArrayList<ArrayList<Integer>> importImages = new ArrayList<ArrayList<Integer>>();
    ArrayList<ArrayList<String>> importTitles = new ArrayList<ArrayList<String>>();
    ArrayList<ArrayList<String>> importDates = new ArrayList<ArrayList<String>>();

    ArrayList<Integer> imgID = new ArrayList<Integer>() {{
    imgID.add(R.drawable.gooper);
    imgID.add(R.drawable.gooper);
    imgID.add(R.drawable.gooper);
    }};


    //images of second list
    ArrayList<Integer> imgID2 = new ArrayList<Integer>() {{
        imgID.add(R.drawable.gooper);
        imgID.add(R.drawable.gooper);
        imgID.add(R.drawable.gooper);
    }};

    //images of third list
    ArrayList<Integer> imgID3 = new ArrayList<Integer>() {{
        imgID.add(R.drawable.gooper);
        imgID.add(R.drawable.gooper);
        imgID.add(R.drawable.gooper);
    }};


    //titles of first list items
    ArrayList<String> itemTitle = new ArrayList<String>(){{
        itemTitle.add("gooperSpecial1");
        itemTitle.add("gooperSpecial2");
        itemTitle.add("gooperSpecial3");
    }};


    //titles of second list items
    ArrayList<String> itemTitle2 = new ArrayList<String>(){{
        itemTitle.add("gooperSpecial1");
        itemTitle.add("gooperSpecial2");
        itemTitle.add("gooperSpecial3");
    }};

    //titles of thrid list items
    ArrayList<String> itemTitle3 = new ArrayList<String>(){{
        itemTitle.add("gooperSpecial1");
        itemTitle.add("gooperSpecial2");
        itemTitle.add("gooperSpecial3");
    }};


    //due dates of first list items
    ArrayList<String> dueDate = new ArrayList<String>(){{
        itemTitle.add("Due the 24th");
        itemTitle.add("Due the 25th");
        itemTitle.add("Due the 26th");
    }};

    //due dates of second list items
    ArrayList<String> dueDate2 = new ArrayList<String>(){{
        itemTitle.add("Due the 24th");
        itemTitle.add("Due the 25th");
        itemTitle.add("Due the 26th");
    }};

    //due dates of third list items
    ArrayList<String> dueDate3 = new ArrayList<String>(){{
        itemTitle.add("Due the 24th");
        itemTitle.add("Due the 25th");
        itemTitle.add("Due the 26th");
    }};

    ArrayList<String> months = new ArrayList<String>(){{
        itemTitle.add("January");
        itemTitle.add("February");
        itemTitle.add("March");
    }};


    ListView list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge_page);
        importImages.add(imgID);
        importImages.add(imgID2);
        importImages.add(imgID3);
        importTitles.add(itemTitle);
        importTitles.add(itemTitle2);
        importTitles.add(itemTitle3);
        importDates.add(dueDate);
        importDates.add(dueDate2);
        importDates.add(dueDate3);


        ListView list1 = findViewById(R.id.lister);
        final challenge_Shelf_Adapter adapter = new challenge_Shelf_Adapter(this, months, importImages, importTitles, importDates);
        list1.setAdapter(adapter);


    }
}
