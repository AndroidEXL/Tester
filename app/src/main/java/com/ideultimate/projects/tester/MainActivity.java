package com.ideultimate.projects.tester;

import android.app.Activity;
import android.os.Bundle;

/**
 * Java Android Activity linked to layout: res/layout/activity_main.xml
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}