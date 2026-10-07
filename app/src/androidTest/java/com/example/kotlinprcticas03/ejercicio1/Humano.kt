package com.example.kotlinprcticas03.ejercicio1

class Humano (var nombre: String, var edad: Byte) {

    open fun equals(otro: Humano): Boolean {
        return this.edad == otro.edad && return this.nombre == otro.nombre
    }

    open fun mayor(otro: Humano): Humano {
        if (this.edad > otro.edad) {
            return this
        } else if (otro.edad > this.edad) {
            return otro
        } else if (this.nombre.length >= otro.nombre.length) {
                return this
            } else {
                return otro
            }
        }
        override fun toString(): String {
            return "$nombre y $edad"
        }
    }