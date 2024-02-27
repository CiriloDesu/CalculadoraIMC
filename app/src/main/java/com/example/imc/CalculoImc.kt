package com.example.imc

import kotlin.math.pow

fun calcularImc(pesoUsuario: Double, alturaUsuario: Double):Double {
    val imc = pesoUsuario / (alturaUsuario / 100).pow(2)
    return imc
}

fun obterStatusImc(imcUsuario: Double): String {
    val status = when {
        imcUsuario < 18.5 -> "Abaixo do peso"
        imcUsuario >= 18.5 && imcUsuario < 25.0 -> "Peso Ideal"
        imcUsuario >= 25.0 && imcUsuario < 30.0 -> "Levemente acima do peso"
        imcUsuario >= 30.0 && imcUsuario < 35.0 -> "Obesidade Grau I"
        imcUsuario >= 35.0 && imcUsuario < 40.0 -> "Obesidade Grau II"
        else -> "Obesidade Grau III"
    }
    return status
}