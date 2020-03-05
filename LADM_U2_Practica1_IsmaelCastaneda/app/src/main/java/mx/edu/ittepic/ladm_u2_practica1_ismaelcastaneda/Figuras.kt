package mx.edu.ittepic.ladm_u2_practica1_ismaelcastaneda

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path


class Figuras (){
    var x = 0f
    var y = 0f
    var tipo = 1 //1 -> Circulo, 2 -> Rectangulo, 3 -> Triangulo
    var radio = 0f
    var ancho = 0f
    var alto = 0f
    var x1 = 0f
    var x2 = 0f
    var x3 = 0f
    var y1 = 0f
    var y2 = 0f
    var y3 = 0f
    var incX = 20
    var incY = 5
    var b = false//false izquierda, true derecha

    constructor(x: Float, y: Float, radio: Float) : this() {
        this.x = x
        this.y = y
        this.radio = radio
    }

    constructor(x: Float, y: Float, ancho: Float, alto: Float) : this(){
        this.x = x
        this.y = y
        this.ancho = ancho
        this.alto = alto
        this.tipo = 2
    }

    constructor(x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float) : this() {
        this.x1 = x1
        this.y1 = y1
        this.x2 = x2
        this.y2 = y2
        this.x3 = x3
        this.y3 = y3
        this.tipo = 3
    }

    fun dibujar(c: Canvas, p: Paint){
        when(tipo){
            1 -> {
                c.drawCircle(x, y, radio, p)
            }
            2 -> {
                c.drawRect(x, y, x+ancho, y+alto, p)
            }
            3 -> {
                val path = Path()
                path.moveTo(x1, y1)
                path.lineTo(x2, y2)
                path.lineTo(x3, y3)
                path.close()
                c.drawPath(path, p)
            }
        }
    }

    fun mover(){
        when(tipo){
            1 -> {
                this.y += 10
            }
        }
    }

    fun caer(width: Int, height: Int){
        this.y += incY
        if(this.y>=height){
            this.y = 0f
        }
        this.x += incX
        incX *= -1
    }
}