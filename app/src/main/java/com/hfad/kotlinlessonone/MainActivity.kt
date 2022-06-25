package com.hfad.kotlinlessonone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

//TODO - ЗАДАНИЯ :
// 1. Создать новый проект в Android Studio без поддержки Kotlin.
// 2. Сконфигурировать Kotlin в новом проекте (лучше вручную).
// 3. Перевести MainActivity на Kotlin.


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.text_view) // экран вывода информации
        // val textViewEquals: TextView = findViewById(R.id.text_data_class)
        // val textViewCopy: TextView = findViewById(R.id.text_copy)

// TODO - ЗАДАНИЕ
//  4. Добавить кнопку в разметку и повесить на неё clickListener в Activity.
//  5. Потренироваться в создании классов и функций, описанных в уроке, и убедиться, что всё
//  работает. Например, создать тестовое приложение:
//  a - Сформировать data class с двумя свойствами и вывести их на экран приложения.
//  b - Создать Object из пункта a) В этом Object вызвать copy и вывести значения скопированного класса на
//  экран.
        val button: Button = findViewById(R.id.btn)
        button.setOnClickListener {
            textView.text = "Привет Котлинист!!!))"
        }
        val text_data_class: TextView = findViewById(R.id.text_data_class)
        text_data_class.setOnClickListener {

            val dataClass = DataClassSome("Ivan", "Ivanov")
            val dataClass2 = DataClassSome("Alexey", "Alexeev")
            val dataClass3 = DataClassSome("Oleg", "Petrov", 25)

            val isEquals = dataClass == dataClass2

            textView.text = isEquals.toString()

            if (dataClass == dataClass2) {

                textView.text = "Обьекты DataClass - РАВНЫ"
            } else {
                textView.text = "Обьекты DataClass Оказались НЕ РАВНЫ"
            }
        }
        val text_copy: TextView = findViewById(R.id.text_copy)
        text_copy.setOnClickListener {

            var dataClass4 = DataClassSome("Ilia", "Hov")
            var dataClass5 = DataClassSome("Хомяк", "bobrov", 35)

            var dataClass6 =
                dataClass5.copy(name = "ИЗМЕНИЛ ИМЯ, a Фамилия и возраст скопировал у dataClass5")

            textView.text = dataClass6.toString()
        }

// TODO -
//  c - Вывести значения из разных циклов в консоль, используя примеры из методических
//  материалов
        var x = 5
        when (x) {
            0 -> Log.d("TAG", ("x равен 0"))
            1, 2 -> Log.d("TAG", ("x равен 1-2"))
            else -> {
                Log.d("TAG", ("x неравен значениям поиска"))
            }
        }

        for (y in 1..30) {
            Log.d("TAG", y.toString())
        }
        for (y in 1..30 step 2) {
            Log.d("TAG", y.toString())
        }
        var w = 1
        while (w < 10) {
            Log.d("TAG", ("цикл успешно выполнен"))
            w = w + 1
        }
    }

}

