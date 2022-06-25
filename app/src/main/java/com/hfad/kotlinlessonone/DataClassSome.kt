package com.hfad.kotlinlessonone

data class DataClassSome(val name: String, val lastNam: String) { //первичный конст-р

    var age: Int = 0

    constructor(name: String, lastNam: String, age: Int) : this(name, lastNam) //вторичный конст-р

    // В сравнении DataClass участвуют только парамметры переданные в основной конст-р
    // var age: Int = 0 - это уже сравнить не получится
}




