package com.g_lova.countclicker

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    private var count = 0 // Переменная для хранения счёта
    private val step = 4  // Основной шаг


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvCounter = findViewById<TextView>(R.id.tvCounter)
        val btnMain = findViewById<Button>(R.id.btnMain)
        val btnPlus3 = findViewById<Button>(R.id.btnPlus3)
        val btnPlus2 = findViewById<Button>(R.id.btnPlus2)
        val btnPlus1 = findViewById<Button>(R.id.btnPlus1)
        val btnMinus1 = findViewById<Button>(R.id.btnMinus1)
        val btnMinus2 = findViewById<Button>(R.id.btnMinus2)
        val btnMinus3 = findViewById<Button>(R.id.btnMinus3)
        val btnReset = findViewById<Button>(R.id.btnReset)

        // Основная кнопка увеличения
        btnMain.setOnClickListener {
            updateCounter(tvCounter, step)
        }

        // Кнопки изменения счёта
        btnPlus3.setOnClickListener { updateCounter(tvCounter, 3) }
        btnPlus2.setOnClickListener { updateCounter(tvCounter, 2) }
        btnPlus1.setOnClickListener { updateCounter(tvCounter, 1) }
        btnMinus1.setOnClickListener { updateCounter(tvCounter, -1) }
        btnMinus2.setOnClickListener { updateCounter(tvCounter, -2) }
        btnMinus3.setOnClickListener { updateCounter(tvCounter, -3) }

        // Кнопка сброса
        btnReset.setOnClickListener {
            count = 0
            tvCounter.text = count.toString()
        }
    }

    // Метод для обновления счёта
    private fun updateCounter(tvCounter: TextView, value: Int) {
        count += value
        tvCounter.text = count.toString()
    }
}