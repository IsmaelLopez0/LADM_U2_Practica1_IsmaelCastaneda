package mx.edu.ittepic.ladm_u2_practica1_ismaelcastaneda

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class Lienzo (p: MainActivity) : View(p){

    var puntero = p

    var pasto = Figuras(0f, 1600f, 1080f, 487f)
    var casa = Figuras(440f, 1300f, 500f, 400f)
    var puerta = Figuras(700f, 1500f, 85f, 200f)
    var techo = Figuras(400f, 1300f, 690f, 1100f, 980f, 1300f)
    var ventana = Figuras(550f, 1400f, 75f)

    var tronco = Figuras(150f, 1500f, 75f, 200f)
    var hojas1 = Figuras(180f, 1450f, 100f)
    var hojas2 = Figuras(180f, 1325f, 100f)

    var sol = Figuras(1000f, 20f, 250f)

    var nube1 = Figuras(150f, 350f, 100f)
    var nube2 = Figuras(250f, 300f, 100f)
    var nube3 = Figuras(250f, 400f, 100f)
    var nube4 = Figuras(350f, 350f, 100f)

    var w = 1080
    var copo1 = Figuras((w/2).toFloat(), -50f, 30f)
    var copo2 = Figuras((w/4).toFloat(), -500f, 30f)
    var copo3 = Figuras(((w/4)*3).toFloat(), -350f, 30f)
    var copo4 = Figuras(((w/5)*3).toFloat(), -270f, 30f)
    var copo5 = Figuras(((w/5)*2).toFloat(), -400f, 30f)
    var copo6 = Figuras(((w/6)*4).toFloat(), -700f, 30f)
    var copo7 = Figuras(((w/5)*2).toFloat(), -520f, 30f)
    var copo8 = Figuras(((w/5)*4).toFloat(), -220f, 30f)
    var copo9 = Figuras(((w/4)).toFloat(), -230f, 30f)
    var copo10 = Figuras(((w/4)*3).toFloat(), -100f, 30f)

    //Lienzo de 1080 - 2087
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()

        canvas.drawColor(Color.rgb(0, 188, 212))

        paint.color = Color.GREEN
        pasto.dibujar(canvas, paint)

        paint.color = Color.YELLOW
        casa.dibujar(canvas, paint)

        paint.color = Color.GRAY
        puerta.dibujar(canvas, paint)

        paint.color = Color.RED
        techo.dibujar(canvas, paint)

        paint.color = Color.LTGRAY
        ventana.dibujar(canvas, paint)

        paint.color = Color.rgb(112, 76, 76)
        tronco.dibujar(canvas, paint)

        paint.color = Color.rgb(76, 175, 80)
        hojas1.dibujar(canvas, paint)
        hojas2.dibujar(canvas, paint)

        paint.color = Color.YELLOW
        sol.dibujar(canvas, paint)

        paint.color = Color.WHITE
        nube1.dibujar(canvas, paint)
        nube2.dibujar(canvas, paint)
        nube3.dibujar(canvas, paint)
        nube4.dibujar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        copo1.dibujar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 5f
        paint.color = Color.BLACK
        copo1.dibujar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        copo2.dibujar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 5f
        paint.color = Color.BLACK
        copo2.dibujar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        copo3.dibujar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 5f
        paint.color = Color.BLACK
        copo3.dibujar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        copo4.dibujar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 5f
        paint.color = Color.BLACK
        copo4.dibujar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        copo5.dibujar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 5f
        paint.color = Color.BLACK
        copo5.dibujar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        copo6.dibujar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 5f
        paint.color = Color.BLACK
        copo6.dibujar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        copo7.dibujar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 5f
        paint.color = Color.BLACK
        copo7.dibujar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        copo8.dibujar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 5f
        paint.color = Color.BLACK
        copo8.dibujar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        copo9.dibujar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 5f
        paint.color = Color.BLACK
        copo9.dibujar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        copo10.dibujar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 5f
        paint.color = Color.BLACK
        copo10.dibujar(canvas, paint)

    }

    fun animar(){
        copo1.caer(width, height)
        copo2.caer(width, height)
        copo3.caer(width, height)
        copo4.caer(width, height)
        copo5.caer(width, height)
        copo6.caer(width, height)
        copo7.caer(width, height)
        copo8.caer(width, height)
        copo9.caer(width, height)
        copo10.caer(width, height)
        invalidate()
    }
}