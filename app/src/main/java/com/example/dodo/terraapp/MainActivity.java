package com.example.dodo.terraapp;


import java.util.ArrayList;

import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.os.Build;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

    private ImageButton imageButtonReptiles;
    private ImageButton imageButtonTurtles;
    private ImageButton imageButtonAmphibians;
    private ImageButton imageButtonInvertebrates;
    private ArrayList<LinearLayout> layoutList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layoutList = new ArrayList<LinearLayout>();
        layoutList.add((LinearLayout) findViewById(R.id.main_activity_ll_amphibians));
        layoutList.add((LinearLayout) findViewById(R.id.main_activity_ll_reptiles));
        layoutList.add((LinearLayout) findViewById(R.id.main_activity_ll_turtles));
        layoutList.add((LinearLayout) findViewById(R.id.main_activity_ll_invertebrates));
        android.view.Display display = ((android.view.WindowManager)getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        int width = display.getWidth()/2;    // set width to half
        int height = (int) (display.getHeight()/2.5);

        for(int i = 0; i< layoutList.size(); i++){
            android.view.ViewGroup.LayoutParams lp = layoutList.get(i).getLayoutParams();
            lp.width = width;
            lp.height = height;
            layoutList.get(i).setLayoutParams(lp);

        }

        //layoutList.get(i).setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT),1);
        initComponents();
        addListenerOnButton();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void initComponents() {

        imageButtonReptiles = (ImageButton) findViewById(R.id.main_activity_ib_reptiles);
        imageButtonTurtles = (ImageButton) findViewById(R.id.main_activity_ib_turtles);
        imageButtonAmphibians = (ImageButton) findViewById(R.id.main_activity_ib_amphibians);
        imageButtonInvertebrates = (ImageButton) findViewById(R.id.main_activity_ib_invertebrates);


    }

    public void addListenerOnButton(){

        imageButtonReptiles.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this,
                        ReptilesOverviewActivity.class);
                startActivity(intent);
            }
        });

        imageButtonAmphibians.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this,
                        AmphibiansOverviewActivity.class);
                startActivity(intent);
            }
        });

        imageButtonInvertebrates.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this,
                        InvertebratesOverviewActivity.class);
                startActivity(intent);
            }
        });

        imageButtonTurtles.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this,
                        TurtlesOverviewActivity.class);
                startActivity(intent);
            }
        });



    }



}
