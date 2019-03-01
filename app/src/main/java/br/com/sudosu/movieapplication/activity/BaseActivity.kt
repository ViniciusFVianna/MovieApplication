package br.com.sudosu.movieapplication.activity

import android.content.Context
import android.support.v7.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {
    //Propriedade para acessar o contexto de qualquer lugar
    protected val context: Context get() = this
    //Métodos comuns para todas activities aqui...
}