package com.blondi.bmicalculator.activities

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.blondi.bmicalculator.R
import com.blondi.bmicalculator.ui.BaseActivity
import com.blondi.bmicalculator.utils.Calculator
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : BaseActivity() {
var bmiCalculator:Calculator = Calculator()
private var weight : Float = 0f
private var height : Float = 0f
private var BMI : Float = 0f


    override fun setupUI() {

       retrieveData()
       calculateBMI()
       showResult()

    }

    private fun showResult() {
        tvResultBMI.text=BMI.toString()
        setImageAndMessage()
    }


    private fun setImageAndMessage() {
        if(BMI<18.5) {ivResult.setImageResource(R.drawable.underweight); tvMessage.text=getString(R.string.underweight); tvMessageTitle.text=getString(R.string.underWeightTitle)}
        if(BMI in 18.5..24.9) {ivResult.setImageResource(R.drawable.normal); tvMessage.text=getString(R.string.normal); tvMessageTitle.text=getString(R.string.normalTitle)}
        if(BMI in 25.0..29.9) {ivResult.setImageResource(R.drawable.obese); tvMessage.text=getString(R.string.obese); tvMessageTitle.text=getString(R.string.obeseTitle)}
        if(BMI>=30) {ivResult.setImageResource(R.drawable.extremly_obese); tvMessage.text=getString(R.string.extremely_obese); tvMessageTitle.text=getString(R.string.extremelyObeseTitle)}
    }

    private fun calculateBMI(){
        BMI =bmiCalculator.GetResult(weight,height)
    }

    private fun retrieveData() {
        weight = intent.getFloatExtra("Weight",0f)
        height = intent.getFloatExtra("Height",0f)
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_result
    }

}


