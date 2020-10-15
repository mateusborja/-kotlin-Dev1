package com.mateusborja.kotlindev1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun botaoClique(view: View) {
        var texto = findViewById(R.id.text1view1) as TextView
        texto.setText("Eu vou conseguir!")
    }


}