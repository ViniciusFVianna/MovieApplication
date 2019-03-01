package br.com.sudosu.movieapplication.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import br.com.sudosu.movieapplication.R
import br.com.sudosu.movieapplication.domain.TipoMove

class MovesFragment : BaseFragment() {
   private  var tipo : TipoMove = TipoMove.destaque
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tipo = arguments?.getSerializable("tipo") as TipoMove
    }

    // Cria a view do fragment
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_moves, container, false)
        val textView = view?.findViewById<TextView>(R.id.text)
        val tipoString = getString(tipo.string)
        textView?.text ="Filme $tipoString"
        return view
    }
}
