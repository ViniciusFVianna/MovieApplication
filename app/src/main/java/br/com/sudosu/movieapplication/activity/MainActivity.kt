package br.com.sudosu.movieapplication.activity

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import br.com.sudosu.movieapplication.R
import br.com.sudosu.movieapplication.domain.TipoMove
import br.com.sudosu.movieapplication.extensions.setupToolbar
import org.jetbrains.anko.startActivity

class MainActivity : BaseActivity(), NavigationView.OnNavigationItemSelectedListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupToolbar(R.id.toolbar)
        setupNavDrawer()
    }
    //Configura o Navigation Drawer
    private fun setupNavDrawer(){
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        val drawer = findViewById<DrawerLayout>(R.id.drawer_layout)
        val toggle = ActionBarDrawerToggle(
            this, drawer, toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close)
        drawer.addDrawerListener(toggle)
        toggle.syncState()
        val navigationView = findViewById<NavigationView>(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener (this)
    }
    //Trata o evento Navigation Drawer
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.nav_filmes ->{
                startActivity<MovesActivity>("tipo" to TipoMove.filme)
            }
        }
        //Fecha o menu depois de tratar p evento
        val drawer = findViewById<DrawerLayout>(R.id.drawer_layout)
        drawer.closeDrawer(GravityCompat.START)
        return true
    }
}