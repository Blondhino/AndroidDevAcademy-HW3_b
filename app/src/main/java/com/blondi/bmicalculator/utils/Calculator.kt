package com.blondi.bmicalculator.utils

import android.util.Log

/**
 * Created by Enio on 5/4/2019.
 */
class Calculator {

     fun GetResult(weight: Float, height : Float):Float{

         val doubleHeight = height*2
         //val doubleHeight = height*height  //<--- koristiti ovu funkciju ako je u PDF-u za zadacu greska

        return weight/doubleHeight

    }

}