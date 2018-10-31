package com.cristhian.demos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textview:TextView = findViewById(R.id.textview) as TextView
        val edittext:EditText = findViewById(R.id.edittext) as EditText
        val boton:Button = findViewById(R.id.boton) as Button

        boton.setOnClickListener(View.OnClickListener {
            textview .text = edittext.text })

    }
}
