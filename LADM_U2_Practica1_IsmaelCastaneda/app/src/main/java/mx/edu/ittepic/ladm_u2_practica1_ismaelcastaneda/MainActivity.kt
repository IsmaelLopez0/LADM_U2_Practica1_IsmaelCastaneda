package mx.edu.ittepic.ladm_u2_practica1_ismaelcastaneda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var lienzo : Lienzo ?= null
    var hilo = Hilo(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lienzo = Lienzo(this)
        setContentView(lienzo)

        hilo!!.start()
    }
}
