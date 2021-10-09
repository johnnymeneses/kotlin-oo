package br.com.johnny.bytebank.modelo

import java.lang.Integer.parseInt

class referencia {
//    try as Expression
    val a: Int? = try { parseInt("d")} catch (e: NumberFormatException) {null}
}