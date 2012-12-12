package com.jayway.viewtutorial.part4;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class ViewTutorialActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final LineChartView lineChart = (LineChartView) findViewById(R.id.linechart);
        lineChart.setChartData(getWalkingData());

        findViewById(R.id.walkning_button).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                lineChart.setChartData(getWalkingData());
            }
        });
        findViewById(R.id.running_button).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                lineChart.setChartData(getRuningData());
            }
        });
        findViewById(R.id.cycling_button).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                lineChart.setChartData(getCyclingData());
            }
        });
    }

    private float[] getWalkingData() {
        return new float[] { 10, 12, 7, 14, 15, 19, 13, 2, 10, 13, 13, 10, 15, 14 };
    }

    private float[] getRuningData() {
        return new float[] { 22, 14, 20, 25, 32, 27, 26, 21, 19, 26, 24, 30, 29, 19 };
    }

    private float[] getCyclingData() {
        return new float[] { 0, 0, 0, 10, 14, 23, 40, 35, 32, 37, 41, 32, 18, 39 };
    }
}