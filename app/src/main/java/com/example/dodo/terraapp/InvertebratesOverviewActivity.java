package com.example.dodo.terraapp;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class InvertebratesOverviewActivity extends Activity {

    private ArrayList<LinearLayout> layoutList;
    private ImageButton imageButtonScorpions;
    private ImageButton imageButtonSpiders;
    private ImageButton imageButtonPhasmids;
    private ImageButton imageButtonMantis;
    private ImageButton imageButtonAnts;
    private ImageButton imageButtonDiv;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invertebrates_overview);
        layoutList = new ArrayList<LinearLayout>();
        layoutList.add((LinearLayout) findViewById(R.id.invertebrates_overview_activity_ll_ants));
        layoutList.add((LinearLayout) findViewById(R.id.invertebrates_overview_activity_ll_div));
        layoutList.add((LinearLayout) findViewById(R.id.invertebrates_overview_activity_ll_mantis));
        layoutList.add((LinearLayout) findViewById(R.id.invertebrates_overview_activity_ll_phasmids));
        layoutList.add((LinearLayout) findViewById(R.id.invertebrates_overview_activity_ll_scorpions));
        layoutList.add((LinearLayout) findViewById(R.id.invertebrates_overview_activity_ll_spiders));

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
        //addListenerOnButton();

    }
    public void initComponents() {

        imageButtonScorpions = (ImageButton) findViewById(R.id.invertebrates_overview_activity_ib_scorpions);
        imageButtonSpiders = (ImageButton) findViewById(R.id.invertebrates_overview_activity_ib_spiders);
        imageButtonPhasmids = (ImageButton) findViewById(R.id.invertebrates_overview_activity_ib_phasmids);
        imageButtonMantis = (ImageButton) findViewById(R.id.invertebrates_overview_activity_ib_mantis);
        imageButtonAnts = (ImageButton) findViewById(R.id.invertebrates_overview_activity_ib_ants);
        imageButtonDiv = (ImageButton) findViewById(R.id.invertebrates_overview_activity_ib_div);

    }


}
