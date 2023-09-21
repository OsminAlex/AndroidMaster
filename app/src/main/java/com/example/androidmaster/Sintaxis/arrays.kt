package com.example.androidmaster.Sintaxis

fun main () {

    //Arrays - Arreglos

    val weekDays = arrayListOf<String>("Jose", "Mario", "Carlos", "Juan", "Miguel")

    //Agregar un valor al final del array
    weekDays.add("Leonardo")

    println(weekDays)

    //reemplzar un determinado valor indicando su indice y el nuevo valor
    weekDays.set(5, "Osmin")

    println(weekDays)

    var count = 1
    for (i in weekDays){
        println("$count - $i")
        count++
    }

    print("\n")

    for((position, value) in weekDays.withIndex()){
        println("la posicion $position contiene $value")
    }
}