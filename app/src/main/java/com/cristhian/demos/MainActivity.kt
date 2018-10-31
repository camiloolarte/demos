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

        val textview:TextView = findViewById<TextView>(R.id.textview)
        val edittext:EditText = findViewById<EditText>(R.id.edittext)
        val boton:Button = findViewById<Button>(R.id.boton)

        boton.setOnClickListener {
            var num = edittext.text
            if (num.toString().toInt() > 10){
                textview.text = "es mayor de 10"
            }else{
               textview.text = "es menor a 10"
            }
        }

    }
}
