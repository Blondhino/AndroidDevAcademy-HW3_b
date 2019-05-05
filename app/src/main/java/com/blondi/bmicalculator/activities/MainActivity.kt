package com.blondi.bmicalculator.activities

import android.content.Intent
import android.widget.Toast
import com.blondi.bmicalculator.R
import com.blondi.bmicalculator.ui.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun setupUI() {
        btnCalculate.setOnClickListener { prepareResultActivity() }
    }

    private fun prepareResultActivity() {
        val intent = Intent(this, ResultActivity::class.java)
        if (isAllCorrect()){
        intent.putExtra("Weight", etMass.text.toString().toFloat())
        intent.putExtra("Height", etHeight.text.toString().toFloat())
        startActivity(intent)
        etHeight.text = null
        etMass.text=null }
    }

    private fun isAllCorrect(): Boolean {
      if (etHeight.text.toString().trim().isEmpty() || etMass.text.toString().trim().isEmpty()) {
          Toast.makeText(this,getString(R.string.error1), Toast.LENGTH_SHORT).show()
          return false}

      if (etHeight.text.toString().toFloat()<=0 || etMass.text.toString().toFloat()<=0 ){
          Toast.makeText(this,getString(R.string.error2), Toast.LENGTH_SHORT).show()
          return false}

      if (etHeight.text.toString().toFloat()>2.5 || etMass.text.toString().toFloat()>350 ){
          Toast.makeText(this,getString(R.string.error2), Toast.LENGTH_SHORT).show()
          return false}

      if (etHeight.text.toString().toFloat()<0.8 || etMass.text.toString().toFloat()<10 ){
          Toast.makeText(this,getString(R.string.error2), Toast.LENGTH_SHORT).show()
          return false}


        return true
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }


}
