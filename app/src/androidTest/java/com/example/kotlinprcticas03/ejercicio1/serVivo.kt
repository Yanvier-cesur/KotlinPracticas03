package com.example.kotlinprcticas03.ejercicio1

open class serVivo(var edad: Byte) {

    open fun equals(otro: serVivo): Boolean {
        return this.edad == otro.edad
    }

    open fun mayor(otro: serVivo): serVivo {
        if (this.edad >= otro.edad) {
            return this
        } else {
            return otro
        }
    }

    override fun toString(): String {
        return "$edad"
    }
}