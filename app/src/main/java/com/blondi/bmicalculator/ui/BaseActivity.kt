package com.blondi.bmicalculator.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by Enio on 5/4/2019.
 */
abstract class BaseActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        setupUI()
    }

    abstract fun setupUI()

    abstract fun getLayoutId(): Int
}