package com.example.peopletailwireframes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class PeopleTailMainView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people_tail_main_view);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        createMenu(menu);
        return true;
    }
    private void createMenu(Menu menu)
    {
        //add(int groupID, int itemID, int order, CharSequence title
        MenuItem menuItem1 = menu.add(0, 0, 0, "Item 1");
        {
            menuItem1.setIcon(R.mipmap.ic_launcher);
            menuItem1.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        }
        MenuItem menuItem2 = menu.add(0, 1, 1, "Item 2");
        {
            menuItem2.setIcon(R.mipmap.ic_launcher);
            menuItem2.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        }
        MenuItem menuItem3 = menu.add(0, 2, 2, "Item 3");
        {
            menuItem3.setIcon(R.mipmap.ic_launcher);
            menuItem3.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        }
        MenuItem menuItem4 = menu.add(0, 3, 3, "Item 4");
        {
            menuItem4.setIcon(R.mipmap.ic_launcher);
            menuItem4.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        }
        MenuItem menuItem5 = menu.add(0, 4, 4, "Item 5");
        {
            menuItem5.setIcon(R.mipmap.ic_launcher);
            menuItem5.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        }
    }


    public void onClick(View view){

        switch (view.getId()){
            case R.id.home_button:

                Intent homeintent = new Intent(/*[thisactivity.java],*[homeactivity.class]*/);

                startActivity(homeintent);

                break;

            case R.id.search_button:
                Intent searchintent = new Intent(/*[thisactivity.java],[searchactivity.class]*/);

                startActivity(searchintent);
                break;

            case R.id.profile_button:

                Intent profileintent = new Intent(/*[thisactivity.java],[profileactivity.class]*/);

                startActivity(profileintent);

                break;

        }


    }
}
