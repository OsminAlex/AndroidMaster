package com.example.androidmaster.Sintaxis

fun main () {
    inmutableList()
    print("\n *** Separacion *** \n\n")
    mutableList()
}

fun inmutableList(){
    //listas

    val readOnly: List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())

    //filtrado

    val example = readOnly.filter { it.contains("a") }
    println(example)

    readOnly.forEach { weekday -> println(weekday)}
}

fun mutableList(){
    var weekDays: MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    weekDays.add( 0, "Osmin")

    println(weekDays)
}