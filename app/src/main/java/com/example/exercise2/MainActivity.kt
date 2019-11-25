package com.example.exercise2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      /*  findViewById<Button>(R.id.buttonCalculate).setOnClickListener(){
            calculateBMI(it)
        }

*/
        buttonCalculate.setOnClickListener(){
            //todo : calculate bmi

            val weight  = editTextWeight.text.toString().toDouble()
            val height  = editTextHeight.text.toString().toDouble()

            val bmi = weight / (height * height)

            //todo: display image &bmi result

            if (bmi <18.5){
                textViewBMI.text = "%.2f".format(bmi)
                imageViewProfile.setImageResource(R.drawable.under)
            }
            else if(bmi<24.9 && bmi>18.4){
                textViewBMI.text = "%.2f".format(bmi)
                imageViewProfile.setImageResource(R.drawable.normal)
            }
            else if(bmi> 25){
                textViewBMI.text = "%.2f".format(bmi)
                imageViewProfile.setImageResource(R.drawable.over)
            }
        }

        buttonReset.setOnClickListener(){
            imageViewProfile.setImageResource(R.drawable.empty)
            editTextHeight.text.clear()
            editTextWeight.text.clear()
            textViewBMI.setText("BMI : ")

            editTextWeight.requestFocus()
        }

    }

}

/*private fun calculateBMI(view: View){
    val weight = editTextWeight.text.toString().toDouble()

}
*/

