package com.example.dodo.terraapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class ReptilesOverviewActivity extends Activity {

    private ArrayList<LinearLayout> layoutList;
    private ImageButton imageButtonSnakes;
    private ImageButton imageButtonChameleons;
    private ImageButton imageButtonGeckos;
    private ImageButton imageButtonAgamidsIguanas;
    private ImageButton imageButtonVaranids;
    private ImageButton imageButtonDiv;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reptiles_overview);
        layoutList = new ArrayList<LinearLayout>();
        layoutList.add((LinearLayout) findViewById(R.id.reptiles_overview_activity_ll_agamids_iguanas));
        layoutList.add((LinearLayout) findViewById(R.id.reptiles_overview_activity_ll_chameleons));
        layoutList.add((LinearLayout) findViewById(R.id.reptiles_overview_activity_ll_div));
        layoutList.add((LinearLayout) findViewById(R.id.reptiles_overview_activity_ll_geckos));
        layoutList.add((LinearLayout) findViewById(R.id.reptiles_overview_activity_ll_snakes));
        layoutList.add((LinearLayout) findViewById(R.id.reptiles_overview_activity_ll_varanids));



        android.view.Display display = ((android.view.WindowManager)getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        int width = display.getWidth()/2;    // set width to half
        int height = (int) (display.getHeight()/2.5);

        for(int i = 0; i< layoutList.size(); i++){
            android.view.ViewGroup.LayoutParams lp = layoutList.get(i).getLayoutParams();
            lp.width = width;
            lp.height = height;
            layoutList.get(i).setLayoutParams(lp);

        }



    }


}
