package com.example.kotlinprcticas03.ejercicio1
fun main(){
    var x : serVivo= serVivo(3)
    var y : serVivo= serVivo(5)

    val mayordeserVivo = x.mayor(y)
    println("El servivo mas mayor es : $mayordeserVivo")

    val homer = Humano("homer", 34)
    val bart= Humano ("bart", 9)

    val mayorHumano = homer.mayor(bart)
    println("El simpson mas mayor es : $mayorHumano")
}