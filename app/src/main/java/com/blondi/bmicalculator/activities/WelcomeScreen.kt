package com.blondi.bmicalculator.activities

import android.content.Intent
import com.blondi.bmicalculator.R
import com.blondi.bmicalculator.ui.BaseActivity
import kotlinx.android.synthetic.main.activity_welcome_screen.*

class WelcomeScreen : BaseActivity() {
    override fun setupUI() {
        startAnimation()
        btnStart.setOnClickListener { startNewActivity() }
    }

    private fun startNewActivity() {
       startActivity(Intent(this,MainActivity::class.java))
        finish()
    }

    private fun startAnimation() {
        ivLogo.alpha=0f
        tvWelcomeMsg.alpha=0f
        btnStart.alpha=0f
        ivLogo.animate().alpha(1f).setStartDelay(200).duration = 200
        tvWelcomeMsg.animate().alpha(1f).setStartDelay(400).duration = 200
        btnStart.animate().alpha(1f).setStartDelay(600).duration = 200

    }

    override fun getLayoutId(): Int {
       return R.layout.activity_welcome_screen
    }


}
