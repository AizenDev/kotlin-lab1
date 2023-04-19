package com.example.lab1


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val textView3 = findViewById<TextView>(R.id.textView3)
        val inputEditor = findViewById<EditText>(R.id.editTextText)
        val updateButton = findViewById<Button>(R.id.button)

        val exercise = NumbersExercise()

        textView.text = exercise.result


        updateButton.setOnClickListener {
            if (inputEditor.text.isNotEmpty()){
                val numbersExercise = exercise as NumbersExercise
                val amount = inputEditor.text.toString()
                val number = amount.toInt()
                exercise.number = number

                val result = numbersExercise.replaceElementsGreaterThanZ(numbersExercise.numbers,number).first.toString()
                textView2.text = result

                val ctn = numbersExercise.replaceElementsGreaterThanZ(numbersExercise.numbers,number).second.toString()
                textView3.text = ctn
            }
        }
    }
}

