package com.ideultimate.projects.tester

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * Kotlin Android Activity linked to layout: res/layout/activity_main.xml
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}