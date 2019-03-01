package br.com.sudosu.movieapplication.domain

import br.com.sudosu.movieapplication.R

enum class TipoMove(val string: Int) {
    destaque(R.string.destaque),
    estreia(R.string.estreia),
    favorito(R.string.favorito),
    filme(R.string.nav_filmes),
}