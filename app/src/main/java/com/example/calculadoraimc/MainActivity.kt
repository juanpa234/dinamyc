package com.example.calculadoraimc

import android.health.connect.datatypes.HeightRecord
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.slider.Slider
import org.w3c.dom.Text
import java.util.Locale
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    lateinit var heightSlider: Slider
    lateinit var heigthText:EditText
    lateinit var weightText:EditText
    lateinit var calculateButton:Button
    lateinit var resultTextView:TextView
    lateinit var plusButton: Button
    lateinit var lessButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        heightSlider=findViewById(R.id.slider)
        heigthText = findViewById(R.id.heigthEditText)
        weightText= findViewById(R.id.weightEditText)
        calculateButton=findViewById(R.id.calculateButton)
        resultTextView = findViewById(R.id.resultTextView)
        plusButton= findViewById(R.id.iconplusButton)
        lessButton= findViewById(R.id.iconlessButton)



        calculateButton.setOnClickListener {
            Log.i("MainActivity","he pulsado ek boton calcular")

            val heigth = heigthText.text.toString().toFloat()
            val weight= weightText.text.toString ().toFloat()
            val result= weight / (heigth / 100).pow(2)

            resultTextView.text= String.format(Locale.getDefault(), format = "%.2f", result )

            plusButton.setOnClickListener {
                Log.i("mainactivity","he pulsado el boton plus")
                val weight= weightText.text.toString ().toFloat()
                val result= weight / (heigth / 100).pow(2)



            }



        }


    }
}