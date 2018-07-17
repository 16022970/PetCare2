package com.example.a16022970.petcare2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private static RecyclerView recyclerView;
    private static ArrayList<Pets> petList;
    static View.OnClickListener myOnClickListener;
    private static ArrayList<Integer> removedItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();

                //go to add activity for user to add pet to the list
                Intent intent = new Intent(MainActivity.this,AddActivity.class );
                startActivity(intent);

            }
        });

        //set recycler view here
        myOnClickListener = new MyOnClickListener(this);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        petList = new ArrayList<Pets>();
        for (int i = 0; i < Pets.nameArray.length; i++) {
            petList.add(new Pets(
                    Pets.nameArray[i],
                    Pets.breedArray[i]
            ));
        }

        adapter = new CustomAdapter(petList);
        recyclerView.setAdapter(adapter);



    }

    private class MyOnClickListener implements View.OnClickListener {

        private final Context context;

        private MyOnClickListener(Context context) {
            this.context = context;
        }
        @Override
        public void onClick(View v){
            Intent intent = new Intent(MainActivity.this, ReminderPage.class);
            startActivity(intent);
        }
    }



    //options menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            Intent i = new Intent(MainActivity.this, SettingsActivity.class);
            startActivity(i);
        }else if(id == R.id.action_petstore){
            Intent i = new Intent(MainActivity.this, MapsActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}
