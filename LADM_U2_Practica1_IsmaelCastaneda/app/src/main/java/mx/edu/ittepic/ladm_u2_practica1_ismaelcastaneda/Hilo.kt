package mx.edu.ittepic.ladm_u2_practica1_ismaelcastaneda

class Hilo (p: MainActivity) : Thread(){
    var inicio = false
    var puntero = p

    override fun run() {
        super.run()
        while(true){
            sleep(100)
            puntero.runOnUiThread {
                if(!inicio){
                    sleep(8000)
                    inicio = true
                }else{
                    puntero.lienzo!!.animar()
                }
            }
        }
    }
}