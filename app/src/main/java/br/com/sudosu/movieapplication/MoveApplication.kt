package br.com.sudosu.movieapplication

import android.app.Application
import android.util.Log

class MoveApplication  : Application() {
    private val TAG = "TravelApplication"
    override fun onCreate() {
        super.onCreate()
        //Salva a instância para termos acesso como singleton
        appInstance = this
    }
    companion object {
        //Singleton de aplication
        private var appInstance: MoveApplication? = null
        fun getInstance(): MoveApplication{
            if(appInstance == null){
                throw IllegalStateException("Configure a classe de Application no AndroidManifest.xml")
            }
            return appInstance!!
        }
    }

    override fun onTerminate() {
        super.onTerminate()
        Log.d(TAG, "MoveApplication.onTerminate()")
    }
}