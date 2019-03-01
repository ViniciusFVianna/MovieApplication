package br.com.sudosu.movieapplication.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.sudosu.movieapplication.domain.TipoMove
import br.com.sudosu.movieapplication.extensions.addFragment
import br.com.sudosu.movieapplication.extensions.setupToolbar
import br.com.sudosu.movieapplication.fragments.MovesFragment
import kotlinx.android.synthetic.main.activity_moves.view.*
import kotlinx.android.synthetic.main.toolbar.view.*

class MovesActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_moves)
        val tipo = intent.getSerializableExtra("tipo") as TipoMove
        val title = getString(tipo.string)
        setupToolbar(R.id.toolbar, title, true)
        if(savedInstanceState == null){
            addFragment(R.id.container, MovesFragment())
        }
    }
}
