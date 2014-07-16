package com.example.dodo.terraapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class AmphibiansOverviewActivity extends Activity {

    private ArrayList<LinearLayout> layoutList;
    private ImageButton imageButtonDendrobates;
    private ImageButton imageButtonHyla;
    private ImageButton imageButtonSalamander;
    private ImageButton imageButtonToads;
    private ImageButton imageButtonDiv;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amphibians_overview);

        layoutList = new ArrayList<LinearLayout>();
        layoutList.add((LinearLayout) findViewById(R.id.amphibians_overview_activity_ll_dendrobates));
        layoutList.add((LinearLayout) findViewById(R.id.amphibians_overview_activity_ll_div));
        layoutList.add((LinearLayout) findViewById(R.id.amphibians_overview_activity_ll_hyla));
        layoutList.add((LinearLayout) findViewById(R.id.amphibians_overview_activity_ll_salamander));
        layoutList.add((LinearLayout) findViewById(R.id.amphibians_overview_activity_ll_toads));


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
